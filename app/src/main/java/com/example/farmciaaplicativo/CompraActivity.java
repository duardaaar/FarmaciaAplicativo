package com.example.farmciaaplicativo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CompraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra);

        // Configurar o listener para o botão de finalizar compra
        findViewById(R.id.bt_cadastrar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirFinalizarCompra();
            }
        });
    }

    private void abrirFinalizarCompra() {
        Intent intent = new Intent(this, FinalizarCompraActivity.class);
        startActivity(intent);
    }
}
