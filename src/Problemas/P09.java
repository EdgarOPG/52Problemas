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
public class P09 {
    public static void main(String[] args) {
        String entradaTeclado = "";
        System.out.println("Introduce un numero");
        Scanner entradaScanner = new Scanner(System.in);
        entradaTeclado = entradaScanner.nextLine();
        Integer valor = Integer.parseInt(entradaTeclado);
        if (valor == 0) {
            System.out.println("Es Cero");
        } else {
            if(valor > 0){
                System.out.println("Es positivo");
            } else {
                System.out.println("Es negativo");
            }
        }
    }
    
}
