package ado.edu.itla.sosapp;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ado.edu.itla.sosapp.entidad.Usuario;
import ado.edu.itla.sosapp.repositorio.usuario.UsuarioRepositiorioImpl;
import ado.edu.itla.sosapp.repositorio.usuario.UsuarioRepositorio;

public class activity_registrarse extends AppCompatActivity {
    UsuarioRepositorio usuarioRepositorio;
    private static String TAG = "REGISTRO_USUARIO";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);


        usuarioRepositorio = new UsuarioRepositiorioImpl(this);

        final EditText emailText = findViewById(R.id.registrarse_email);
        final EditText nameText = findViewById(R.id.registrarse_name);
        final EditText passwordText = findViewById(R.id.registrarse_password);
        final EditText password2Text = findViewById(R.id.registrarse_password2);

        Button btnRegistrarse = (Button)  findViewById(R.id.registrarse_guardar);
        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuario usuario = new Usuario();
                usuario.setNombre(nameText.getText().toString());
                usuario.setEmail(emailText.getText().toString());
                usuario.setPassword(passwordText.getText().toString());

                Toast.makeText(activity_registrarse.this, "Usted se ha registrado", Toast.LENGTH_SHORT).show();

                Log.i(TAG, usuario.toString());
                usuarioRepositorio.guardar(usuario);
                Log.i(TAG, usuario.toString());

                nameText.setText("");
                emailText.setText("");
                passwordText.setText("");
                password2Text.setText("");

            }

        });

    }

}
