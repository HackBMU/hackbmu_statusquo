package hackbmu.statusquo;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import hackbmu.statusquo.FourButton.AccidentProneAreasActivity;
import hackbmu.statusquo.FourButton.HelpSomeoneButton;
import hackbmu.statusquo.FourButton.MyHelmetActivity;

public class FourButtonActivity extends AppCompatActivity {

    Button helpSomeoneButton, myHelmetButton, accidentProneAreasButton;
    int radius = 35;
    int strokeWidth = 5;
    int color = Color.rgb(133, 237, 125);

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


    }
}
