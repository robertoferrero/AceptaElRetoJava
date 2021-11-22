package aceptaelreto;

import java.util.Scanner;

public class A237_NumerosPolidivisibles {

	public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        while (entrada.hasNextLong())
        {
            long numero = entrada.nextLong();
            //int longitud = String.valueOf(numero).length();
            //int longitud = (int)Math.log10(numero) + 1;
            int longitud = 0;
            long aux = numero;
            while (aux > 0)
            {
            	++longitud;
            	aux /= 10;
            }

            
            boolean polidivisible = true;
            while (longitud > 1 && polidivisible)
            {
                if (numero % longitud == 0)
                {
                    numero /= 10;
                    --longitud;
                }
                else                
                    polidivisible = false;
            }
            System.out.println(polidivisible ? "POLIDIVISIBLE" : "NO POLIDIVISIBLE");
        }
        
    }

}
