package aceptaelreto;

import java.util.Scanner;

public class A176_CampoMinas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		while (true)
		{
			
			int totalColumnas = entrada.nextInt();
			int totalFilas = entrada.nextInt();
			entrada.nextLine();
			if (totalColumnas != 0 && totalFilas != 0)
			{
				boolean[][] tablero = new boolean[totalFilas][totalColumnas];
				// Entrada de datos
				for (int fila = 0; fila < totalFilas; ++fila)
				{
					String linea = entrada.nextLine();
					for (int columna = 0; columna < totalColumnas; ++columna)
						tablero[fila][columna] = (linea.charAt(columna) == '*');
				}
				
				// Procesado de los datos
				int casillas6Minas = 0;
				for (int fila = 0; fila < totalFilas; ++fila)
				{
					for (int columna = 0; columna < totalColumnas; ++columna)
					{
						// Contamos minas solo en las casillas que estan vacías
						if (!tablero[fila][columna])
						{
							int minas = 0;
							for (int i = -1; i <= 1 ; ++i)
							{
								for (int j = -1; j <= 1 ; ++j)
								{
									if ((i != 0 || j != 0) && 
										(fila + i) >= 0 && (fila + i) < totalFilas &&
									    (columna + j) >= 0 && (columna + j) < totalColumnas &&
									    tablero[fila + i][columna + j])
										
										++minas;
								}
							}
							if (minas >= 6)
								++casillas6Minas;
						}
					}
				}
				System.out.println(casillas6Minas);
			}
			else
				break;
		}
		entrada.close();
	}
}
