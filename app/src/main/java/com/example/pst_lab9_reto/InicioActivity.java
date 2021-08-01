package com.example.pst_lab9_reto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InicioActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnInicio, btnURL, btnRevisarCorreo, btnIniciarSesion, btnAcercaDe;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        btnInicio = findViewById(R.id.btnInicio);
        btnURL = findViewById(R.id.btnURL);
        btnRevisarCorreo = findViewById(R.id.btnRevisarCorreo);
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        btnAcercaDe = findViewById(R.id.btnAcercaDe);

        btnInicio.setOnClickListener(this);
        btnURL.setOnClickListener(this);
        btnRevisarCorreo.setOnClickListener(this);
        btnIniciarSesion.setOnClickListener(this);
        btnAcercaDe.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnInicio:
                intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btnURL:
                intent = new Intent(getApplicationContext(), WebViewActivity.class);
                startActivity(intent);
                break;
            case R.id.btnRevisarCorreo:
                intent = new Intent(getApplicationContext(), CorreoElectronico.class);
                startActivity(intent);
                break;
            case R.id.btnIniciarSesion:
                intent = new Intent(getApplicationContext(), RevisarCorreo.class);
                startActivity(intent);
                break;
            case R.id.btnAcercaDe:
                intent = new Intent(getApplicationContext(), AcercaDe.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}