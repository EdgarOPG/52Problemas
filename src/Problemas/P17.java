/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problemas;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class P17 {
    public static void main(String[] args) {
        String entradaTeclado = "";
        Integer count = 0;
        Integer suma = 0;
        Scanner entradaScanner = new Scanner(System.in);
        System.out.println("Ingrese un limite inferior");
        entradaTeclado = entradaScanner.nextLine();
        Integer valorInf = Integer.parseInt(entradaTeclado);
        System.out.println("Ingrese un limite superior");
        entradaTeclado = entradaScanner.nextLine();
        Integer valorSup = Integer.parseInt(entradaTeclado);
        if(valorSup > valorInf){
            for (int i = valorInf; i <= valorSup; i++) {
            if(i % 2 == 0){
                count++;
                suma = suma + i;
                System.out.println("El " + i + " es par");
            }
        }
            System.out.println("La suma de los pares es: " + suma +
                                 "\nEl total de pares es: " + count);
        } else {
            System.out.println("El primer numero debe ser menor que el segundo");
        }
    }
}
