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
public class P34 {
    
    public static void main(String[] args) { 
        Float[] califi = new Float[10];
        System.out.println("Introduce una calificacion");
        String entradaTeclado = "";
        Scanner entradaScanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            entradaTeclado = entradaScanner.nextLine();
            califi[i] = Float.parseFloat(entradaTeclado);
        }
    }
}
