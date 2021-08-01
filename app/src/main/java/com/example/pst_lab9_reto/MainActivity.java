package com.example.pst_lab9_reto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnEnviar, btnPaginaPrincipal;
    private EditText editTxtNombres, editTxtApellidos, editTxtTelefono, editTxtEmail;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar = findViewById(R.id.btnEnviar);
        btnPaginaPrincipal = findViewById(R.id.btnPaginaPrincipal);
        editTxtNombres = findViewById(R.id.editTxtNombres);
        editTxtApellidos = findViewById(R.id.editTxtApellidos);
        editTxtTelefono = findViewById(R.id.editTxtTelefono);
        editTxtEmail = findViewById(R.id.editTxtEmail);
        intent = new Intent(Intent.ACTION_SEND);

        btnEnviar.setOnClickListener(this);
        btnPaginaPrincipal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnEnviar:
                String[] to = {"steanleo@fiec.espol.edu.ec"};
                intent.setData(Uri.parse("mailto:"));
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, to);
                intent.putExtra(Intent.EXTRA_SUBJECT, "Formulario de Registro PST");

                intent.putExtra(Intent.EXTRA_TEXT, "Datos de Contacto\n" +
                        "Nombres: " + editTxtNombres.getText().toString() + "\n" +
                        "Apellidos: " + editTxtApellidos.getText().toString() + "\n" +
                        "Telefono: " + editTxtTelefono.getText().toString() + "\n" +
                        "Correo Electronico: " + editTxtEmail.getText().toString() + "\n");

                try {
                    startActivity(Intent.createChooser(intent, "Enviando Email"));
                    Log.i("Termina envio de email", "");
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(MainActivity.this, "No existe cliete Email instalado.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btnPaginaPrincipal:
                finish();
                break;
            default:
                break;
        }
    }
}