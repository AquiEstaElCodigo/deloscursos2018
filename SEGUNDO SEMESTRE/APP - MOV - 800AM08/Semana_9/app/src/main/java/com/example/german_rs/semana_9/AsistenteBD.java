package com.example.german_rs.semana_9;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;


/**
 * Una vez creada se deben implementar los métodos,
 * onCreate() y onUpgrade() y el constructor.
 *
 * Esta clase necesita dos parametros (NOMBRE_BD y
 * VERSION_ESQUEMA).
 *
 */

public class AsistenteBD extends SQLiteOpenHelper {


    //1.- Nombre del archivo de la base de datos.
    private static final String NOMBRE_BD = "empresa.sqlite";

    //2.- La versión del esquema de la BD (No de SQLite).
    private static final int VERSION_ESQUEMA = 1;


    /**
     * Primeros Pasos.
     * El constructor tiene los parametros del constructor de
     * la súper clase
     *
     * El CursorFactory extiende de la clase Cursor y se utiliza
     * para implementar validaciones extras u operaciones sobre
     * la BD. Por defecto es siempre null.
     *
     * version, es la versión del esquema.
     *
     * Borrar los parametros del constructor, y dejar solamente Context,
     * porque el nombre y la version la tenemos declarada en esta clase.
     */

    /**
     * Siguiente paso... Crear una nueva clase.
     *
     */

    public AsistenteBD(Context context)
    {
        //Cursor factory se utiliza para validaciones extras, u operaciones sobre la BD.
        super(context, NOMBRE_BD, null, VERSION_ESQUEMA);
    }

    /**
     * Este método nos permite abrir una BD
     * en modo escritura o en modo lectura.
     *
     * Este ademas se ejecuta cuando se crea la BD.
     */
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        /**
         * Creamos la tabla, utilizando la variable db
         *
         */
        db.execSQL(GestionBD.CREAR_TABLA);




    }


    /**
     * Este método es el encargado de gestionar las versiones
     * de la base de datos.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
