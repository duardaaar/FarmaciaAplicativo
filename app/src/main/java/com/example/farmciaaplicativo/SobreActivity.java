package com.example.farmciaaplicativo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        // Configuração do botão Facebook
        Button btnFacebook = findViewById(R.id.btnFacebook);
        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirLink("https://www.facebook.com/drogariaspacheco/?locale=pt_BR");
            }
        });

        // Configuração do botão Instagram
        Button btnInstagram = findViewById(R.id.btnInstagram);
        btnInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirLink("https://www.instagram.com/drogpacheco/?hl=pt");
            }
        });

        // Configuração do botão X (rede social genérica)
        Button btnX = findViewById(R.id.btnX);
        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirLink("https://x.com/pachecoonline");
            }
        });
    }

    // Método para abrir um link externo
    private void abrirLink(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
