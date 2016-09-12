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
public class P10 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        String entradaTeclado = "";
        Scanner entradaScanner = new Scanner(System.in);
        entradaTeclado = entradaScanner.nextLine();
        Integer valor = Integer.parseInt(entradaTeclado);
            if(valor % 2 == 0){
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }
    }
    
}
