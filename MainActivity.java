package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    Button bt1,bt2,bt3,bt4;
    TextView sym,equal,res;
    EditText num1,num2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);
        bt4=(Button)findViewById(R.id.bt4);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        sym=(TextView)findViewById(R.id.symbol);
        equal=(TextView)findViewById(R.id.equal);
        res=(TextView)findViewById(R.id.result);

    }
    @Override
    public void onClick(View v){
        float result =0,n1,n2;
        String oper="";

        if(TextUtils.isEmpty(num1.getText().toString()) || TextUtils.isEmpty(num2.getText().toString())){
            return;
        }
        n1=Float.parseFloat(num1.getText().toString());
        n2=Float.parseFloat(num2.getText().toString());
        switch (v.getId()){
            case R.id.bt1:oper="+";
            result=n1+n2;
            break;
            case R.id.bt2:oper="-";
            result =n1-n2;
                break;
            case R.id.bt3:oper="x";
            result=n1*n2;
            break;
            case R.id.bt4:oper="/";
            result=n1/n2;
            break;
            default:break;
        }
        String r= String.valueOf(result);
        res.setText(r);
        sym.setText(oper);
        equal.setText("=");

    }
}
