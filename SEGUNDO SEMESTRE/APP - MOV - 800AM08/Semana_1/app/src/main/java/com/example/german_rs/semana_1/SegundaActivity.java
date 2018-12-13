package com.example.german_rs.semana_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SegundaActivity extends AppCompatActivity {


    /**
     *      EJERCICIOS VI
     */
    private EditText et_num1;
    private EditText et_num2;
    private EditText et_resultado;
    private Button btn_sumar;


    /**
     *      EJERCICIOS VII
     */
    private Button btn_sum;
    private Button btn_res;
    private Button btn_mult;
    private Button btn_div;
    private EditText et_resultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        /**
         *      EJERCICIOS VI
         */
        et_num1 = (EditText) findViewById(R.id.et_num1);
        et_num2 = (EditText) findViewById(R.id.et_num2);
        et_resultado = (EditText) findViewById(R.id.et_resutado);


        /**
         *      EJERCICIOS VII
         */
        btn_sum = (Button) findViewById(R.id.btn_sum);
        btn_res = (Button) findViewById(R.id.btn_res);
        btn_mult = (Button) findViewById(R.id.btn_mult);
        btn_res = (Button) findViewById(R.id.btn_div);
        et_resultado2 = (EditText) findViewById(R.id.et_resultado2);

    }//fin método onCreate()


    public void sumar(View v){

        try{
            int num1 = Integer.parseInt(et_num1.getText().toString());
            int num2 = Integer.parseInt(et_num2.getText().toString());
            et_resultado.setText(Integer.toString(num1 + num2));
        }catch(Exception e){
            Log.i("Error: ", e.getMessage());
        }

    }//fin método


    public void operacionesAritmeticas(View v){


        int num1 = Integer.parseInt(et_num1.getText().toString());
        int num2 = Integer.parseInt(et_num2.getText().toString());

        switch(v.getId()){

            case R.id.btn_sum:

                et_resultado2.setText(Integer.toString(num1 + num2));
                break;

            case R.id.btn_res:

                et_resultado2.setText(Integer.toString(num1 - num2));
                break;

            case R.id.btn_mult:

                et_resultado2.setText(Integer.toString(num1 * num2));
                break;

            case R.id.btn_div:

                et_resultado2.setText(Integer.toString(num1 / num2));
                break;

        }

    }//fin método


}
