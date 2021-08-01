package com.example.pst_lab9_reto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class CorreoElectronico extends AppCompatActivity {

    private WebView widgetWebView;
    private Button btnRegresar;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo_electronico);

        widgetWebView = findViewById(R.id.widgetWebView);
        btnRegresar = findViewById(R.id.btnRegresar);

        WebSettings opciones = widgetWebView.getSettings();
        opciones.setJavaScriptEnabled(true);
        widgetWebView.setWebViewClient(new WebViewClient());
        widgetWebView.loadUrl("https://mail.google.com/mail/u/0/#inbox");
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), InicioActivity.class);
                startActivity(intent);
            }
        });
    }
}