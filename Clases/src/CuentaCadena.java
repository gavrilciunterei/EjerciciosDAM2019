
public class CuentaCadena {

	public static void main(String[] args) {

		String cadena1 = "Hola amigo, hola amigo";
		String cadenaAbuscar = "amigo";
		int posicion = 0;
		int apariciones = 0;

		while (posicion >= 0) {
			posicion = cadena1.indexOf(cadenaAbuscar, posicion);
			if (posicion >= 0) {
				posicion++;
				apariciones++;
			}
		}
		System.out.println("Aparece: " + apariciones);

	}

}
