package com.example.madlab1a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e1=(EditText)findViewById(R.id.editText);
                EditText e2=(EditText)findViewById(R.id.editText2);
                TextView t1=(TextView)findViewById(R.id.textView);
                int num1=Integer.parseInt(e1.getText().toString());
                int num2=Integer.parseInt(e2.getText().toString());
                int sum =num1+num2;
                t1.setText(Integer.toString(sum));


            }
        });
    }
}
