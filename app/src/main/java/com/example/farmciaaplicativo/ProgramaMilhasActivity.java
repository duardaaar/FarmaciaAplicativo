package com.example.farmciaaplicativo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProgramaMilhasActivity extends AppCompatActivity {

    private Button btCompra, buttonResgatar;
    private ProgressBar progressBarPontos;
    private TextView valorPontos;
    private int pontos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programa_milhas);

        // Inicialize a tela de cadastro
        iniciarTelaCadastro();

        // Configure o listener para o botão de compra
        btCompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProgramaMilhasActivity.this, CompraActivity.class);
                startActivity(intent);
            }
        });

        // Configure o listener para o botão resgatar
        buttonResgatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resgatarProduto();
            }
        });
    }

    private void iniciarTelaCadastro() {
        btCompra = findViewById(R.id.bt_compra);
        buttonResgatar = findViewById(R.id.buttonResgatar);
        progressBarPontos = findViewById(R.id.progressBarPontos);
        valorPontos = findViewById(R.id.ValorPontos);
    }

    private void resgatarProduto() {
        // Exibe mensagem de produto resgatado
        Toast.makeText(this, "Produto Resgatado", Toast.LENGTH_SHORT).show();

        // Incrementa os pontos em 10
        pontos += 10;

        // Atualiza o valor dos pontos na tela
        valorPontos.setText(String.valueOf(pontos));

        // Atualiza a barra de progresso
        progressBarPontos.setProgress(pontos);

        // Verifica se os pontos atingiram o máximo e reseta se necessário
        if (pontos >= 100) {
            pontos = 0;
            progressBarPontos.setProgress(pontos);
        }
    }
}
