
public class SumarArrays {
	
	public static void sumar(int[][] numero1, int[][] numero2) {
		//si se quiere que devuelve algo se cambia por int[][]
		
		int[][] resultado = new int[numero1.length][numero1[0].length];
		
		for (int filas = 0; filas < numero1.length; filas++) {

			for (int columnas = 0; columnas < numero1[filas].length; columnas++) {

				resultado[filas][columnas] = numero1[filas][columnas] + numero2[filas][columnas];

				System.out.print(resultado[filas][columnas] + " ");
			}
		}
	}
	

	public static void main(String[] args) {

		int[][] numero1 = { { 1, 2, 4 }, { 5, 6, 3 } };
		int[][] numero2 = { { 2, 5, 8 }, { 1, 3, 2 } };
	
		sumar(numero1, numero2);

	}

}
