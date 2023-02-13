package com.example.bmiknowyourbodymassindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtWeight,edtheightFT,edtheightIN;
        Button calbtn;
        TextView calRes;

        calbtn=findViewById(R.id.calbtn);
        calRes=findViewById(R.id.calRes);
        edtWeight=findViewById(R.id.edtweight);
        edtheightFT=findViewById(R.id.edtheightFT);
        edtheightIN=findViewById(R.id.edtheightIN);
        LinearLayout llmain=findViewById(R.id.llmain);

        calbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt=Integer.parseInt(edtWeight.getText().toString());
                int ft=Integer.parseInt(edtheightFT.getText().toString());
                int in=Integer.parseInt(edtheightIN.getText().toString());
                int ttlht=ft*12+in;
                double hicm=ttlht*2.53;
                double him=hicm/100;

                double bmi=wt/(him*him);
                if(bmi>25){
                    calRes.setText("You're OverWeight!");
                    llmain.setBackgroundColor(getResources().getColor(R.color.red));
                }else if(bmi<18)
                {
                    calRes.setText("You're UnderWeight!");
                    llmain.setBackgroundColor(getResources().getColor(R.color.yellow));
                }else
                {
                    calRes.setText("You're Healthy!");
                    llmain.setBackgroundColor(getResources().getColor(R.color.green));
                }
            }
        });


    }
}