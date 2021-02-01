package matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class matricesSinMenu {

	static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	private static final int columnas = 4;

	private static final int filas = 4;

	public static void main(String[] args) {

		int[][] matriz1 = new int[filas][columnas];
		int[] vector = new int[filas];

		CargarMatrizAuto(matriz1, 10, 30);
		CargarVectorAuto(vector, 10, 30);
		diagonal(matriz1, vector);
		mostrarMatrizDiagonal(matriz1);
		mostrarVector(vector);

	}

	public static void CargarMatrizAuto(int[][] matriz1, int rangofinal, int rangocomienzo) {
		for (int x = 0; x <= filas - 1; x++) {
			for (int y = 0; y <= columnas - 1; y++) {

				matriz1[x][y] = (int) (Math.floor(Math.random() * (rangofinal - rangocomienzo) + rangocomienzo));
			}
		}
	}

	public static void CargarVectorAuto(int[] vector, int rangofinal, int rangocomienzo) {
		for (int x = 0; x <= filas - 1; x++) {

			vector[x] = (int) (Math.floor(Math.random() * (rangofinal - rangocomienzo) + rangocomienzo));
		}
	}

	public int valorminimo(int[][] matriz) {
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

	public static void mostrarMatriz(int[][] vector) {
		for (int x = 0; x <= columnas - 1; x++) {
			System.out.println();

			for (int y = 0; y <= (filas - 1); y++) {
				System.out.print(String.format("%02d", vector[x][y]) + " ");
			}
		}
		System.out.println();
	}

	public static void mostrarMatrizDiagonal(int[][] vector) {
		for (int x = 0; x <= columnas - 1; x++) {
			System.out.println();

			for (int y = 0; y <= (filas - 1); y++) {

				if (x == y) {
					System.out.print("(" + vector[x][y] + ")");
				} else
					System.out.print(String.format("%02d", vector[x][y]) + " ");

			}
		}
		System.out.println();
	}

	public static void mostrarVector(int[] vector) {
		System.out.println();
		for (int x = 0; x <= columnas - 1; x++) {
			
			System.out.print(vector[x] + " ");

		}
	}

	public static void diagonal(int[][] matriz, int[] vector) {
		for (int x = 0; x <= (filas - 1); x++) {
			for (int y = 0; y <= (columnas - 1); y++) {
				if (x == y) {
					vector[x] = matriz[x][y];
				}
			}
		}
	}
}
