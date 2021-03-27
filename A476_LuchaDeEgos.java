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
public class A476_LuchaDeEgos {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int total = 0;
        while((total=entrada.nextInt())!=0) {
            entrada.nextLine();
            int[] destrezas = new int[total];
            for(int i=0;i<total;i++)
                destrezas[i] = entrada.nextInt();
            entrada.nextLine();

            int[] usados    = new int[total];
            String[] retos  = new String[total];
            for(int i=0;i<total;i++)
                retos[i] = entrada.next();
            entrada.nextLine();

            int combatesEncontrados = 0;
            for(int i=0;i<total;i++) {
                if(usados[i]==0) {
                    for(int j=i+1;j<total;j++) {
                        if(usados[j]==0 && combateValido(destrezas,retos,i,j) && combateValido(destrezas,retos,j,i)) {
                            System.out.println((i+1)+" "+(j+1));
                            usados[j] = 1;
                            combatesEncontrados++;
                            break;
                        }

                    }
                }
            }
            if(combatesEncontrados==0)
                System.out.println("NO HAY");
            System.out.println("---");
        }
        
    }

    
    public static boolean combateValido(int[] destrezas,String[] retos,int i,int j) {

        char regla = retos[i].charAt(0);
        int valorRegla = Integer.parseInt(retos[i].substring(1));
        
        boolean valido = false;
        switch(regla) {
            case '=':
                if(destrezas[j]==valorRegla)
                    valido = true;
                break;
            case '>':
                if(destrezas[j]>valorRegla)
                    valido = true;
                break;
            case '<':
                if(destrezas[j]<valorRegla)
                    valido = true;
                break;
        }

        return valido;
    }
    
    
}
