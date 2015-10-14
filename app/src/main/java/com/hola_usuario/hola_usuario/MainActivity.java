package com.hola_usuario.hola_usuario;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

            //solo se declaran las que interactuan
            private EditText txtNombre;
            private Button btnAceptar;


    @Override  //es el constructor
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenemos una referencia a los controles de la interfaz
        //Inicializar
        btnAceptar=(Button)findViewById(R.id.btnAceptar);


    }


    //metodo para pasar un dato txt de una ventana a la otra
    public void botonSaludo(View v){
            //de donde sale y hacia donde se envia la accion del boton
        Intent intento = new Intent(MainActivity.this, SaludoActivity.class);
            //lo que entra por teclado = nombre del usuario
        txtNombre=(EditText)findViewById(R.id.editText_nombre);

        //if del toats
        if("".equals(txtNombre.getText().toString().trim())){
            showToats();
            return;
        }


            //inicializar el bundle - con esto paso los objetos
            // aqui guardo lo que entra por teclado
            //key="nombre" clave puedo nombrarla como yo quiera, valor es el nombre de la variable que temgo declarada arriba,
        Bundle bun = new Bundle();
        bun.putString("nombre", txtNombre.getText().toString());
            //escojer el metodo putextras que tenga bundle
        intento.putExtras(bun);
            //staractivity intent intent
        startActivity(intento);

            //ahora asignar el metodo al boton .xml, busco boton, propiedades, poner onclick

    }

    //crear un toats
    public void showToats(){
        Context context = getApplicationContext();
        CharSequence text = getResources().getString(R.string.noNameMsg);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }


}
