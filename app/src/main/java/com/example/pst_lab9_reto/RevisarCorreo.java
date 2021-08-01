package com.example.pst_lab9_reto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RevisarCorreo extends AppCompatActivity implements View.OnClickListener {

    private EditText editTxtEmail, editTxtPassword;
    private Button btnIniciarSesion, btnPaginaPrincipal;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        editTxtEmail = findViewById(R.id.editTxtEmail);
        editTxtPassword = findViewById(R.id.editTxtPassword);
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        btnPaginaPrincipal = findViewById(R.id.btnPaginaPrincipal);

        btnIniciarSesion.setOnClickListener(this);
        btnPaginaPrincipal.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnIniciarSesion:
                intent = new Intent(getApplicationContext(), Bienvenido.class);
                intent.putExtra("usuario",editTxtEmail.getText().toString());
                startActivity(intent);
                break;
            case R.id.btnPaginaPrincipal:
                finish();
                break;
            default:
                break;
        }
    }
}