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
import android.widget.ListView;

import java.util.ArrayList;


public class SecondFragment extends Fragment {

    ArrayList<Jugada> jugadas;
    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        setHasOptionsMenu(true); // to show actionbar icon calling onCreateOptionsMenu
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        ListView ListaJuan;
        ListaJuan =(ListView) view.findViewById(R.id.ListaJuan);
        MainActivity actividad = (MainActivity) getActivity();
        jugadas = actividad.getJugadas();
        JugadasAdapter adapter = new JugadasAdapter(getContext(),jugadas);
        ListaJuan.setAdapter(adapter);

         return view;

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.second,menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_gallery:
                Log.d("gallery", "ison");
                break;
        }
        return true;
    }
}