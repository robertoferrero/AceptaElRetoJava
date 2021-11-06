package aceptaelreto;

import java.util.Scanner;

public class A390_PixelArt {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int totalCasos = entrada.nextInt();
		for (int i = 0; i < totalCasos; ++i)
		{
			int totalMagenta = entrada.nextInt();
			int totalAmarillo = entrada.nextInt();
			int totalCyan    = entrada.nextInt();
			String pixelArt = entrada.next();

			for (int j = 0; j < pixelArt.length(); ++j)
			{
				switch (pixelArt.charAt(j))
				{
					case 'M':
						--totalMagenta;
						break;
					case 'A':
						--totalAmarillo;
						break;
					case 'C':
						--totalCyan;
						break;
					case 'R':
						--totalMagenta;
						--totalAmarillo;
						break;
					case 'N':
						--totalMagenta;
						--totalAmarillo;
						--totalCyan;
						break;
					case 'V':
						--totalAmarillo;
						--totalCyan;
						break;
					case 'L':
						--totalMagenta;
						--totalCyan;
						break;
				}	
			}
			
			if (totalMagenta >= 0 && totalAmarillo >= 0 && totalCyan >= 0)
				System.out.printf("SI %d %d %d\n", totalMagenta,totalAmarillo,totalCyan);
			else
				System.out.println("NO");
		}
		entrada.close();
	}
}
