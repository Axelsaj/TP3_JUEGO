package ar.edu.ort.tp3;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

import java.util.Random;

/**
 *
 * Created by 41709606 on 28/6/2016.
 */
    public class BotonJuego extends ImageButton {
    private boolean estado;
    public BotonJuego (Context context, AttributeSet attrs) {
        super(context, attrs);
        estado= new Random().nextBoolean();
        pintar();
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public void invertir(){
        if(estado==true) {
            estado = false;
        } else{
            estado=true;
        }
        pintar();
}


    private void pintar() {
        if(estado==true)
        {
            this.setImageResource(R.drawable.ic_alarm_black_24dp);

        } else{
        this.setImageResource(R.drawable.ic_check_circle_black_24dp);
    }
}
    public void restart(){
        estado= new Random().nextBoolean();
        pintar();
    }
}
