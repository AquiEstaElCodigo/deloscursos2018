package com.example.german_rs.semana_11;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class AccesoUsarios extends AppCompatActivity implements View.OnClickListener {


    EditText et_usuario, et_contrasenia;
    Button btn_aceptar;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso_usarios);

        mAuth = FirebaseAuth.getInstance();

        et_usuario = (EditText) findViewById(R.id.et_usuario);
        et_contrasenia = (EditText) findViewById(R.id.et_contrasenia);

        //btn_aceptar =(Button) findViewById(R.id.btn_aceptar);
        findViewById(R.id.btn_aceptar).setOnClickListener(this);

    }



    private void registrarUsuario(){
        String usuario = et_usuario.getText().toString().trim();
        String contrasenia = et_contrasenia.getText().toString().trim();

        if(usuario.isEmpty())
        {
            et_usuario.setError("Ingrese email");
            et_usuario.requestFocus();
            return;

        }

        if(!Patterns.EMAIL_ADDRESS.matcher(usuario).matches()){

            et_usuario.setError("Ingrese correo valido");
            et_usuario.requestFocus();
            return;

        }

        if(contrasenia.isEmpty()){

            et_contrasenia.setError("ingrese contrasenia");
            et_contrasenia.requestFocus();
            return;

        }

        if(contrasenia.length() < 6 ){

            et_contrasenia.setError("Minimo de 6");
            et_contrasenia.requestFocus();
            return;
        }


        mAuth.createUserWithEmailAndPassword(usuario, contrasenia).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){
                    Toast.makeText(getApplicationContext(), "Usuario Registrado", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_aceptar:
                registrarUsuario();
                break;

            case R.id.tv_registrar:
                startActivity(new Intent(this, AccesoUsarios.class));
                break;

        }


    }
}
