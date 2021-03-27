package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class A116_HolaMundo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int numero = entrada.nextInt();
        for (int i=0;i<numero;i++) {
            System.out.println("Hola mundo.");
        }
        
    }
    
}
