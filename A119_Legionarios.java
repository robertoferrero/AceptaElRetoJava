package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class A119_Legionarios {


    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);
        
        while (true) {
            int numLegionarios = entrada.nextInt();
            int totalEscudos = 0;
            
            if (numLegionarios!=0) {
                while (numLegionarios!=0) {
                    int legionariosFormacion = (int)Math.sqrt(numLegionarios);
                    if (numLegionarios>1) {
                        totalEscudos += legionariosFormacion*legionariosFormacion +
                                        legionariosFormacion*4;
                        
                    } else
                        totalEscudos += 5;
                        
                    numLegionarios -= legionariosFormacion*legionariosFormacion;
                }
                System.out.println(totalEscudos);
            } else
                break;            
        }                
    }    
}
