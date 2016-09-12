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
public class P21 {
    public static void main(String[] args) {
        Integer countP = 0, countI = 0;
        String isPar = "";
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                isPar = "si";
            } else {
                isPar = "no";
            }
            switch (isPar) {
                case "si": countP = countP + i;
                break;
                case "no": countI = countI + i;
            }
        }
        System.out.println("La suma de los pares es: " + countP + 
                            "\nY la de los impares es: " + countI);
    }
}
