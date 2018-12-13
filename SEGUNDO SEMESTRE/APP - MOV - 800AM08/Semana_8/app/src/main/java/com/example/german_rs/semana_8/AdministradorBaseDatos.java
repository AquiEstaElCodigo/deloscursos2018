package com.example.german_rs.semana_8;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class AdministradorBaseDatos
{

    public static final String NOMBRE_TABLA = "usuarios";

    public static final String COLUMNA_ID = "_id";
    public static final String COLUMNA_NOMBRE= "nombre";
    public static final String COLUMNA_APELLIDO = "apellido";
    public static final String COLUMNA_EDAD = "edad";


    public static final String CREAR_TABLA = "create table " + NOMBRE_TABLA + " ("
            + COLUMNA_ID + " integer primary key autoincrement,"
            + COLUMNA_NOMBRE + " text not null,"
            + COLUMNA_APELLIDO + " text not null,"
            + COLUMNA_EDAD + " INTEGER); " ;


    private DbHelper helper;
    private  SQLiteDatabase bd;

    public AdministradorBaseDatos(Context context)
    {

        helper = new DbHelper(context);

        //si la base de datos no existe getWritableDatabase crea
        //la base de datos y la devuelve en modo escritura, ya
        //existe solamente la devuelve.
        bd = helper.getWritableDatabase();

    }//




    public ContentValues generarContenedorValores(String nombre, String apellido, int edad)
    {
        ContentValues contenedorValores = new ContentValues();
        contenedorValores.put(COLUMNA_NOMBRE, nombre);
        contenedorValores.put(COLUMNA_APELLIDO, apellido);
        contenedorValores.put(COLUMNA_EDAD, edad);
        return contenedorValores;
    }


    public void insertar(String nombre, String apellido, int edad)
    {


        //esta instrucción si devuelve -1 es que hubo un problema con
        //el ingreso de datos.
        bd.insert(NOMBRE_TABLA, null, generarContenedorValores(nombre,
                apellido, edad));


    }

    //otra versión del ingresar...

    public void insertar2(String nombre, String apellido, int edad){

        bd.execSQL("INSERT INTO usuarios(nombre, apellido, edad) values('"+nombre+"','"+apellido+"','"+edad+"') ");

    }

    /**
     * @ELIMINAR
     */

    public void eliminar(String nombre){

        //bd.delete(nombreTabla, Clausula where, argumentos);

        bd.delete(NOMBRE_TABLA, COLUMNA_NOMBRE+"=?", new String[]{nombre});

    }

    public void eliminarMultiple(String nom1, String nom2){

        bd.delete(NOMBRE_TABLA, COLUMNA_NOMBRE+" IN (?, ?)", new String[]{nom1, nom2});


    }

    /**
     *
     * @actualizar
     */

    public ContentValues contenedorValoresModificar(String nombre, String apellido)
    {
        ContentValues contenedorValores = new ContentValues();
        contenedorValores.put(COLUMNA_NOMBRE, nombre);
        contenedorValores.put(COLUMNA_APELLIDO, apellido);

        return contenedorValores;
    }



    public void modificarApellido(String nombre, String apellido){

        bd.update(NOMBRE_TABLA, contenedorValoresModificar(nombre, apellido),
                COLUMNA_APELLIDO+"=?", new String[]{nombre});

    }




}//
