package com.kraysolutions.myapplication;

/**
 * Created by Kevin on 29/04/2017.
 */

public class Operacion {

    private static int num1;
    private static int num2;
    private static int respuesta;

    public Operacion(){

    }



    public static void setNum1(int num1){
        Operacion.num1 = num1;
    }

    public static void setNum2(int num2){
        Operacion.num2 =  num2;
    }




    public static String sumar(){
        respuesta = num1 + num2;
        return String.valueOf(respuesta);
    }

    public static String restar(){
        respuesta = num1 - num2;
        return String.valueOf(respuesta);
    }

    public static String multiplicar(){
        respuesta = num1 * num2;
        return String.valueOf(respuesta);
    }

    public static String dividir(){
        respuesta = num1 / num2;
        return String.valueOf(respuesta);
    }


}
