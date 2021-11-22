
import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class A237_NumerosPolidivisibles {
 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        while (entrada.hasNextLong())
        {
            //long numero = 381654729;
            long numero = entrada.nextLong();
            int longitud = String.valueOf(numero).length();

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
            System.out.println(polidivisible?"POLIDIVISIBLE":"NO POLIDIVISIBLE");
        }
        
    }

}
