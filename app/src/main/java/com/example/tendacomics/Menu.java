package com.example.tendacomics;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment; // Asegúrate de importar la clase correcta

public class Menu extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflamos el layout del fragmento
        View rootView = inflater.inflate(R.layout.fragment_menu, container, false);

        // Obtener las referencias a los ImageView
        ImageView imageViewCasa = rootView.findViewById(R.id.imageViewCasa);
        ImageView imageViewLupa = rootView.findViewById(R.id.imageViewLupa);
        ImageView imageViewCompra = rootView.findViewById(R.id.imageViewCompra);
        ImageView imageViewAjuda = rootView.findViewById(R.id.imageViewAjuda);

        // Configurar los listeners para cada ImageView
        imageViewCasa.setOnClickListener(v -> {
            if (getActivity() != null) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        imageViewLupa.setOnClickListener(v -> {
            if (getActivity() != null) {
                Intent intent = new Intent(getActivity(), BuscarActivity.class);
                startActivity(intent);
            }
        });

        imageViewCompra.setOnClickListener(v -> {
            if (getActivity() != null) {
                Intent intent = new Intent(getActivity(), CistellaCompra.class);
                startActivity(intent);
            }
        });

        imageViewAjuda.setOnClickListener(v -> {
            if (getActivity() != null) {
                Intent intent = new Intent(getActivity(), Ajuda.class);
                startActivity(intent);
            }
        });
        return rootView;
    }
}
