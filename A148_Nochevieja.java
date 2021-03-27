package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class A148_Nochevieja {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        while (true) {
            String horaYMinuts = entrada.next();
            if(!horaYMinuts.equals("00:00")) {
                int hora   = Integer.parseInt(horaYMinuts.substring(0, 2));
                int minuts = Integer.parseInt(horaYMinuts.substring(3));                
                System.out.println(60-minuts+(23-hora)*60);
                
            } else
                break;
        }
        
    }
    
}
