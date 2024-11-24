package com.example.tendacomics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    private Button Mangues;
    private Button Comics;
    private Button Figures;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mangues = findViewById(R.id.buttonMangues);
        Comics = findViewById(R.id.buttonComics);
        Figures = findViewById(R.id.buttonFigures);

        Mangues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BuscarActivity.class);
                startActivity(intent);
            }
        });

        Comics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BuscarActivity.class);
                startActivity(intent);
            }
        });

        Figures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BuscarActivity.class);
                startActivity(intent);
            }
        });



        // Només afegim el fragment un cop quan la activitat es crea per primer cop
        if (savedInstanceState == null) {
            // Crear una instància del fragment Menu
            Menu menuFragment = new Menu();

            // Realitzem la transacció per reemplaçar el fragment en el conteidor
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragmentmenu, menuFragment);
            transaction.commit();
        }
    }
}