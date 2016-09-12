/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problemas;

import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class P26 {

    public static void main(String[] args) {
        System.out.println("Introduce una frase");
        String entradaTeclado = "";
        Scanner entradaScanner = new Scanner(System.in);
        entradaTeclado = entradaScanner.nextLine();
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);
        formatter.format("%1$55s", entradaTeclado);
        System.out.println(sb);
    }

}
