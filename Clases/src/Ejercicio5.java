import java.util.Scanner;

public class Ejercicio5 {

	private final static int PTS_HAMBURGUESA = 500;
	private final static int PTS_CERVEZA = 150;
	private final static int PTS_COLA = 175;
	private final static int PTS_ENSALADA = 200;
	private final static int PTS_SALCHICHAS = 275;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double total = 0;
		boolean continuar = true;

		System.out.println("Hamburguesa | Cerveza | Ensalada | Salchicas | Salir ");

		while (continuar) {
			String opcion = sc.nextLine().toLowerCase();

			switch (opcion) {
			case "hamburguesa":
				total += PTS_HAMBURGUESA;
				break;
			case "cerveza":
				total += PTS_CERVEZA;
				break;
			case "cola":
				total += PTS_COLA;
				break;
			case "ensalada":
				total += PTS_ENSALADA;
				break;
			case "salchicas":
				total += PTS_SALCHICHAS;
				break;
			case "salir":
				continuar = false;
				break;
			}
		}
		total = total + total * 0.12;
		System.out.println(total);

	}
}
