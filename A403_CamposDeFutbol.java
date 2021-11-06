package aceptaelreto;

import java.util.Scanner;

public class A403_CamposDeFutbol {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numEntradas = entrada.nextInt();
		
		for (int i = 0;i < numEntradas;++i)
		{
			int metrosCuadrados = entrada.nextInt();
			int camposDeFutbol  = entrada.nextInt();
			
			if (metrosCuadrados >= camposDeFutbol * 45 * 90 && metrosCuadrados <= camposDeFutbol * 90 * 120)
				System.out.println("SI");
			else
				System.out.println("NO");
		}
	}
}
