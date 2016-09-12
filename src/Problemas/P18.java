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
public class P18 {
    public static void main(String[] args) {
        Integer count = 0;
        System.out.println("Ingrese una palabra");
        String entradaTeclado = "";
        Character c;
        Scanner entradaScanner = new Scanner(System.in);
        entradaTeclado = entradaScanner.nextLine();
        c = entradaScanner.nextLine().charAt(0);
        for (int i = 0; i < 10; i++) {
            if(c == entradaTeclado.charAt(i)){
                count++;
            }
        }
        System.out.println("La letra "+ c + " aparece " + count + " veces");
    }
}
