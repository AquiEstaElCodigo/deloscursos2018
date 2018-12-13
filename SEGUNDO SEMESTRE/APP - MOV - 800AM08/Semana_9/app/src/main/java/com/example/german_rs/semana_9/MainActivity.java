package com.example.german_rs.semana_9;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Pasos:
     * 1.- Crear una nueva clase que nos permite abrir una base de datos
     * si esta no existe, la crea y esta clase tambien nos permitira crear
     * el esquema de la base de datos, es decir su estructura.
     * Esta nueva clase debe heredar de SQLiteOpenHelper.
     *
     */

    GestionBD gestionBD;
    EditText et_nombre, et_descripcion, et_precio, et_id;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gestionBD = new GestionBD(this);

        et_nombre = (EditText) findViewById(R.id.et_nombre);
        et_descripcion = (EditText) findViewById(R.id.et_descripcion);
        et_precio = (EditText) findViewById(R.id.et_precio);
        et_id = (EditText) findViewById(R.id.et_id);

    }

    public void realizarIngreso(View view){

        String nombre = et_nombre.getText().toString();
        String descripcion = et_descripcion.getText().toString();
        int precio = Integer.parseInt(et_precio.getText().toString());

        gestionBD.insertar(nombre, descripcion, precio);
        Toast.makeText(getApplicationContext(), "producto ingresado!",
                Toast.LENGTH_SHORT).show();

        et_nombre.setText("");
        et_descripcion.setText("");
        et_precio.setText("");

    }

    public void realizarEliminacion(View view){

        int id = Integer.parseInt(et_id.getText().toString());

        gestionBD.eliminar(id);

        Toast.makeText(getApplicationContext(), "producto eliminado!",
                Toast.LENGTH_SHORT).show();

        et_id.setText("");


    }



}
