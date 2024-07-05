package com.example.farmciaaplicativo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroClienteActivity extends AppCompatActivity {

    private TextView textNome, textEmail, textCelular, textNumCartao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente);

        // Inicializar componentes
        textNome = findViewById(R.id.nome_cliente_cadastro);
        textEmail = findViewById(R.id.email_cliente_cadastro);
        textCelular = findViewById(R.id.telefone_cliente_cadastro);
        textNumCartao = findViewById(R.id.num_cartao_cliente);

        // Obter os dados do Intent
        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");
        String email = intent.getStringExtra("email");
        String celular = intent.getStringExtra("celular");
        String numCartao = intent.getStringExtra("numCartao");

        // Exibir os dados na tela
        textNome.setText("Nome: " + nome);
        textEmail.setText("Email: " + email);
        textCelular.setText("Celular: " + celular);
        textNumCartao.setText("Número do Cartão: " + numCartao);
    }
}
