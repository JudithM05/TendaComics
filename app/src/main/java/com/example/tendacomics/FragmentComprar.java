package com.example.tendacomics;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentComprar extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla el layout para este fragmento
        View rootView = inflater.inflate(R.layout.fragment_comprar, container, false);

        // Inicializa el botón después de inflar la vista
        Button buttonComprar = rootView.findViewById(R.id.buttonComprar);

        // Configura el listener para el botón
        buttonComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Comprobamos en qué actividad estamos
                String actividadActual = getActivity().getClass().getSimpleName();

                if (getActivity() instanceof CistellaCompra) {
                    // Si estamos en CistellaCompra, iniciamos Compradetallada
                    Intent intent = new Intent(getActivity(), Compradetallada.class);
                    startActivity(intent);
                } else if (getActivity() instanceof Compradetallada) {
                    // Si estamos en CompraDetallada, mostramos un Toast
                    Toast.makeText(getActivity(), "La compra s'ha realitzat amb èxit", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        // Devuelve la vista inflada
        return rootView;
    }
}
