package ado.edu.itla.sosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import ado.edu.itla.sosapp.entidad.Usuario;

public class MainActivity extends AppCompatActivity {
private static final String TAG = "SOSAPP.MAINACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"Entrando al Main Activity");
        Log.e(TAG,"Esto es un error");
        Log.i(TAG,"informando procesos");
        Button btnRegistrar = findViewById(R.id.login_registrarse);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity_registrarse = new Intent(MainActivity.this, activity_registrarse.class);
                    startActivity(activity_registrarse);

            }
        });

//        btnButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Usuario usuario = new Usuario();
//
//                try{
//                    usuario.setEdad(-12);
//                }catch  (Exception e) {
//
//                    Toast.makeText( MainActivity.this,"Edad no permitidad", Toast.LENGTH_LONG).show();
//                    e.printStackTrace();
//                }
//
//            }
//        });


Usuario usuario = new Usuario();
usuario.setEmail("juandelospalotes@gmail.com");
usuario.setNombre("Juan de los Palotes");
usuario.setUsername("juanpalote");

        Usuario usuario2 = new Usuario();
        usuario2.setEmail("Casimiro@gmail.com");
        usuario2.setNombre("Casimiro Gutierrez");
        usuario2.setUsername("CasiLook");


        Usuario usuario1 = new Usuario();
        usuario1.setEmail("Casiciego@gmail.com");
        usuario1.setNombre("Casiciego Fermin");
        usuario1.setUsername("CasiBlind");

        List<Usuario> usuarioList = new ArrayList();
        usuarioList.add(usuario);
        usuarioList.add(usuario1);
        usuarioList.add(usuario2);
        Log.i(TAG,  "Tamaño de lista " +usuarioList.size());

        for(Usuario u: usuarioList) {
            Log.i(TAG,"Nombre"+ u.getNombre());
        }
    }
}

   // ImageView myImageView = (ImageView) findViewById(R.id.