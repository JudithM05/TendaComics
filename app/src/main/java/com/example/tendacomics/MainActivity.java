package com.example.tendacomics;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Solo agregamos el fragmento una vez cuando la actividad se crea por primera vez
        if (savedInstanceState == null) {
            // Crear una instancia del fragmento Menu
            Menu menuFragment = new Menu();

            // Realizamos la transacción para reemplazar el fragmento en el contenedor
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragmentmenu, menuFragment);
            transaction.commit();
        }
    }
}