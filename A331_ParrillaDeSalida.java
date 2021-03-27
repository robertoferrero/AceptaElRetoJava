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
public class A331_ParrillaDeSalida {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        boolean impossible = false;
        while(true) {
            int casos = entrada.nextInt();
            if(casos==0) break;
            entrada.nextLine();

            int[] posicionsInicials = new int[casos];
            int[] posicionsFinals   = new int[casos];
            String[] pilots         = new String[casos];
            boolean[] posInicialsRepetides = new boolean[26];
            
            
            for(int i=0;i<casos;i++) {
                int millora = entrada.nextInt();
                posicionsFinals[i]  = (i+1);
                pilots[i]           = entrada.nextLine();
                
                posicionsInicials[i] = posicionsFinals[i]+millora;
                
                if(posicionsInicials[i] > 26 || posicionsInicials[i] < 1 || 
                                   posInicialsRepetides[posicionsInicials[i]-1])
                    impossible = true;                    
                else                    
                    posInicialsRepetides[posicionsInicials[i]-1]=true;                                    
            }
                        
            if (!impossible) {             
                ordenar(posicionsInicials,pilots);

                for(int i=0;i<casos;i++)
                    System.out.println(posicionsInicials[i] + pilots[i]);
            } else
                System.out.println("IMPOSIBLE");
            System.out.println("-----");
            impossible = false;
        }
    }
    
    
    // Ordenació senzilla amb mètode de la bombolla
    static void ordenar(int[] posicions,String[] pilots) {
        for(int i=0;i<posicions.length-1;i++) {
            for(int j=0;j<posicions.length-i-1;j++) {
                if(posicions[j]>posicions[j+1]) {
                    int aux = posicions[j];
                    posicions[j] = posicions[j+1];
                    posicions[j+1] = aux;
                    String aux2 = pilots[j];
                    pilots[j] = pilots[j+1];
                    pilots[j+1] = aux2;
                }
            }
        }
    }
    

}
