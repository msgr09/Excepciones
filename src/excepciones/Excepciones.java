/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author Marlon gonzalez
 */
public class Excepciones {

    public static void main(String[] args) {
        formatoNumero();
        desborde();
        aritmetico();
        
    }


    public static void formatoNumero() {
        int numero;
        String cadena = " 1";
        try {

            numero = Integer.parseInt(cadena);

        } catch (NumberFormatException e) {

            System.out.println("No es un número, es una cadena de texto." + e);

        }
    }
    public static void desborde() {

        try {
            int v[] = new int[3];
            for (int i = 0; i < 5; i++) {
                v[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public static void aritmetico() {

        int numero = 5, resultado;
        try {
            resultado = numero / 0;
            System.out.print(resultado);
        } catch (ArithmeticException e) {
            System.out.println("division por cero INDEFINIDA");
        }
    }

    

 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private static class MinNumberExpection extends Exception {

        public MinNumberExpection(String el_número_es_menor_que_10) {
        }
    }
}

    
    

    

        