/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problemas;

/**
 *
 * @author edgar
 */
public class P12 {
    public static void main(String[] args) {
        Integer nones = 0, pares = 0;
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0){
                pares = pares + i;
            } else {
                nones = nones + 1;
            }
        }
        System.out.println("Suma de los pares: " 
                            + pares + "\nSuma de los nones: " + nones);
    }
   
}
