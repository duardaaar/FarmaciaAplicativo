package com.example.farmciaaplicativo;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class FormTelaInicial extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageButton buttonDrawerToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form_tela_inicial);

        drawerLayout = findViewById(R.id.drawerLayout);
        buttonDrawerToggle = findViewById(R.id.buttonDrawerToggle);
        navigationView = findViewById(R.id.navigationView);

        buttonDrawerToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.open();
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int itemId = menuItem.getItemId();

                if (itemId == R.id.navCadast) {
                    Intent intent = new Intent(FormTelaInicial.this, FormCadastro.class);
                    startActivity(intent);
                } else if (itemId == R.id.navClientes) {
                    Intent intent = new Intent(FormTelaInicial.this, ClientesActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.navAgendamentos) {
                    Intent intent = new Intent(FormTelaInicial.this, AgendamentosActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.navProgramaMilhas) {
                    Intent intent = new Intent(FormTelaInicial.this, ProgramaMilhasActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.navMissao) {
                    Intent intent = new Intent(FormTelaInicial.this, MissaoActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.navSobre) {
                    Intent intent = new Intent(FormTelaInicial.this, SobreActivity.class);
                    startActivity(intent);
                }

                drawerLayout.close();

                return false;
            }
        });

    }
}
