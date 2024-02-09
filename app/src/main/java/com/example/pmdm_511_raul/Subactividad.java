package com.example.pmdm_511_raul;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Subactividad extends AppCompatActivity {

    private Button btnAceptar;
    private Button btnRechazar;

    private EditText

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subactividad);

        btnAceptar = findViewById(R.id.btnAceptar);
        btnRechazar = findViewById(R.id.btnRechazar);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aceptarCondiciones();
            }
        });

        btnRechazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rechazarCondiciones();
            }
        });
    }

    private void aceptarCondiciones() {
        String nombre = edit
    }

    private void rechazarCondiciones() {
        // Acciones a realizar cuando se rechazan las condiciones
        Toast.makeText(this, "Condiciones rechazadas", Toast.LENGTH_SHORT).show();
        finish(); // Finaliza esta actividad después de rechazar las condiciones
    }
}
