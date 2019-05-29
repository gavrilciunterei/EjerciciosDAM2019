
public class Crucigrama2 {

	public static void main(String[] args) {


		char[][] tablero = new char[10][10];
		String cadena = "ao";
		int encontrado = 0;

		
		for (int fila = 0; fila < tablero.length; fila++) {
			System.out.println();
			for (int columna = 0; columna < tablero[fila].length; columna++) {

				char letra = (char) ('a' + Math.random() * 26);
				tablero[fila][columna] = letra;
				System.out.print(tablero[fila][columna] + " ");
			}
		}
		
		
	for (int fila = 0; fila < tablero.length; fila++) {
		
		for (int columna = 0; columna < tablero[fila].length; columna++) {

			for(int i=0;i < cadena.length();i++) {
				
				
			}
		}
	}
		
		System.out.println(encontrado);
		
		
		
		
		
	}

}
