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
public class A474_TuAmigableVecino {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        entrada.nextLine();
        
        while(casos>0) {
            casos--;            
            int posSp = entrada.nextInt();
            int posB1 = entrada.nextInt();
            int posB2 = entrada.nextInt();
            int salida = Math.min(Math.abs(posB1-posSp)+Math.abs(posB2-posB1),
                                   Math.abs(posB2-posSp)+Math.abs(posB1-posB2));
            
            System.out.println(salida);            
        }
        
    }
}
