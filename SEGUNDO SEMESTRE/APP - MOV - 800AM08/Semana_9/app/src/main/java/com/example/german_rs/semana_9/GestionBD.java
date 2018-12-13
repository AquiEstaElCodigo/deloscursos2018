package com.example.german_rs.semana_9;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Esta clase se encargará del esquema de la base de datos y
 * de las operaciones CRUD.
 *
 */

public class GestionBD
{
    //1.- Nombre de la tabla.
    public static final String NOMBRE_TABLA = "productos";

    //2.- Campos de la tabla
    public static final String CAMPO_ID = "_id";
    public static final String CAMPO_NOMBRE = "nombre";
    public static final String CAMPO_DESCRIPCION = "descripcion";
    public static final String CAMPO_PRECIO = "precio";


    public static final String CREAR_TABLA = "CREATE TABLE "
            + NOMBRE_TABLA + " ("
            + CAMPO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + CAMPO_NOMBRE + " TEXT,"
            + CAMPO_DESCRIPCION + " TEXT NOT NULL,"
            + CAMPO_PRECIO + " INTEGER);";

    /**
     *
     * 3.- Una vez creada la tabla nos dirigimos a AsistenteBD, al
     * método onCreate() y en este escribimos db.execSQL(GestionBD.CREAR_TABLA);
     *
     */


    /**
     * 4.- creamos el constructor de esta clase,
     * ademas de las variables asistente y baseDatos
     * para crear una bd en el dispositivo.
     *
     */

    //Creamos el constructor, para crear la base de datos.
    private AsistenteBD asitente;

    /**
     * La Clase SQLiteDatabase:
     * Se utiliza para gestionar (por medio de métodos) los datos en una base de datos, 
     * como insertar, actualizar, eliminar, ejecutar sentencias SQL, abrir y cerrar
     * las conexiones, trabajar de forma transaccional.
     */
    private SQLiteDatabase baseDatos;

    //creamos el constructor con el parametro Context para pasarlo a AsistenteBD
    public GestionBD(Context context)
    {

        asitente = new AsistenteBD(context);

        baseDatos = asitente.getWritableDatabase();
        /*
            getWritableDatabase crea una base de datos y la devuelve en
            modo escritura, si ya existe solamente la devuelve.
        */


    }

    /**
     *
     * 5.- Creación del método insertar.
     */


    /**
     * Ejercicio POO
     *
     */

    public void insertar(String nombre, String descripcion, int precio)
    {
        /**
         * Para realizar un insert se necesita:
         * db.insert(NombreTabla, NullColumnHack, ContentValues)
         *
         * en NullColumnHack va el nombre de una columna
         * con valor null (opcional).
         */

        //Contenedor de valores:



        ContentValues contendorValores = new ContentValues();
        contendorValores.put(CAMPO_NOMBRE, nombre);
        contendorValores.put(CAMPO_DESCRIPCION, descripcion);
        contendorValores.put(CAMPO_PRECIO, precio);

        baseDatos.insert(NOMBRE_TABLA, null, contendorValores);


    }

    public void eliminar(int _id){

        baseDatos.delete(NOMBRE_TABLA, CAMPO_ID+"=?", new String[]{Integer.toString(_id)});


    }




}
