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
public class P05 {
    
    public static void main(String[] args) {
        Integer c = 0;
        for (int i = 0; i <= 100; i++) {
            if(i % 2 != 0){
                System.out.println(i);
                c++;
            }
        }
        System.out.println("El numero de impares es " + c);
    }
}
