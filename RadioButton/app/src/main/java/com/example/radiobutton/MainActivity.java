package com.example.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rb1, rb2;
    Button btn;

    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1 = findViewById(R.id.radioButton1);
        rb2 = findViewById(R.id.radioButton2);
        btn = findViewById(R.id.button);
        

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (rb1.isChecked())
                {
                    result = rb1.getText().toString();
                }
                else
                {
                    result = rb2.getText().toString();
                }

                Toast.makeText(MainActivity.this, "Result is "+result, Toast.LENGTH_SHORT).show();


            }
        });

    }
}
