package com.example.farmciaaplicativo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.farmciaaplicativo.ConfirmaAgendamentoActivity;
import com.example.farmciaaplicativo.R;

public class AgendamentosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendamentos);

        Button confirmButton = findViewById(R.id.bt_confirmar);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar a atividade ConfirmaAgendamento
                Intent intent = new Intent(AgendamentosActivity.this, ConfirmaAgendamentoActivity.class);
                startActivity(intent);
            }
        });
    }
}
