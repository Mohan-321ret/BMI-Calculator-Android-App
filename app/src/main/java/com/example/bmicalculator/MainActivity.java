package com.example.bmicalculator;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    EditText etheight,etweight,etage;
    TextView textView7,textView8;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this, android.R.color.holo_orange_light));
        getSupportActionBar().hide();

        etage = findViewById(R.id.etage);
        etweight = findViewById(R.id.etweight);
        etheight = findViewById(R.id.etheight);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        button = findViewById(R.id.button);




button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        float result ;


         float calweight = Float.parseFloat(String.valueOf(etweight.getText()));
        float calheight = Float.parseFloat(String.valueOf(etheight.getText()));

        result = calweight / (calheight * calheight);
        textView7.setText(String.valueOf(result));


            if (result  < 18.5) {
                textView8.setText("Your Are Underweight \uD83E\uDD15");
            } else if (result >= 18.5 && result < 24.9) {
                textView8.setText("Your Are Healthy \uD83D\uDCAA") ;
            } else if (result >= 25 && result < 29.9) {
                textView8.setText("Your Are Overweight ☹️") ;
            }  else {
                textView8.setText ("Your Are Obesity \uD83D\uDE27") ;
            }

    }
});


    }


}