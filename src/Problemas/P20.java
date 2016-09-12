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
public class P20 {
    public static void main(String args[])
   {
      int n, c, fact = 1;
 
      System.out.println("Ingresa un numero para calcular");
      Scanner in = new Scanner(System.in);
 
      n = in.nextInt();
 
      if ( n < 0 )
         System.out.println("No puede ser numero.");
      else
      {
         for ( c = 1 ; c <= n ; c++ )
            fact = fact*c;
 
         System.out.println("El factorial de " + n + " es = " + fact);
      }
   }
}
