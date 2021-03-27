package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class A122_Avituallament {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        while (true) {
            int alcadaPunt1 = entrada.nextInt();
            if (alcadaPunt1==-1)
                break;
            else {
                int alcadaPunt2=0,puntKilometric=0;
                int puntKilometricAvituallament=-1;
                int puntKilometricAvituallamentTemp=0;
                int kilometresTemp=0,kilometresAvituallament=0;
                                
                while (alcadaPunt2!=-1) {
                    alcadaPunt2 = entrada.nextInt();
                    if (alcadaPunt2==alcadaPunt1) {
                        kilometresTemp++;
                        if (kilometresTemp>kilometresAvituallament) {
                                kilometresAvituallament = kilometresTemp;
                                puntKilometricAvituallament = 
                                                puntKilometricAvituallamentTemp;
                        }
                    } else {
                        puntKilometricAvituallamentTemp = puntKilometric+1;
                        kilometresTemp = 0;
                    }                    
                    alcadaPunt1 = alcadaPunt2;                    
                    puntKilometric++;
                }
                if (kilometresAvituallament>0)
                    System.out.printf("%d %d\n",puntKilometricAvituallament,
                                                       kilometresAvituallament);
                else
                    System.out.println("HOY NO COMEN");
            }
        }
    }
    
}
