package com.kraysolutions.myapplication;

import android.graphics.Path;
import android.view.View;

public class Controlador implements View.OnClickListener {

    private Operacion operaciones;
    private MainActivity vista;
    private String num = null;
    private int num1 = 0;
    private int num2 = 0;
    static int posicion = 0;
    private int notificador = 1;
    private int indicador;

    public Controlador() {

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.cero:
                MainActivity.operaciones.setText(MainActivity.operaciones.getText() + "0");
                break;

            case R.id.uno:
                MainActivity.operaciones.setText(MainActivity.operaciones.getText() + "1");
                break;

            case R.id.dos:
                MainActivity.operaciones.setText(MainActivity.operaciones.getText() + "2");
                break;

            case R.id.tres:
                MainActivity.operaciones.setText(MainActivity.operaciones.getText() + "3");
                break;

            case R.id.cuatro:
                MainActivity.operaciones.setText(MainActivity.operaciones.getText() + "4");
                break;

            case R.id.cinco:
                MainActivity.operaciones.setText(MainActivity.operaciones.getText() + "5");
                break;

            case R.id.seis:
                MainActivity.operaciones.setText(MainActivity.operaciones.getText() + "6");
                break;

            case R.id.siete:
                MainActivity.operaciones.setText(MainActivity.operaciones.getText() + "7");
                break;

            case R.id.ocho:
                MainActivity.operaciones.setText(MainActivity.operaciones.getText() + "8");
                break;

            case R.id.nueve:
                MainActivity.operaciones.setText(MainActivity.operaciones.getText() + "9");
                break;

            case R.id.delete:
                MainActivity.operaciones.setText("");
                notificador = 1;
                Operacion.setNum1(0);
                Operacion.setNum2(0);
                posicion = 0;
                MainActivity.delete.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        MainActivity.respuesta.setText("");
                        return false;
                    }
                });
                break;

//--------------------------------------------------------------------------------------------------

            case R.id.mas:
                operar();
                if(indicador!=1){MainActivity.operaciones.setText(MainActivity.operaciones.getText() + "+"); }
                break;

            case R.id.menos:
                operar();
                if(indicador!=1){MainActivity.operaciones.setText(MainActivity.operaciones.getText() + "-"); }
                break;

            case R.id.por:
                operar();
                if(indicador!=1){MainActivity.operaciones.setText(MainActivity.operaciones.getText() + "x"); }
                break;

            case R.id.dividido:
                operar();
                if(indicador!=1){MainActivity.operaciones.setText(MainActivity.operaciones.getText() + "/"); }
                break;

            case R.id.igual:
                operar();
                break;
        }

    }

    public void operar() {
        try {
            while (posicion < MainActivity.operaciones.getText().length()) {
                String simbolo = MainActivity.operaciones.getText().subSequence(posicion, posicion + 1).toString();

                if (simbolo.equals("+")) {
                    Operacion.setNum2(Integer.parseInt(MainActivity.operaciones.getText().toString().substring(posicion + 1)));
                    MainActivity.respuesta.setText(Operacion.sumar());
                    Operacion.setNum1((Integer.parseInt(Operacion.sumar())));
                    posicion++;
                    break;
                } else if(simbolo.equals("-")){
                    Operacion.setNum2(Integer.parseInt(MainActivity.operaciones.getText().toString().substring(posicion + 1)));
                    MainActivity.respuesta.setText(Operacion.restar());
                    Operacion.setNum1((Integer.parseInt(Operacion.restar())));
                    posicion++;
                } else if(simbolo.equals("x")){
                    Operacion.setNum2(Integer.parseInt(MainActivity.operaciones.getText().toString().substring(posicion + 1)));
                    MainActivity.respuesta.setText(Operacion.multiplicar());
                    Operacion.setNum1((Integer.parseInt(Operacion.multiplicar())));
                    posicion++;
                } else if(simbolo.equals("/")){
                    Operacion.setNum2(Integer.parseInt(MainActivity.operaciones.getText().toString().substring(posicion + 1)));
                    MainActivity.respuesta.setText(Operacion.dividir());
                    Operacion.setNum1((Integer.parseInt(Operacion.dividir())));
                    posicion++;
                }
                posicion++;
            }

            if (notificador == 1) {
                Operacion.setNum1(Integer.parseInt(MainActivity.operaciones.getText().toString()));
                notificador = 0;
            } else {
            }
            indicador = 0;
        } catch (Exception ex){
            System.out.println(ex);
            indicador = 1;
        }

    }

}