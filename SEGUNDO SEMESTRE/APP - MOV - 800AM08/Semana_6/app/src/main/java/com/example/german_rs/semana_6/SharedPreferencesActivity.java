package com.example.german_rs.semana_6;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SharedPreferencesActivity extends AppCompatActivity {


    private EditText et_nombre, et_correo;
    private TextView tv_preferenciaCompartida;
    private AlertDialog.Builder builder;

    SharedPreferences preferenciaCompartida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);

        et_nombre = (EditText) findViewById(R.id.et_nombre);
        et_correo = (EditText) findViewById(R.id.et_correo);

        tv_preferenciaCompartida = (TextView) findViewById(R.id.tv_preferenciaCompartida);
    }

    public void guardarPreferencia(View v)
    {
        //inicilializando un objeto SharedPreferences.

        preferenciaCompartida = getSharedPreferences("losDatos", Context.MODE_PRIVATE);

        //declarando el editor.
        SharedPreferences.Editor editor = preferenciaCompartida.edit();

        String nombre = et_nombre.getText().toString();
        String correo = et_correo.getText().toString();

        editor.putString("nombre", nombre);
        editor.putString("correo", correo);

        editor.commit();

        Toast.makeText(getApplicationContext(), "Se ha creado la preferencia compartida",
                Toast.LENGTH_SHORT).show();

        et_nombre.setText("");
        et_correo.setText("");
    }

    public void mostrarPreferencia(View v)
    {

        preferenciaCompartida = getSharedPreferences("losDatos", Context.MODE_PRIVATE);

        //defValue: es un parametro adicional, si no se encuentra una clave "nombre"
        //devolverá lo que este en defValue.

        String nombre = preferenciaCompartida.getString("nombre",  "no existe");
        String correo = preferenciaCompartida.getString("correo",  "no existe");


        String preferencia = "\nNombre: " + nombre + "\nCorreo: " + correo;


        mostrarPreferenciaAlert(preferencia);


        tv_preferenciaCompartida.setText(preferencia);
    }

    public void mostrarPreferenciaAlert(String datos){


        builder = new AlertDialog.Builder(this);


        builder.setTitle("Preferencia compartida");
        builder.setMessage(datos).
                setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        dialog.cancel();

                    }
                }).
                setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {

                        dialog.cancel();
                    }
                }).show();


    }




}
