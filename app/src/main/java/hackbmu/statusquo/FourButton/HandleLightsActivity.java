package hackbmu.statusquo.FourButton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import hackbmu.statusquo.R;

public class HandleLightsActivity extends AppCompatActivity {

    String rfid = "10004AFA2C8C";
    Button submitButton;
    EditText tagIDEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handle_lights);

        tagIDEditText = findViewById(R.id.et_rfid);
        submitButton = findViewById(R.id.btn_rfid);

        tagIDEditText.setText("10004AFA2C8C");

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tagIDEditText.getText().toString().equals(rfid)) {
                    Toast.makeText(HandleLightsActivity.this, "You have entered a registered ID.", Toast.LENGTH_SHORT).show();
                }
                tagIDEditText.setText("");
            }
        });
    }
}
