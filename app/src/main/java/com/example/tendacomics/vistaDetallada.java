package com.example.tendacomics;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class vistaDetallada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_detallada);

        // Referenciar vistas
        ImageView imageComic = findViewById(R.id.imageComic);
        TextView textTitle = findViewById(R.id.textTitle);
        TextView textDescription = findViewById(R.id.textDescription);
        TextView textPrice = findViewById(R.id.textPrice);
        Button buttonAddToCart = findViewById(R.id.buttonAddToCart);
        ImageButton imageButtonEnrere = findViewById(R.id.imageButtonEnrere);

        // Obtener datos del Intent
        Intent intent = getIntent();
        int imageResource = intent.getIntExtra("imageResource", R.drawable.portada_gwenpool_uno); // Imagen predeterminada
        String title = intent.getStringExtra("title");
        String description = intent.getStringExtra("description");
        String price = intent.getStringExtra("price");

        // Configurar los datos en la vista
        imageComic.setImageResource(imageResource);
        textTitle.setText(title);
        textDescription.setText(description);
        textPrice.setText(price);

        // Configurar botón de añadir al carrito
        buttonAddToCart.setOnClickListener(v -> {
            // Lógica para añadir al carrito (puede ser un Toast o actualizar un carrito global)
        });

        // Configurar botón de "enrere" para ir a BuscarActivity
        imageButtonEnrere.setOnClickListener(v -> {
            // Crear Intent para ir a BuscarActivity
            Intent intentEnrere = new Intent(vistaDetallada.this, ResultatActivity.class);
            startActivity(intentEnrere);
            // Opcional: cerrar la actividad actual si no quieres que el usuario vuelva
            finish();
        });
    }
}
