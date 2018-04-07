package hackbmu.statusquo.FourButton;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import hackbmu.statusquo.R;

public class HelpSomeoneActivity extends AppCompatActivity {

    TextView currLocTextView;
    Button sendButton;
    EditText messageEditText;
    private double latitude;
    private double longitude;
    private String hardID;
//    private DatabaseReference mDatabaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_someone_button);

        currLocTextView = findViewById(R.id.tv_curr_loc);
        sendButton = findViewById(R.id.btn_help_someone);
        messageEditText = findViewById(R.id.et_help_text);

        messageEditText.setFocusable(false);
//        messageEditText.setInputType(InputType.TYPE_NULL);

        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        if (bd != null) {
            latitude = bd.getDouble("lati");
            longitude = bd.getDouble("longi");
            hardID = bd.getString("hardID");
            Toast.makeText(this, ""+ latitude + "   " + longitude + "   " + hardID, Toast.LENGTH_SHORT).show();
            currLocTextView.setText("Your current location is " + latitude + " and " + longitude);
        }

//        mDatabaseReference = FirebaseDatabase.getInstance().getReference().child("check");

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HelpSomeoneActivity.this, "Send Message!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
