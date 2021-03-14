package com.example.myfiirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edFirstvale,edSecondvalue;
    TextView tbresult;
    Button Add,Sub,divide,mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edFirstvale=findViewById(R.id.edFirstvale);
        edSecondvalue=findViewById(R.id.edSecondvalue);
        tbresult=findViewById(R.id.tbresult);
        Add=findViewById(R.id.edAdd);
        Sub=findViewById(R.id.edSub);
        divide=findViewById(R.id.eddivide);
        mul=findViewById(R.id.edmul);


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,c;
                a=Integer.parseInt(edFirstvale.getText().toString());
                b=Integer.parseInt(edSecondvalue.getText().toString());

                c=a+b;
                tbresult.setText("Result = " +c);

            }
        });


        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,c;
                a=Integer.parseInt(edFirstvale.getText().toString());
                b=Integer.parseInt(edSecondvalue.getText().toString());

                c=a-b;
                tbresult.setText("Result = " +c);

            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b;
                float c;
                a=Integer.parseInt(edFirstvale.getText().toString());
                b=Integer.parseInt(edSecondvalue.getText().toString());

                c=(float) a/b;
                tbresult.setText("Result = " +c);

            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,c;
                a=Integer.parseInt(edFirstvale.getText().toString());
                b=Integer.parseInt(edSecondvalue.getText().toString());

                c=a*b;
                tbresult.setText("Result = " +c);

            }
        });

    }
}