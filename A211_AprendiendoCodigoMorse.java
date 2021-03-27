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
public class A211_AprendiendoCodigoMorse {
    
    public static void main(String[] args) {

        String lletres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";        
        String[] codis = {".-",   //A
                          "-...", //B
                          "-.-.", //C
                          "-..",  //D
                          ".",    //E
                          "..-.", //F
                          "--.",  //G
                          "....", //H
                          "..",   //I                          
                          ".---", //J
                          "-.-",  //K
                          ".-..", //L
                          "--",   //M
                          "-.",   //N
                          "---",  //O
                          ".--.", //P
                          "--.-", //Q
                          ".-.",  //R
                          "...",  //S
                          "-",    //T
                          "..-",  //U
                          "...-", //V
                          ".--",  //W                          
                          "-..-", //X
                          "-.--", //Y
                          "--.."  //Z
                        };
        

        String vocals = "AEIOU";
        
        Scanner entrada = new Scanner(System.in);
        while(entrada.hasNext()) {
            String paraula = entrada.nextLine();

            String codi = "";
            for(int i=0;i<paraula.length();i++) {
                char ch = paraula.toUpperCase().charAt(i);
                if(vocals.indexOf(ch)>-1)
                    codi += (ch=='O')?'-':'.';                                        
            }           
            //System.out.println(codi);
            char lletra = paraula.toUpperCase().charAt(0);
            int index = lletres.indexOf(lletra);
            
            System.out.println(paraula + (codi.equals(codis[index])?" OK":" X"));
        }
        
    }
}
