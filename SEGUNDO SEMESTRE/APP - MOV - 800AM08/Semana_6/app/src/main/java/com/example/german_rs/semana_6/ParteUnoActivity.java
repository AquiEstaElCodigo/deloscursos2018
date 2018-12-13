package com.example.german_rs.semana_6;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ParteUnoActivity extends AppCompatActivity {


    private EditText et_mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte_uno);

        et_mensaje = (EditText) findViewById(R.id.et_mensaje);


        //TOAST DEL EJEMPLO 1
        Toast.makeText(getApplicationContext(), "Se puede? "
                +sePuedeEscribirEnLaMemoriaExterna(), Toast.LENGTH_SHORT).show();

    }

    //MÉTODO DE EJEMPLO 2
    public void generarArchivo(View v)
    {
        try
        {
            String mensaje = et_mensaje.getText().toString();
            FileOutputStream fileOutputStream = null;
            fileOutputStream = openFileOutput("miArchivo.txt", Context.MODE_APPEND);

            mensaje += "\n";
            fileOutputStream.write(mensaje.getBytes()); //transformarlo a bytes,
            //para que se escriba más rápido (mejorar el desempeño).
            fileOutputStream.close();
            Toast.makeText(getApplicationContext(), "El archivo se ha creado.",
                    Toast.LENGTH_SHORT).show();

            et_mensaje.setText("");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "Error en la escritura.",
                    Toast.LENGTH_SHORT).show();

        }
    }

    //MÉTODO DE EJEMPLO 1
    public boolean sePuedeEscribirEnLaMemoriaExterna()
    {
        String estado = Environment.getExternalStorageState();

        if(Environment.MEDIA_MOUNTED.equals(estado)
                || Environment.MEDIA_MOUNTED_READ_ONLY.equals(estado))
        {
            return true;
        }

        return false;
    }



}
