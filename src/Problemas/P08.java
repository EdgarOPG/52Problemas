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
public class P08 {
    
    public void preguntar(){
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine();
        switch(entradaTeclado.toLowerCase()){
                case "s": System.out.println("OK");
                    break;
                case "n": System.out.println("Osh");
                    break;
                default: System.out.println("Entrada no valida");
                        this.preguntar();
                    break;
            }
        }

    public P08() {
    preguntar();
    }
    
    
    public static void main(String[] args) {
    System.out.println("Ingrese s/n");
    P08 problema = new P08();
    problema.preguntar();
    }
    
}
