package com.example.tendacomics;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CistellaCompra extends AppCompatActivity {

    private LinearLayout linearLayoutCistell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cistella_compra);
        linearLayoutCistell = findViewById(R.id.linearLayoutCistell);

        // Añadir cómics a la cesta
        addComicToCistell("La increíble Masacre-Gwen", R.drawable.portada_gwenpool_uno, "18,95 €");
        addComicToCistell("El asombroso Spiderman 14: Un nuevo día", R.drawable.spiderman_honor_a_slucis, "18,05 €");
        addComicToCistell("Doctor Extraño 04: Señor Agonía", R.drawable.el_que_hace_fufufu, "11,88 €");
        addComicToCistell("Batman y el Joker: El Dúo Mortífero 04", R.drawable.el_senor_de_la_nocheee, "3,33 €");
        addComicToCistell("Oshi no Ko Vol. 1", R.drawable.oshi_no_ko_uno, "12,95 €");
        addComicToCistell("Persona 5 01", R.drawable.portada_personacincomanga, "10,40 €");
        addComicToCistell("Krymsoul", R.drawable.krymsoul, "9,45 €");
        addComicToCistell("My Hero Academia 01", R.drawable.heroaca, "8,08 €");
    }

    private void addComicToCistell(String title, int imageResource, String price) {
        // Crear un nuevo LinearLayout para cada cómic
        LinearLayout comicLayout = new LinearLayout(this);
        comicLayout.setOrientation(LinearLayout.HORIZONTAL);
        comicLayout.setPadding(8, 8, 8, 8);

        // Añadir ImageView para la imagen del cómic
        ImageView comicImage = new ImageView(this);
        comicImage.setLayoutParams(new LinearLayout.LayoutParams(150, 200)); // Ajusta el tamaño según sea necesario
        comicImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        comicImage.setImageResource(imageResource);
        comicLayout.addView(comicImage);

        // Crear un LinearLayout vertical para el título y el precio
        LinearLayout textLayout = new LinearLayout(this);
        textLayout.setOrientation(LinearLayout.VERTICAL);
        textLayout.setPadding(16, 0, 0, 0);

        // Añadir TextView para el título del cómic
        TextView comicTitle = new TextView(this);
        comicTitle.setText(title);
        comicTitle.setTextSize(16);
        textLayout.addView(comicTitle);

        // Añadir TextView para el precio del cómic
        TextView comicPrice = new TextView(this);
        comicPrice.setText(price);
        comicPrice.setTextSize(14);
        comicPrice.setTextColor(getResources().getColor(android.R.color.darker_gray));
        textLayout.addView(comicPrice);

        // Añadir el LinearLayout de texto al LinearLayout del cómic
        comicLayout.addView(textLayout);

        // Añadir el LinearLayout del cómic al LinearLayout principal
        linearLayoutCistell.addView(comicLayout);
    }
}
