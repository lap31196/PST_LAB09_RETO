package com.example.pst_lab9_reto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class WebViewActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTxtUrl;
    private Button btnBuscar, btnRegresar;
    private WebView widgetWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        editTxtUrl = findViewById(R.id.editTxtUrl);
        btnBuscar = findViewById(R.id.btnBuscar);
        btnRegresar = findViewById(R.id.btnRegresar);
        widgetWebView = findViewById(R.id.widgetWebView);

        btnBuscar.setOnClickListener(this);
        btnRegresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBuscar:
                WebSettings opciones = widgetWebView.getSettings();
                opciones.setJavaScriptEnabled(true);
                widgetWebView.setWebViewClient(new WebViewClient());
                widgetWebView.loadUrl("https://" + editTxtUrl.getText().toString());
                break;
            case R.id.btnRegresar:
                finish();
                break;
            default:
                break;
        }
    }
}