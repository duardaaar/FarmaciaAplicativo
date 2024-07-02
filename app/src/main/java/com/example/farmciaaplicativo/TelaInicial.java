package com.example.farmciaaplicativo;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class TelaInicial extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageButton buttonDrawerToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_inicial);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

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
                    Toast.makeText(TelaInicial.this, "Cadastro Clicado", Toast.LENGTH_SHORT).show();
                }
                if (itemId == R.id.navClientes) {
                    Toast.makeText(TelaInicial.this, "Clientes Clicado", Toast.LENGTH_SHORT).show();
                }
                if (itemId == R.id.navAgendamentos) {
                    Toast.makeText(TelaInicial.this, "Agendamentos Clicado", Toast.LENGTH_SHORT).show();
                }
                if (itemId == R.id.navProgramaMilhas) {
                    Toast.makeText(TelaInicial.this, "Programa Milhas Clicado", Toast.LENGTH_SHORT).show();
                }
                if (itemId == R.id.navMissao) {
                    Toast.makeText(TelaInicial.this, "Missão Clicado", Toast.LENGTH_SHORT).show();
                }
                if (itemId == R.id.navSobre) {
                    Toast.makeText(TelaInicial.this, "Sobre Clicado", Toast.LENGTH_SHORT).show();
                }

                drawerLayout.close();

                return false;
            }
        });

    }
}