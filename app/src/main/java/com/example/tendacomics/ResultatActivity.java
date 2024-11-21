package com.example.tendacomics;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResultatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);

        // Configurar el clic para cada cómic

        // Gwenpool (ya configurado en tu código)
        ImageButton imageButtonGwenpool = findViewById(R.id.imageButtonGwenpool);
        imageButtonGwenpool.setOnClickListener(v -> navigateToVistaDetallada(
                R.drawable.portada_gwenpool_uno,
                "La increíble Masacre-Gwen",
                "¡La sensación de Internet en su propia serie! Gwen solía ser una lectora de cómics, como tú, hasta que un día despertó en un mundo donde los personajes de las viñetas son reales. ¡Estaba en el Universo Marvel! Y a partir de ahí, cualquier cosa es posible.",
                "18,95 €"
        ));

        // Spiderman
        ImageButton imageButtonSpiderman = findViewById(R.id.imageButtonSpiderman);
        imageButtonSpiderman.setOnClickListener(v -> navigateToVistaDetallada(
                R.drawable.spiderman_honor_a_slucis,
                "El asombroso Spiderman 14: Un nuevo día",
                "¡El amanecer de una era del trepamuros! Tras los devastadores sucesos de “Un día más”, Peter Parker deja el pasado atrás y afronta “Un nuevo día”. La vida del trepamuros ha cambiado como nunca antes lo había hecho. Presencia ahora la llegada de nuevos amigos, nuevos villanos y algunas caras familiares.",
                "18,05 €"
        ));

        // Doctor Strange
        ImageButton imageDoctorStrange = findViewById(R.id.imageDoctorStrange);
        imageDoctorStrange.setOnClickListener(v -> navigateToVistaDetallada(
                R.drawable.el_que_hace_fufufu,
                "Doctor Extraño 04: Señor Agonía",
                "En “Los últimos días de la magia”, la misteriosa criatura llamada Señor Agonía ayudó al Doctor Extraño a derrotar al Empirikul. Pero no te confundas: Agonía no es un héroe y ahora enseñará a Extraño el verdadero significado de su nombre. Asiste a la culminación de la ya clásica etapa de Jason Aaron y Chris Bachalo.",
                "11,88 €"
        ));

        // Batman
        ImageButton imageButtonBatman = findViewById(R.id.imageButtonBatman);
        imageButtonBatman.setOnClickListener(v -> navigateToVistaDetallada(
                R.drawable.el_senor_de_la_nocheee,
                "Batman y el Joker: El Dúo Mortífero 04",
                "Batman pide ayuda a Nightwing y a Catwoman. Los restos mutilados de Gordon no dejan de llegar a la policía de Gotham. La incómoda alianza entre el Joker y el Caballero Oscuro se pone a prueba cuando se suben a un imparable tren. ¡Abrochaos los cinturones!",
                "3,33 €"
        ));

        // Oshi no Ko
        ImageButton imageOshiNoKo = findViewById(R.id.imageOshiNoKo);
        imageOshiNoKo.setOnClickListener(v -> navigateToVistaDetallada(
                R.drawable.oshi_no_ko_uno,
                "Oshi no Ko Vol. 1",
                "La historia de un ídolo y los secretos que esconde detrás del escenario. Una trama llena de giros y emociones que no te dejará indiferente.",
                "12,95 €"
        ));

        // Persona 5
        ImageButton imageButtonPersona5 = findViewById(R.id.imageButtonPersona5);
        imageButtonPersona5.setOnClickListener(v -> navigateToVistaDetallada(
                R.drawable.portada_personacincomanga,
                "Persona 5 01",
                "Persona 5, el aclamado videojuego, ahora en cómic! Tras ayudar a una mujer en apuros, Akira Kurusu es acusado de un crimen que no ha cometido y se ve obligado a dejar atrás su ciudad natal para iniciar una nueva vida estudiantil en el instituto Shujin de Tokio. En su primer día de clase, se topa con el problemático Ryuji Sakamoto, y juntos acaban en un castillo misterioso conocido como «Palacio» cuyo rey es Kamoshida, un profesor corrupto. Allí, imbuido por las llamas de la rebelión, Akira despierta el poder de su «Persona». Los chicos logran escapar del lugar gracias a Morgana, un misterioso gato. No obstante, en el mundo real, las malas artes de Kamoshida provocan una terrible desgracia.",
                "10,40 €"
        ));

        // Krymsoul
        ImageButton imageButtonKrymsoul = findViewById(R.id.imageButtonKrymsoul);
        imageButtonKrymsoul.setOnClickListener(v -> navigateToVistaDetallada(
                R.drawable.krymsoul,
                "Krymsoul",
                "Después de siglos de paz en el reino de Mythcrest, un gran dragón ha interrumpido la estabilidad del lugar durante la noche del solsticio y ha provocado una matanza que ha teñido de escarlata las calles de la ciudad. Eyra, una estudiante de magia, decide tomar las riendas de la situación para poder proteger aquello que más quiere: su hermana. Parece que lo peor ya ha pasado, pero lo que no saben los supervivientes de esta tragedia es que una vez a la semana surgirá de los cielos una nueva bestia para matarlos a todos.",
                "9,45 €"
        ));

        // My Hero Academia
        ImageButton imageButtonHeroAcademia = findViewById(R.id.imageButtonHeroAcademia);
        imageButtonHeroAcademia.setOnClickListener(v -> navigateToVistaDetallada(
                R.drawable.heroaca,
                "My Hero Academia 01",
                "Estamos en un mundo donde abundan los superhéroes (y los supervillanos). Los mejores humanos son entrenados en la Academia de Héroes para optimizar sus poderes.\n" +
                        "\n" +
                        "Entre la minoria normal, sin poder alguno, aparece Izuku Midoriya, dispuesto a ser una excepción y formarse en la Academia.",
                "8,08 €"
        ));
    }

    // Método reutilizable para navegar a la vista detallada
    private void navigateToVistaDetallada(int imageResource, String title, String description, String price) {
        Intent intent = new Intent(this, vistaDetallada.class);
        intent.putExtra("imageResource", imageResource);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        intent.putExtra("price", price);
        startActivity(intent);
    }
}