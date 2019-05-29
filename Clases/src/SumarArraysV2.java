
public class SumarArraysV2 {

	public static void main(String[] args) {

		int[][] numeros = { { 1, 2, 4 }, { 5, 6, 3 } };
		int[][] numeros2 = { { 2, 5, 8 }, { 1, 3, 2 } };
		int[][] resultado = new int[numeros.length][numeros[0].length];

		for (int filas = 0; filas < numeros.length; filas++) {

			for (int columnas = 0; columnas < numeros[filas].length; columnas++) {

				resultado[filas][columnas] = numeros[filas][columnas] + numeros2[filas][columnas];

				System.out.print(resultado[filas][columnas] + " ");
			}

		}

	}

}
