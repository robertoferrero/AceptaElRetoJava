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
public class A475_CameosStanLee {
    
    public static void main(String[] args) {
        
        char[] NOMBRE = {'S','T','A','N','L','E','E'};
        Scanner entrada = new Scanner(System.in);
        
        int lineas = entrada.nextInt();
        entrada.nextLine();
        
        while(lineas>0) {
            String frase = entrada.nextLine().toUpperCase();
            
            int contador = 0,letraActual = 0;
            for(int i=0;i<frase.length();i++) {
                if (frase.charAt(i)==NOMBRE[letraActual])
                    letraActual++;
                if (letraActual>6) {
                    contador++;
                    letraActual = 0;
                }            
            }
            lineas--;
            System.out.println(contador);
        }
    }
}
