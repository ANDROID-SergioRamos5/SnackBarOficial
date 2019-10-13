package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Snackbar snackbar = Snackbar.make(findViewById(R.id.activity_main),
                "Esto es una prueba", Snackbar.LENGTH_INDEFINITE);

        snackbar.setActionTextColor(Color.rgb(50,99,00));
        snackbar.setAction("Accion", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Pulsaste accion de SnackBar",
                        Toast.LENGTH_SHORT).show();
            }
        });
        snackbar.show();
    }
}
