package com.example.pst_lab9_reto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bienvenido extends AppCompatActivity {

    private TextView txtBienvenido;
    private Intent intent;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        txtBienvenido = findViewById(R.id.txtBienvenido);
        btnRegresar = findViewById(R.id.btnRegresar);

        intent = getIntent();
        txtBienvenido.setText("Bienvenido " + intent.getStringExtra("usuario").replace("@gmail.com", ""));

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), InicioActivity.class);
                startActivity(intent);
            }
        });
    }
}