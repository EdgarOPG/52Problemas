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
public class P06 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine();
        Integer l = Integer.parseInt(entradaTeclado);
        for (int i = 0; i <= l; i++) {
            System.out.println(i);
        }
    }
}
