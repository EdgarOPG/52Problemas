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
public class P19 {  
    public static void main(String[] args) throws InterruptedException {
        Integer segundos;
        Integer minutos;
        Integer horas;
        int i,j,k;
        String entradaTeclado = "";
        System.out.println("Introduce la hora en este formato hh/mm/ss");
        Scanner entradaScanner = new Scanner(System.in);
        entradaTeclado = entradaScanner.nextLine();
        horas = Integer.parseInt(entradaTeclado.substring(0,2));
        minutos = Integer.parseInt(entradaTeclado.substring(3,5));
        segundos = Integer.parseInt(entradaTeclado.substring(6,8));
        for (i = horas; i < 24; i++) {
            for (j = minutos; j < 60; j++) {
                for (k = segundos; k < 60; k++) {
                    Thread.sleep(1000);
                    System.out.println(i + ":" + j + ":" + k);
                }
            }
        }
    }
}
