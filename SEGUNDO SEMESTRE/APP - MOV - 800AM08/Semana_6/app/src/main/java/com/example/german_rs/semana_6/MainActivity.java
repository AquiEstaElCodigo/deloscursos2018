package com.example.german_rs.semana_6;


import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.File;


public class MainActivity extends AppCompatActivity {


    private final String CARPETA_RAIZ = "misImagenesPrueba/";
    private final String RUTA_IMAGEN =  CARPETA_RAIZ + "misFotos";

    final int COD_SELECCIONA = 10;
    final int COD_FOTO = 20;


    String path = "";

    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen = (ImageView) findViewById(R.id.iv_foto);

    }

    public void onclick(View view)
    {
        cargarImagen();

    }

    private void cargarImagen()
    {

        final CharSequence[] opciones={"Tomar Foto", "Cargar Imagen", "Cancelar"};

        final AlertDialog.Builder alertOpciones = new AlertDialog.Builder(MainActivity.this);
        alertOpciones.setTitle("Seleccione una opción");
        alertOpciones.setItems(opciones, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if(opciones[which].equals("Tomar Foto"))
                {
                    //Toast.makeText(getApplication(), "Tomar Foto", Toast.LENGTH_SHORT).show();
                    tomarFotografia();
                }
                else
                {
                    if(opciones[which].equals("Cargar Imagen"))
                    {
                        Intent intent = new Intent(Intent.ACTION_GET_CONTENT,
                                MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                        intent.setType("image/");
                        startActivityForResult(intent.createChooser(intent,
                                "Seleccione la aplicacion"), COD_SELECCIONA);
                    }
                    else
                    {
                        dialog.dismiss();
                    }
                }

            }
        });
        alertOpciones.show();

    }//fin método.

    private void tomarFotografia()
    {

        File fileImagen = new File(Environment.getExternalStorageDirectory(), RUTA_IMAGEN);
        boolean isCreada = fileImagen.exists();
        String nombreImagen="";

        if(isCreada == false){

            isCreada = fileImagen.mkdirs();
        }
        if(isCreada == true){


            nombreImagen = (System.currentTimeMillis()/1000) + ".jpg";

        }

        path = Environment.getExternalStorageDirectory() +
                File.separator + RUTA_IMAGEN + File.separator + nombreImagen;


        File imagen = new File(path);

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(imagen));

        startActivityForResult(intent, COD_FOTO);

    }//

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {

        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK)
        {

            switch (requestCode)
            {

                case COD_SELECCIONA:
                    Uri miPath = data.getData();
                    imagen.setImageURI(miPath);
                    break;
                case COD_FOTO:

                    MediaScannerConnection.scanFile(this, new String[]{path},
                            null,
                            new MediaScannerConnection.OnScanCompletedListener(){

                                @Override
                                public void onScanCompleted(String s, Uri uri)
                                {
                                    Log.i("Ruta de almacenamiento", "Path: "+ path);
                                }

                            });

                    Bitmap bitmap = BitmapFactory.decodeFile(path);
                    imagen.setImageBitmap(bitmap);

                    break;

            }

        }
    }//

}
