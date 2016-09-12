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
public class P23 {
    public static void main(String[] args) {
        Integer arreglo[][] = new Integer[10][10];
        int i, j, c = 1;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                arreglo[i][j] = c;
                c++;
            }
        }
        for (i = 0; i <= 10; i++) {
            for (j = 0; j <= 10; j++) {
                System.out.println(arreglo[0][j] + "\t" 
                                 + arreglo[1][j] + "\t" 
                                 + arreglo[2][j] + "\t"
                                 + arreglo[3][j] + "\t" 
                                 + arreglo[4][j] + "\t"
                                 + arreglo[5][j] + "\t" 
                                 + arreglo[6][j] + "\t"
                                 + arreglo[7][j] + "\t" 
                                 + arreglo[8][j] + "\t" 
                                 + arreglo[9][j]);
            }
        }
    }
}
