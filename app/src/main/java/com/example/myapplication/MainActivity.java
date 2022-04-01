package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recuperar datos

        et1 = (EditText) findViewById(R.id.curso1);
        et2 = (EditText) findViewById(R.id.curso2);
        et3 = (EditText) findViewById(R.id.curso3);
        tv1 = (TextView) findViewById(R.id.tv_1);
    }

    public void estatus(View view){
        String mateS = et1.getText().toString();
        String fisicaS = et2.getText().toString();
        String quimicaS = et3.getText().toString();

        int mateI = Integer.parseInt(mateS);
        int fisicaI = Integer.parseInt(fisicaS);
        int quimI = Integer.parseInt(quimicaS);

        int prom = (mateI+fisicaI+quimI)/3;

        if(prom >=11){
            tv1.setText("Aprobado! "+prom);
        }else{
            tv1.setText("Desaprobado :c "+prom);
        }
    }
}