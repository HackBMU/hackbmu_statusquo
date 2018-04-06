package hackbmu.statusquo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText email,pass,hardId;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email= findViewById(R.id.email);
        pass=findViewById(R.id.password);
        hardId=findViewById(R.id.hard_id);
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().equals("sk@gmail.com") && pass.getText().toString().equals("112233")){
             startActivity(new Intent(LoginActivity.this,MainActivity.class).putExtra("hardId","abcd"));
                }
            }
        });




    }
}
