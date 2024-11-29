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
        // Infla el layout per aquest fragment
        View rootView = inflater.inflate(R.layout.fragment_comprar, container, false);

        // Inicialitza el botó després d'inflar la vista
        Button buttonComprar = rootView.findViewById(R.id.buttonComprar);

        // Configura el listener pel botó
        buttonComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Comprobem en quina activitat estem
                String actividadActual = getActivity().getClass().getSimpleName();

                if (getActivity() instanceof CistellaCompra) {
                    // Si estem en CistellaCompra, iniciem Compradetallada
                    Intent intent = new Intent(getActivity(), Fer_compra.class);
                    startActivity(intent);
                } else if (getActivity() instanceof Fer_compra) {
                    // Si estem en CompraDetallada, mostrem un Toast
                    Toast.makeText(getActivity(), "La compra s'ha realitzat amb èxit", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        // Retorna la vista inflada
        return rootView;
    }
}
