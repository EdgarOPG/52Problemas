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
public class P14 {
    public static void main(String[] args) {
        Float[] valores = new Float[5]; 
        System.out.println("Introduce 5 numeros");
        Scanner entradaScanner = new Scanner(System.in);
        for (int i = 0; i <=4 ; i++) {
            String entradaTeclado = entradaScanner.nextLine();
            valores[i] = Float.parseFloat(entradaTeclado);
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(valores[j] < valores[j + 1]){
                    Float temp = valores[j + 1];
                    valores[j + 1] = valores[j];
                    valores[j] = temp;
                }
            }
        }
        for (int i = 0; i <= 4; i++) {
            System.out.println(valores[i]);
        }
    }
}
