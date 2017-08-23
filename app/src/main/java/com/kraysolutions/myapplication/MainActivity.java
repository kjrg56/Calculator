package com.kraysolutions.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static TextView respuesta;
    public static TextView operaciones;
    public static Button delete;
    public Button suma;
    public Button resta;
    public Button multi;
    public Button division;
    public Button cero;
    public Button uno;
    public Button dos;
    public Button tres;
    public Button cuatro;
    public Button cinco;
    public Button seis;
    public Button siete;
    public Button ocho;
    public Button nueve;
    public Button igual;

    private Controlador controlador;

    public MainActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controlador = new Controlador();

        operaciones = (TextView) findViewById(R.id.operaciones);

        respuesta = (TextView) findViewById(R.id.respuesta);

        suma = (Button) findViewById(R.id.mas);
        suma.setOnClickListener(controlador);

        resta = (Button) findViewById(R.id.menos);
        resta.setOnClickListener(controlador);

        multi = (Button) findViewById(R.id.por);
        multi.setOnClickListener(controlador);

        division = (Button) findViewById(R.id.dividido);
        division.setOnClickListener(controlador);

        delete = (Button) findViewById(R.id.delete);
        delete.setOnClickListener(controlador);

        cero = (Button) findViewById(R.id.cero);
        cero.setOnClickListener(controlador);

        uno = (Button) findViewById(R.id.uno);
        uno.setOnClickListener(controlador);

        dos = (Button) findViewById(R.id.dos);
        dos.setOnClickListener(controlador);

        tres = (Button) findViewById(R.id.tres);
        tres.setOnClickListener(controlador);

        cuatro = (Button) findViewById(R.id.cuatro);
        cuatro.setOnClickListener(controlador);

        cinco = (Button) findViewById(R.id.cinco);
        cinco.setOnClickListener(controlador);

        seis = (Button) findViewById(R.id.seis);
        seis.setOnClickListener(controlador);

        siete = (Button) findViewById(R.id.siete);
        siete.setOnClickListener(controlador);

        ocho = (Button) findViewById(R.id.ocho);
        ocho.setOnClickListener(controlador);

        nueve = (Button) findViewById(R.id.nueve);
        nueve.setOnClickListener(controlador);

        igual = (Button) findViewById(R.id.igual);
        igual.setOnClickListener(controlador);

    }


}