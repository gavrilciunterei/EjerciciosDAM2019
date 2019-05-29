import java.util.Scanner;

public class CrucigramaArrays {

	public static void main(String[] args) {

		char[][] tablero = new char[10][10];

		String cadena;
		boolean listoH = false;
		boolean listoV = false;
		int posicionH = 0;
		int posicionV = 0;

		String horizontal = "";
		String vertical = "";
		
		Scanner sc = new Scanner (System.in);

		for (int fila = 0; fila < tablero.length; fila++) {
			System.out.println();
			for (int columna = 0; columna < tablero[fila].length; columna++) {

				char letra = (char) ('a' + Math.random() * 26);
				tablero[fila][columna] = letra;
				System.out.print(tablero[fila][columna] + " ");
			}
		}
		
		System.out.println("\n\n" + "Introduce una palabra para buscar: ");
		cadena = sc.nextLine();

		// filas
		for (int fila = 0; fila < tablero.length && listoH == false; fila++) {

			if (horizontal.indexOf(cadena) != -1) {
				listoH = true;
				System.out.println("\n" + "Encontrado en la fila: " + posicionH);

			}
			if (listoH == false) {
				horizontal = "";
				for (int columna = 0; columna < tablero[fila].length; columna++) {
					horizontal = horizontal + tablero[fila][columna];
					
				}
			}
			
			posicionH++;
		}
		
		
		// columnas
		for (int columna = 0; columna < tablero.length+1 && listoV == false; columna++) {
			if(vertical.indexOf(cadena) != -1) {
				listoV = true;
				System.out.println("\n" + "Encontrado en la columna: " + posicionV);
			}
			
			if(listoV == false) {
				vertical = "";
				for (int fila = 0; fila < tablero.length; fila++) {					
					vertical = vertical + tablero[fila][columna];
					
				}
			}
			posicionV++;
		}
		
		
		
	}
}
