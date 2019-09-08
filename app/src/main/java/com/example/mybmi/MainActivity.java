package com.example.mybmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button cal = (Button) findViewById(R.id.calculate);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,BmiResult.class);
                EditText e_age = (EditText)findViewById(R.id.age);
                EditText e_weight = (EditText)findViewById(R.id.weight);
                EditText e_feet = (EditText)findViewById(R.id.feet);
                EditText e_inch = (EditText)findViewById(R.id.inch);

                i.putExtra("age",e_age.getText().toString());
                i.putExtra("weight",e_weight.getText().toString());
                i.putExtra("feet",e_feet.getText().toString());
                i.putExtra("inch",e_inch.getText().toString());

                startActivity(i);


            }
        });
        }
}
