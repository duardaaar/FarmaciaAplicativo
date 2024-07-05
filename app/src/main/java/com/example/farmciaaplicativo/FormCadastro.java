package com.example.farmciaaplicativo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class FormCadastro extends AppCompatActivity {

    private EditText editNome, editEmail, editCelular, editNumCartao;
    private Button bt_cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        // Inicializar componentes
        editNome = findViewById(R.id.edit_nome);
        editEmail = findViewById(R.id.edit_email);
        editCelular = findViewById(R.id.edit_celular);
        editNumCartao = findViewById(R.id.edit_numcartao);
        bt_cadastrar = findViewById(R.id.bt_cadastrar);

        // Configurar o listener para o botão cadastrar
        bt_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obter os valores dos campos de entrada
                String nome = editNome.getText().toString();
                String email = editEmail.getText().toString();
                String celular = editCelular.getText().toString();
                String numCartao = editNumCartao.getText().toString();

                // Criar um Intent para iniciar a activity CadastroClienteActivity
                Intent intent = new Intent(FormCadastro.this, CadastroClienteActivity.class);

                // Adicionar os dados ao Intent
                intent.putExtra("nome", nome);
                intent.putExtra("email", email);
                intent.putExtra("celular", celular);
                intent.putExtra("numCartao", numCartao);

                // Iniciar a activity CadastroClienteActivity
                startActivity(intent);
            }
        });
    }
}
