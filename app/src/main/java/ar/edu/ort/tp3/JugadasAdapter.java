package ar.edu.ort.tp3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 41586514 on 5/7/2016.
 */
public class JugadasAdapter extends BaseAdapter {
    ArrayList<Jugada> jugada;
    Context context;

    public JugadasAdapter(Context context, ArrayList<Jugada> jugada) {
        this.context = context;
        this.jugada=jugada;
    }
    @Override
    public int getCount() {
        return jugada.size();
    }

    @Override
    public Object getItem(int i) {
        return jugada.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item, viewGroup, false);
        }

        TextView nombreTV = (TextView)view.findViewById(R.id.nombre);
        TextView secuenciaTV = (TextView)view.findViewById(R.id.secuencia);
        TextView clicksTV = (TextView)view.findViewById(R.id.Cantidad_clicks);


        Jugada p = jugada.get(position);
        nombreTV.setText(p.nombre);
        secuenciaTV.setText(p.secuencia);
        clicksTV.setText(String.valueOf(p.Cantidad_clicks));
        return view;
    }
    }
