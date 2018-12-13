package com.example.german_rs.semana_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    /**
     *          EJERCICIOS I
     */
    private Button btn_mostrar;
    private EditText et_mensaje;
    private Button btn_mostrar_msj;


    /**
     *          EJERCICIOS II
     */
    private EditText et_nombre;
    private EditText et_apellido;
    private EditText et_edad;
    private Button btn_mostrar_datos;


    /**
     *          EJERCICIOS III
     */
    private Button btn_mostrar_datos2;

    /**
     *          EJERCICIOS IV
     */
    private Button btn_mostrar_datos3;


    /**
     *          EJERCICIOS V
     */
    private Button btn_abrir_segunda;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         *          EJERCICIOS I
         *          Inicializando controles.
         */
        btn_mostrar = (Button) findViewById(R.id.btn_mostrar);
        et_mensaje = (EditText) findViewById(R.id.et_mensaje);
        btn_mostrar_msj = (Button) findViewById(R.id.btn_mostrar_msj);


        /**
         *          EJERCICIOS II
         *          Inicializando controles.
         */

          et_nombre = (EditText) findViewById(R.id.et_nombre);
          et_apellido = (EditText) findViewById(R.id.et_apellido);
          et_edad = (EditText) findViewById(R.id.et_edad);
          btn_mostrar_datos = (Button) findViewById(R.id.btn_mostrar_datos);


        /**
         *          EJERCICIOS III
         *          Inicializando control.
         */
          btn_mostrar_datos2 = (Button) findViewById(R.id.btn_mostrar_datos2);


        /**
         *          EJERCICIOS IV
         *          Inicializando control.
         */
        btn_mostrar_datos3 = (Button) findViewById(R.id.btn_mostrar_datos3);


        /**
         *          EJERCICIOS V
         */
        btn_abrir_segunda = (Button) findViewById(R.id.btn_abrir_segunda);





        /**
         *          EJERCICIOS I
         */

        btn_mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast notificacion = Toast.makeText(getApplicationContext(), "Hola Mundo",
                        Toast.LENGTH_SHORT);

                notificacion.show();
            }
        });


        btn_mostrar_msj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mensaje = et_mensaje.getText().toString();

                Toast notificacion_2 = Toast.makeText(getApplicationContext(), mensaje,
                        Toast.LENGTH_SHORT);

                notificacion_2.show();


            }
        });

    }//fin método onCreate()


    /**
     *          EJERCICIOS II
     */
    public void ejercicios_2(View view)
    {

        String nombre = et_nombre.getText().toString();
        String apellido = et_apellido.getText().toString();
        String edad = et_edad.getText().toString();

        Toast notificacion_3 = Toast.makeText(getApplicationContext(),
                nombre + " " + apellido + " " + edad,
                Toast.LENGTH_LONG);

        notificacion_3.show();

    }//fin método


    /**
     *          EJERCICIOS III
     */
    public void ejercicios_3(View view)
    {
        String nombre = et_nombre.getText().toString();
        String apellido = et_apellido.getText().toString();
        String edad = et_edad.getText().toString();

        Toast toast_nombre = Toast.makeText(getApplicationContext(), nombre, Toast.LENGTH_SHORT);
        toast_nombre.setGravity(Gravity.TOP, 0,0);


        Toast toast_apellido = Toast.makeText(getApplicationContext(), apellido, Toast.LENGTH_SHORT);
        toast_apellido.setGravity(Gravity.CENTER, 0,0);


        Toast toast_edad = Toast.makeText(getApplicationContext(), edad, Toast.LENGTH_SHORT);
        toast_edad.setGravity(Gravity.BOTTOM, 0,0);


        toast_nombre.show();
        toast_apellido.show();
        toast_edad.show();


    }

    /**
     *          EJERCICIOS IV
     */
    public void ejercicios_4(View view)
    {
        String nombre = et_nombre.getText().toString();
        String apellido = et_apellido.getText().toString();
        String edad = et_edad.getText().toString();

        Toast toast_nombre = Toast.makeText(getApplicationContext(), nombre, Toast.LENGTH_SHORT);
        toast_nombre.setGravity(Gravity.TOP| Gravity.LEFT, 0,0);


        Toast toast_apellido = Toast.makeText(getApplicationContext(), apellido, Toast.LENGTH_SHORT);
        toast_apellido.setGravity(Gravity.CENTER| Gravity.RIGHT, 0,0);


        Toast toast_edad = Toast.makeText(getApplicationContext(), edad, Toast.LENGTH_SHORT);
        toast_edad.setGravity(Gravity.BOTTOM| Gravity.LEFT, 0,0);


        toast_nombre.show();
        toast_apellido.show();
        toast_edad.show();


    }//fin método


    /**
     *          EJERCICIOS V
     */
    public void abrirSegundaActividad(View view)
    {


        startActivity(new Intent(MainActivity.this, SegundaActivity.class));


    }




}
