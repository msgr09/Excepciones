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
public class Excepcion5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entero, divisor, resultado;
        String a, b;
        System.out.println("Inserte un dividendo y un divisor");
        a = sc.next();
        b = sc.next();
        try {
            entero = Integer.parseInt(a);
            divisor= Integer.parseInt(b);
            
            numError(Integer.parseInt(a), Integer.parseInt(b));
            resultado = entero / divisor;
        } catch (NumberFormatException nfE) {
            System.out.println("INCORRECTO" + nfE.getMessage());
        } catch (ArithmeticException aE) {
            System.out.println("Division por 0 INDEFINDA" + aE.getMessage());
        }
        //Queria poner una excepcion si pasaba del tamaño de los enteros pero al parecer tambien es un NumberFormatException
    }

    public static void numError(int entero, int divisor) throws NumErrorExpection{
        if(entero<10 || divisor<10){
            throw new NumErrorExpection ("El número es menor que 10");
        }
    }

   } 
