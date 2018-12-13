package com.example.german_rs.semana_8;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    AdministradorBaseDatos abd;
    EditText et_nombre, et_apellido, et_edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Primera parte del tutorial luego se mueve a la clase AdministradorBaseDatos
        DbHelper helper = new DbHelper(this);

        //si la base de datos no existe getWritableDatabase crea
        //la base de datos y la devuelve en modo escritura, ya
        //existe solamente la devuelve.
        SQLiteDatabase bd = helper.getWritableDatabase();

        */

        abd = new AdministradorBaseDatos(this);
        et_nombre = (EditText) findViewById(R.id.et_nombre);
        et_apellido = (EditText) findViewById(R.id.et_apellido);
        et_edad = (EditText) findViewById(R.id.et_edad);


    }//

    public void insertarDatos(View view){

        String nombre = et_nombre.getText().toString();
        String apellido = et_apellido.getText().toString();
        int edad = Integer.parseInt(et_edad.getText().toString());

        abd.insertar2(nombre, apellido, edad);

        et_nombre.setText("");
        et_apellido.setText("");
        et_edad.setText("");

        Toast.makeText(getApplicationContext(), "Datos ingresados con exito",
                Toast.LENGTH_SHORT).show();
    }

    public void eliminar(View v){

        String nombre = et_nombre.getText().toString();
        abd.eliminar(nombre);

        Toast.makeText(getApplicationContext(), "Datos eliminados!!",
                Toast.LENGTH_SHORT).show();
    }


    public void modificarApellido(View view){

        String nombre = et_nombre.getText().toString();
        String apellido = et_apellido.getText().toString();

        abd.modificarApellido(nombre, apellido);

        Toast.makeText(getApplicationContext(), "Datos Actualizados!!",
                Toast.LENGTH_SHORT).show();

    }





}
