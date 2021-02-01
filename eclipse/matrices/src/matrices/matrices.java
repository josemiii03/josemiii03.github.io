//José Miguel Calderón de la Barca Gutierrez - Matrices - Programación - 1º Dam

package matrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class matrices {

	static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	static final int filas = 5;

	static final int columnas = 3;

	public static void main(String[] args) {
		boolean bandera = false;
		boolean matricesRellenas = false;

		int[][] matriz1 = new int[filas][columnas];
		int[][] matriz2 = new int[filas][columnas];
		int[][] matrizR = new int[filas][columnas];

		do {
			try {

				System.out.println();
				System.out.println("_______________Matrices________________");
				System.out.println();
				System.out.println("1. Cargar la matriz automáticamente");
				System.out.println("2. Cargar la matriz manualmente");
				System.out.println("3. Mostrar el contenido de la matriz");
				System.out.println("4. Sumar las dos Matrices");
				System.out.println("5. Valor Mínimo de cada array");
				System.out.println("6. Salir del programa");
				System.out.println("_______________________________________");
				int numero = Integer.parseInt(teclado.readLine());

				switch (numero) {
				default:
					System.out.println("Introduce una opción existente");
				case 1:
					/* Método CargarMatrizAuto --> (Matriz, Principio del Rango, Final del rango) */
					CargarMatrizAuto(matriz1, 1, 90);
					CargarMatrizAuto(matriz2, 5, 9);
					matricesRellenas = true;
					break;
				case 2:
					System.out.println("Introduce el contenido para la Matriz 1 ");
					cargarMatrizManual(matriz1);
					System.out.println("Introduce el contenido para la Matriz 2 ");
					cargarMatrizManual(matriz2);
					matricesRellenas = true;
					break;
				case 3:
					System.out.println("La Matriz 1 contiene:");
					mostrarMatriz(matriz1);
					System.out.println("La Matriz 2 contiene:");
					mostrarMatriz(matriz2);
					break;
				case 4:
					if (matricesRellenas == false)
						System.out.println("Para sumar rellena previamente las matrices");
					else {
						sumarMatriz(matriz1, matriz2, matrizR);
						System.out.println("La matriz:");
						mostrarMatriz(matriz1);
						System.out.println("Sumada a la matriz:");
						mostrarMatriz(matriz2);
						System.out.println("Da como resultado la matriz:");
						mostrarMatriz(matrizR);
					}
					break;
				case 5:
					System.out.println("El valor mínimo de la Matriz 1 es "+valorminimo(matriz1));
					
					System.out.println("El valor mínimo de la Matriz 2 es "+valorminimo(matriz2));
					
					System.out.println("El valor mínimo de la suma de las dos matrices es "+valorminimo(matrizR));
					break;
				case 6:
					bandera = true;
					break;
				}

			} catch (Exception e) {
				System.out.println("Introduce un numero correcto");
			}
		} while (bandera == false);

	}

	public static void CargarMatrizAuto(int[][] martriz, int rangofinal, int rangocomienzo) {
		for (int x = 0; x <= filas - 1; x++) {
			for (int y = 0; y <= columnas - 1; y++) {

				martriz[x][y] = (int) (Math.floor(Math.random() * (rangofinal - rangocomienzo) + rangocomienzo));
			}
		}
	}

	public static void cargarMatrizManual(int[][] matriz) {
		try {
			for (int x = 0; x <= filas - 1; x++) {
				for (int y = 0; y <= columnas - 1; y++) {
					System.out.println("Introduce la posición " + x + " " + y);

					int numero = Integer.parseInt(teclado.readLine());
					matriz[x][y] = (numero);
				}
			}
		} catch (IOException e) {
			System.out.println("Introduce un numero correcto");
			cargarMatrizManual(matriz);
		}

	}

	public static void mostrarMatriz(int[][] matriz) {
		for (int x = 0; x <= filas - 1; x++) {
			System.out.println();

			for (int y = 0; y <= (columnas - 1); y++) {
				System.out.print(String.format("%02d", matriz[x][y]) + " ");
			}
		}
		System.out.println();
	}

	public static void sumarMatriz(int[][] matrizX, int[][] matrizY, int[][] matrizR) {
		for (int x = 0; x <= (filas - 1); x++) {
			for (int y = 0; y <= (columnas - 1); y++) {
				matrizR[x][y] = (matrizX[x][y]) + (matrizY[x][y]);
			}
		}
	}

	public static int valorminimo(int[][] matriz) {
		int pequeño = matriz[0][0];
		for (int x = 0; x <= (filas - 1); x++) {
			for (int y = 0; y <= (columnas - 1); y++) {
				if (matriz[x][y] < pequeño) {
					pequeño = matriz[x][y];
				}
			}
		}
		return (pequeño);
	}
}
