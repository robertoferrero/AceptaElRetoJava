/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class A206_TaxiPorManhattan {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            int distancia   = entrada.nextInt();
            int quadrat_dis = distancia*distancia;

            for (int catet1 = 1; catet1 < distancia; catet1++) {
                double catet2 = Math.sqrt(quadrat_dis - catet1*catet1);
                if (catet2-(int)catet2 == 0) {
                    System.out.println(catet1 + (int) catet2);
                    break;
                }
            }
        }
        
    }
}
