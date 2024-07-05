package com.example.farmciaaplicativo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmaAgendamentoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirma_agendamento);

        // Configurar o listener para o botão de voltar à tela inicial
        findViewById(R.id.bt_voltar_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retornarParaTelaInicial();
            }
        });
    }

    private void retornarParaTelaInicial() {
        Intent intent = new Intent(this, FormTelaInicial.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK); // Limpar as atividades anteriores
        startActivity(intent);
        finish(); // Finalizar a atividade atual
    }
}
