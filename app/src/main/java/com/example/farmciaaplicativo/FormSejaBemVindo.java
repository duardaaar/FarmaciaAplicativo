package com.example.farmciaaplicativo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class FormSejaBemVindo extends AppCompatActivity {

    private TextView button_tela_vamos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form_seja_bem_vindo);

        IniciarComponentes();

        button_tela_vamos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(FormSejaBemVindo.this,FormTelaInicial.class);
                startActivity(intent);
            }
        });

    }

    private void IniciarComponentes(){
        button_tela_vamos = findViewById(R.id.button_tela_vamos);
    }
}