package com.example.german_rs.semana_8;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DbHelper extends SQLiteOpenHelper
{

    private static final String NOMBRE_BD = "clientes.sqlite";
    private static final int VERSION_ESQUEMA_BD = 1;

    public DbHelper(Context context)
    {

        super(context, NOMBRE_BD, null, VERSION_ESQUEMA_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(AdministradorBaseDatos.CREAR_TABLA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }


}
