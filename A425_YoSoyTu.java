
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rferrero
 */
public class A425_YoSoyTu {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        entrada.nextLine();
        
        
        for (int i = 0; i < casos; ++i)
        {
            String personatge = entrada.nextLine();
            String parentesc  = entrada.nextLine();
            if (personatge.equals("Luke") && parentesc.equals("padre"))
                System.out.println("TOP SECRET");                
            else
                System.out.println(personatge + ", yo soy tu " + parentesc);
        }
            
        entrada.close();
    }
}
