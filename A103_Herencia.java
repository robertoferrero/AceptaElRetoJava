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
public class A103_Herencia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        while(true) {                        
            int grau = entrada.nextInt();
            entrada.nextLine();
            if(grau==20)
                break;
            
            int[] coeficientsPolinomi = new int[grau+1];
            for(int i=0;i<=grau;i++)
                coeficientsPolinomi[i] = entrada.nextInt();
            entrada.nextLine();
            
            int numRectangles = entrada.nextInt();
            entrada.nextLine();

            double areaCain = 0.0;
            for(int i=0;i<numRectangles;i++) {
                //Càlcul valor funció en el punt
                double valorFuncio=0.0;
                for(int j=0;j<coeficientsPolinomi.length;j++)
                    valorFuncio += coeficientsPolinomi[j]*Math.pow(1.0*i/numRectangles, coeficientsPolinomi.length-j-1);

                if (valorFuncio>0 && valorFuncio<=1)                    
                    areaCain += (1.0/numRectangles)*valorFuncio;
                else if(valorFuncio>1)
                    areaCain += (1.0/numRectangles);
            }
            double areaAbel=1.0-areaCain;

            // Resultats
            //System.out.printf("Àrea Caín: %.4f\n",areaCain);
            if (Math.abs(areaAbel-areaCain)<0.001)
                System.out.println("JUSTO");
            else if(areaAbel>areaCain)
                System.out.println("ABEL");
            else
                System.out.println("CAIN");
        }
    }
}
