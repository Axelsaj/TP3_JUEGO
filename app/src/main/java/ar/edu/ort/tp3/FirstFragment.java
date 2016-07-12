package ar.edu.ort.tp3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
//

public class FirstFragment extends Fragment implements View.OnClickListener {
   BotonJuego b1,b2,b3,b4,b5,b6,b7,b8,b9;
    ArrayList<Jugada> jugadas;
    Jugada jugada;
    MainActivity actividad;
    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        actividad = (MainActivity) getActivity();
        jugadas = actividad.getJugadas();
        jugada = new Jugada();
        jugada.nombre = actividad.userName;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setHasOptionsMenu(true); // to show actionbar icon calling onCreateOptionsMenu
        // Inflate the layout for this fragment
        View  v= inflater.inflate(R.layout.fragment_first, container, false);

        b1 = (BotonJuego) v.findViewById(R.id.imageButton1);
        b2 = (BotonJuego) v.findViewById(R.id.imageButton2);
        b3 = (BotonJuego) v.findViewById(R.id.imageButton3);
        b4 = (BotonJuego) v.findViewById(R.id.imageButton4);
        b5 = (BotonJuego) v.findViewById(R.id.imageButton5);
        b6 = (BotonJuego) v.findViewById(R.id.imageButton6);
        b7 = (BotonJuego) v.findViewById(R.id.imageButton7);
        b8 = (BotonJuego) v.findViewById(R.id.imageButton8);
        b9 = (BotonJuego) v.findViewById(R.id.imageButton9);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

        return v;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButton1:
                b1.invertir();
                b2.invertir();
                b4.invertir();
                jugada.secuencia = jugada.secuencia + "1,";
                break;
            case R.id.imageButton2:
                b1.invertir();
                b2.invertir();
                b5.invertir();
                b3.invertir();
                jugada.secuencia = jugada.secuencia + "2,";
                break;
            case R.id.imageButton3:
                b2.invertir();
                b3.invertir();
                b6.invertir();
                jugada.secuencia = jugada.secuencia + "3,";
                break;
            case R.id.imageButton4:
                b1.invertir();
                b5.invertir();
                b7.invertir();
                b4.invertir();
                jugada.secuencia = jugada.secuencia + "4,";
                break;
            case R.id.imageButton5:
                b4.invertir();
                b6.invertir();
                b8.invertir();
                b2.invertir();
                b5.invertir();
                jugada.secuencia = jugada.secuencia + "5,";
                break;
            case R.id.imageButton6:
                b6.invertir();
                b3.invertir();
                b5.invertir();
                b9.invertir();
                jugada.secuencia = jugada.secuencia + "6,";
                break;
            case R.id.imageButton7:
                b7.invertir();
                b8.invertir();
                b4.invertir();
                jugada.secuencia = jugada.secuencia + "7,";
                break;
            case R.id.imageButton8:
                b8.invertir();
                b9.invertir();
                b7.invertir();
                b5.invertir();
                jugada.secuencia = jugada.secuencia + "8,";
                break;
            case R.id.imageButton9:
                b9.invertir();
                b8.invertir();
                b6.invertir();
                jugada.secuencia = jugada.secuencia + "9,";

                break;

        }
        jugada.Cantidad_clicks++;
        if(b1.isEstado()&& b2.isEstado() && b3.isEstado() && b4.isEstado() &&
                    b5.isEstado() && b6.isEstado() && b7.isEstado() && b8.isEstado() && b9.isEstado()) {
            Log.d("ganaste", "a4    migo");
            Toast.makeText(getActivity(), "Ganaste amigo.",
                    Toast.LENGTH_SHORT).show();
            jugadas.add(jugada);
            jugada = new Jugada();
            jugada.Cantidad_clicks = 0;
            jugada.secuencia = "";
            jugada.nombre = actividad.userName;

        }

        if(!b1.isEstado()&& !b2.isEstado() && !b3.isEstado() && !b4.isEstado() &&
                !b5.isEstado() && !b6.isEstado() && !b7.isEstado() && !b8.isEstado() && !b9.isEstado()) {
            Log.d("ganaste", "a4    migo");
            Toast.makeText(getActivity(), "Ganaste amigo.",
                    Toast.LENGTH_SHORT).show();
            jugadas.add(jugada);
            jugada = new Jugada();
            jugada.Cantidad_clicks = 0;
            jugada.secuencia = "";
            jugada.nombre = actividad.userName;

        }
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.first,menu);
    }

        @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_restart:
                Log.d("Restart", "ison");
                b1.restart();
                b2.restart();
                b3.restart();
                b4.restart();
                b5.restart();
                b6.restart();
                b7.restart();
                b8.restart();
                b9.restart();
                break;

        }
        return true;
        }
    }


