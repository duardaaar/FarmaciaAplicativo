package com.example.farmciaaplicativo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MissaoActivity extends AppCompatActivity {

    private View bt_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missao);

        // Inicialize a tela de missão
        IniciarTelaMissao();

        // Configure o listener para o botão de voltar
        bt_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MissaoActivity.this, FormTelaInicial.class);
                startActivity(intent);
            }
        });
    }

    private void IniciarTelaMissao() {
        bt_voltar = findViewById(R.id.bt_voltar);
    }
}
