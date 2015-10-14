package com.hola_usuario.hola_usuario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {

                private TextView textoSalida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        textoSalida=(TextView)findViewById(R.id.txtView_SaludoEntrada);

            //recupera lo que se guardo en el bundle de la activitymain
        Bundle bun = this.getIntent().getExtras();

            //cojo la variable instanciada y recojo el texto del bun con clave "nombre" del main activity
            //el "hola" es lo que estará con "nombre" como es un string concateno
        textoSalida.setText("Hola "+bun.getString("nombre"));

    }



}
