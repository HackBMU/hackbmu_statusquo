package hackbmu.statusquo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

import hackbmu.statusquo.FourButton.AccidentProneAreasActivity;
import hackbmu.statusquo.FourButton.HelpSomeoneButton;
import hackbmu.statusquo.FourButton.MyHelmetActivity;

import static com.google.android.gms.plus.PlusOneDummyView.TAG;

public class FourButtonActivity extends Activity implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    Button helpSomeoneButton, myHelmetButton, accidentProneAreasButton;
    int radius = 35;
    int strokeWidth = 5;
    int color = Color.rgb(133, 237, 125);
    private final static int PLAY_SERVICES_RESOLUTION_REQUEST = 1000;

    private Location mLastLocation;

    // Google client to interact with Google API
    private GoogleApiClient mGoogleApiClient;

    // boolean flag to toggle periodic location updates
    private boolean mRequestingLocationUpdates = false;

    private LocationRequest mLocationRequest;

    // Location updates intervals in sec
    private static int UPDATE_INTERVAL = 10000; // 10 sec
    private static int FATEST_INTERVAL = 5000; // 5 sec
    private static int DISPLACEMENT = 10; // 10 meters

    // UI elements
    private TextView lblLocation;
    private Button btnShowLocation, btnStartLocationUpdates;
    private double latitude;
    private double longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_button);

        helpSomeoneButton = findViewById(R.id.btn_help_someone);
        myHelmetButton = findViewById(R.id.btn_my_helmet);
        accidentProneAreasButton = findViewById(R.id.btn_accident_prone_areas);


        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(radius);
        gradientDrawable.setStroke(strokeWidth, color);
        helpSomeoneButton.setBackground(gradientDrawable);
        myHelmetButton.setBackground(gradientDrawable);
        accidentProneAreasButton.setBackground(gradientDrawable);

        helpSomeoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FourButtonActivity.this, HelpSomeoneButton.class);
                startActivity(i);
            }
        });

        myHelmetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FourButtonActivity.this, MyHelmetActivity.class);
                startActivity(i);
            }
        });

        accidentProneAreasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FourButtonActivity.this, AccidentProneAreasActivity.class);
                startActivity(i);
            }
        });




            // First we need to check availability of play services
            if (checkPlayServices()) {

                // Building the GoogleApi client
                buildGoogleApiClient();
            }

            // Show location button click listener
           displayLocation();
        }

        /**
         * Method to display the location on UI
         * */
        @SuppressLint("MissingPermission")
        private void displayLocation() {


            mLastLocation = LocationServices.FusedLocationApi
                    .getLastLocation(mGoogleApiClient);

            if (mLastLocation != null) {
                 latitude = mLastLocation.getLatitude();
                 longitude = mLastLocation.getLongitude();
                 String k= "longitude"+longitude+"lattitude"+latitude;

                 Toast.makeText(FourButtonActivity.this,k,Toast.LENGTH_SHORT).show();

            } else {


                       Toast.makeText(FourButtonActivity.this,"(Couldn't get the location. Make sure location is enabled on the device)",Toast.LENGTH_SHORT).show();
            }
        }

        /**
         * Creating google api client object
         * */
        protected synchronized void buildGoogleApiClient() {
            mGoogleApiClient = new GoogleApiClient.Builder(this)
                    .addConnectionCallbacks(this)
                    .addOnConnectionFailedListener(this)
                    .addApi(LocationServices.API).build();
        }

        /**
         * Method to verify google play services on the device
         * */
        private boolean checkPlayServices() {
            int resultCode = GooglePlayServicesUtil
                    .isGooglePlayServicesAvailable(this);
            if (resultCode != ConnectionResult.SUCCESS) {
                if (GooglePlayServicesUtil.isUserRecoverableError(resultCode)) {
                    GooglePlayServicesUtil.getErrorDialog(resultCode, this,
                            PLAY_SERVICES_RESOLUTION_REQUEST).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "This device is not supported.", Toast.LENGTH_LONG)
                            .show();
                    finish();
                }
                return false;
            }
            return true;
        }

        @Override
        protected void onStart() {
            super.onStart();
            if (mGoogleApiClient != null) {
                mGoogleApiClient.connect();
            }
        }

        @Override
        protected void onResume() {
            super.onResume();

            checkPlayServices();
        }

        /**
         * Google api callback methods
         */
        @Override
        public void onConnectionFailed(ConnectionResult result) {
            Log.i(TAG, "Connection failed: ConnectionResult.getErrorCode() = "
                    + result.getErrorCode());
        }

        @Override
        public void onConnected(Bundle arg0) {

            // Once connected with google api, get the location
            displayLocation();
        }

        @Override
        public void onConnectionSuspended(int arg0) {
            mGoogleApiClient.connect();
        }


    }

