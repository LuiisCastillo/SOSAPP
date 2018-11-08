package ado.edu.itla.sosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
private static final String TAG = "SOSAPP.MAINACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"Entrando al Main Activity");
        Log.e(TAG,"Esto es un error");
        Log.i(TAG,"informando procesos");



    }
}
