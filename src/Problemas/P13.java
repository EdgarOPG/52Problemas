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
public class P13 {
    public static void main(String[] args) {
        Integer count2 = 0, count3 = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0){
                count3++;
            }
            if(i % 2 == 0){
                count2++;
            }
        }
        System.out.println("Los multiplos de 3 son: " + count3 +
                            "\nLos multiplos de 2 son: " + count2);
    }
}
