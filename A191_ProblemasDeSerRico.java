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
public class A191_ProblemasDeSerRico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        short total = entrada.nextShort();
        for (int i=0;i<total;i++) {

          int numAcuarios = entrada.nextInt();
          int litrosMayor = entrada.nextInt();
          int diferencia = entrada.nextInt();
          int litros = 0;

          for (int j=0;j<numAcuarios;j++) {
            litros += (litrosMayor-j*diferencia);
          }
          System.out.println(litros);
       
        }        
    }
    
}
