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

        // Afegir còmics al cistell
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
        // Crear un nou LinearLayout per cada còmic
        LinearLayout comicLayout = new LinearLayout(this);
        comicLayout.setOrientation(LinearLayout.HORIZONTAL);
        comicLayout.setPadding(8, 8, 8, 8);

        // Afegir ImageView per la imatge del còmic
        ImageView comicImage = new ImageView(this);
        comicImage.setLayoutParams(new LinearLayout.LayoutParams(150, 200)); // Ajusta el tamaño según sea necesario
        comicImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        comicImage.setImageResource(imageResource);
        comicLayout.addView(comicImage);

        // Crear un LinearLayout vertical pel títol i el preu
        LinearLayout textLayout = new LinearLayout(this);
        textLayout.setOrientation(LinearLayout.VERTICAL);
        textLayout.setPadding(16, 0, 0, 0);

        // Afegir TextView pel títol del còmic
        TextView comicTitle = new TextView(this);
        comicTitle.setText(title);
        comicTitle.setTextSize(16);
        textLayout.addView(comicTitle);

        // Afegir TextView pel preu del còmic
        TextView comicPrice = new TextView(this);
        comicPrice.setText(price);
        comicPrice.setTextSize(14);
        comicPrice.setTextColor(getResources().getColor(android.R.color.darker_gray));
        textLayout.addView(comicPrice);

        // Afegir el LinearLayout de text al LinearLayout del còmic
        comicLayout.addView(textLayout);

        // Afegir el LinearLayout del còmic al LinearLayout principal
        linearLayoutCistell.addView(comicLayout);
    }
}
