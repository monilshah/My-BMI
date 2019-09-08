package com.example.mybmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.os.Build.VERSION_CODES.M;

public class BmiResult extends AppCompatActivity {

    String age,weight,feet,inch;
    Double ft,in,mt,bmi,wt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_result);
        Intent i2 = getIntent();
        age = i2.getStringExtra("age");
        weight = i2.getStringExtra("weight");
        feet = i2.getStringExtra("feet");
        inch = i2.getStringExtra("inch");

        try {
            in = Double.parseDouble(inch);
            ft = Double.parseDouble(feet);
            wt = Double.parseDouble(weight);


            in = in + (ft * 12);
            mt = (in / 39.37);
            bmi = (wt) / (mt * mt);

            TextView bm = (TextView) findViewById(R.id.bmi_res2);
            TextView bm2 = (TextView) findViewById(R.id.value);
            int bmi_1 = (int) (bmi * 100);
            bmi = bmi_1 / 100.0;

            bm.setText(bmi.toString());
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Enter all the values", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}

             /*if(bmi <= 16) {
                 bm2.setText("Very Severly Underweight");

             }
             else if(bmi <=17 && bmi >16){
                 bm2.setText("Severly Underweight");
             }
             else if(bmi <=18.5 && bmi >17) {
                 bm2.setText("Underweight");
             }
             else if(bmi <=25 && bmi >18.5) {
                 bm2.setText("Normal");
             }
             else if(bmi <=30 && bmi >25) {
                 bm2.setText("Overweight");
             }
             else if(bmi >30) {
                 bm2.setText("Obese!");
             }
         }
         catch (Exception e)
         {
             Toast.makeText(getApplicationContext(),"Enter all the values",Toast.LENGTH_SHORT).show();
            finish();
         }

        // Toast.makeText(BmiResult.this, " "+bmi, Toast.LENGTH_SHORT).show();
        String array[]={"Very Severly Underweight   <16",
                "Severly Underweight   16-17",
                "Underweight   17-18.5",
                "Normal   18.5-25",
                "OverWeight   25-30",
                "Obese   >30"};
        ListView lv= (ListView)findViewById(R.id.list_view2);
        ArrayAdapter adapter= new ArrayAdapter(getApplicationContext(),R.layout.list,R.id.text_view,array);
        lv.setAdapter(adapter);




    }
}
*/