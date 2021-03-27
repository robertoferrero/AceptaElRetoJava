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
public class A167_PintandoFractales {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                
        while(entrada.hasNext()) {
            String s = entrada.nextLine();
            int costat = Integer.parseInt(s);
            System.out.println(calculaPintura(costat));                        
        }                
    }
    
    static int calculaPintura(int costat) {
        if(costat==1)
            return 4;
        return 4*costat+4*calculaPintura(costat/2);
        
    }
}
