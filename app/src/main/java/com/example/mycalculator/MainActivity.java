package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double in1,in2;
    TextView txt;
    boolean add,sub,mul,div,rem,dec;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bmul,bdiv,bsub,brem,beql,bdel,badd,bdot,exit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        bmul=findViewById(R.id.bmul);
        bdiv=findViewById(R.id.bdiv);
        badd=findViewById(R.id.badd);
        bsub=findViewById(R.id.bsub);
        beql=findViewById(R.id.beql);
        bdel=findViewById(R.id.bdel);
        brem=findViewById(R.id.brem);
        bdot=findViewById(R.id.bdot);
        txt=findViewById(R.id.display);
        exit=findViewById(R.id.exit);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"0");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt.getText().length()!=0){
                    in1=Float.parseFloat(txt.getText() +"");
                    add=true;
                    dec=false;
                    txt.setText(null);
                }
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt.getText().length()!=0){
                    in1=Float.parseFloat(txt.getText() +"");
                    mul=true;
                    dec=false;
                    txt.setText(null);
                }
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt.getText().length()!=0){
                    in1=Float.parseFloat(txt.getText() +"");
                    sub=true;
                    dec=false;
                    txt.setText(null);
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt.getText().length()!=0){
                    in1=Float.parseFloat(txt.getText() +"");
                    div=true;
                    dec=false;
                    txt.setText(null);

                }
            }
        });
        brem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt.getText().length()!=0){
                    in1=Float.parseFloat(txt.getText()+"");
                    rem=true;
                    dec=false;
                    txt.setText(null);
                }
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
        beql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(add ||sub ||mul ||div || rem){
                    in2=Float.parseFloat(txt.getText()+"");
                }
                if(add){
                    txt.setText(String.valueOf(in1+in2));
                    add=false;
                }
                if(sub){
                    txt.setText(in1-in2+"");
                    sub=false;
                }
                if(mul){
                    txt.setText(in1*in2+"");
                    mul=false;
                }
                if(div){
                    txt.setText(in1/in2+"");
                    div=false;
                }
                if(rem){
                    txt.setText(in1%in2+"");
                    div=false;
                }

            }
        });
        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("");
                in1=0.0;
                in2=0.0;
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!dec){
                    txt.setText(txt.getText()+".");
                    dec=true;
                }
            }
        });


    }
}