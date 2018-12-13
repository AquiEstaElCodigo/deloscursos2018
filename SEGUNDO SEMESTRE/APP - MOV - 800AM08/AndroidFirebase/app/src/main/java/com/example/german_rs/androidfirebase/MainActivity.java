package com.example.german_rs.androidfirebase;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {



    FirebaseFirestore db;
    EditText campoNombre, campoApellido, campoEdad;
    Button buttonEnviar;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = FirebaseFirestore.getInstance();

        campoNombre=(EditText)findViewById(R.id.campoNombre);
        campoApellido=(EditText)findViewById(R.id.campoApellido);
        campoEdad=(EditText)findViewById(R.id.campoEdad);

    }

    public void ejecutarBoton(View v){




        String nombre= campoNombre.getText().toString();
        String Apellido= campoApellido.getText().toString();
        int edad= Integer.parseInt(campoEdad.getText().toString());
        insertarDatos(nombre,Apellido,edad);
    }

    public void insertarDatos(String nombre, String Apellido, int edad){


        Map<String, Object> user = new HashMap<>();

        user.put("nombre", nombre);
        user.put("apellido", Apellido);
        user.put("edad", edad);


        db.collection("usuarios")
                .add(user)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {


                        Toast.makeText(getApplicationContext(), "Datos ingresados con exito! ID: " +
                                documentReference.getId(), Toast.LENGTH_SHORT).show();

                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                        Toast.makeText(getApplicationContext(), "Error: " + e.getMessage()
                                , Toast.LENGTH_SHORT).show();

                    }
                });


    }



}
