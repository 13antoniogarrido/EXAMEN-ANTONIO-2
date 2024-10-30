package org.example;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Examen {

    public void ejercicio1(){
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int numero = 0;
        int intentos = 9;//números de intentos
        int numeroaleatorio = aleatorio.nextInt(100);//números aleatorios que coge
        //System.out.println(numeroaleatorio);
        boolean error = true;
        while (error = true) {
            try {//es para que introduzcan un numero si o si
                System.out.println("introduce un número, prueba suerte");// pido un número
                numero = entrada.nextInt();//introduce un numero por teclado
                for (int i = 0; i < 9; i++) {//se hace un bucle para que pueda escribir 10 veces si el numero aleatorio no es acertado
                    if (numeroaleatorio == numero) {
                        System.out.println("has acertado el numero aleatorio" + numero);//si el número aleatorio es acertado, te imprime esto en pantalla
                    } else {
                        System.out.println("no has tenido suerte, prueba con otro numero, tienes " + intentos--);//si el número no es acertado, imprime que vuelva a probar y los intentos que te quedan
                        numero = entrada.nextInt();
                    }
                }break;
            } catch (InputMismatchException e1) {
                System.out.println("has introducido un caracter mal, introduce un numero" + e1);//esto es cuando escribes un texto en vez de un número y te pide que introduzcas un número
                entrada.nextLine();
            }
        }System.out.println("has perdido todas las oportunidades, otro dia será");//imprime el texto al acabar los 10 intentos y estan todos fallados

    }

    public void ejercicio2(){

    }
}
