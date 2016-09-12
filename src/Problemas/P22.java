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
public class P22 {
    public static void main(String[] args) {
        System.out.println("Introduce una frase");
        String entradaTeclado = "";
        Scanner entradaScanner = new Scanner(System.in);
        entradaTeclado = entradaScanner.nextLine();
        for (int i = 0; i < 5; i++) {       
            for (int j = 0; j < i; j++) {
                System.out.println("\t");
            }
            System.out.println(entradaTeclado);
        }
    }
}
