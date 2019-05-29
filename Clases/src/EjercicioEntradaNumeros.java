import java.util.Scanner;

public class EjercicioEntradaNumeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int lineas;
		int numero1;
		int contadorL = 0;

		try {
		lineas = sc.nextInt();

		if (lineas > 0) {

			while (contadorL < lineas) {
				int contadorN = 0;
				int total = 0;
				int numero2 = 0;

				numero1 = sc.nextInt();

				while (contadorN < numero1) {
					numero2 = sc.nextInt();
					total += numero2;
					contadorN++;
				}

				System.out.println(total);
				contadorL++;
			}
		}
		}catch(Exception e) {
			System.out.println("Error al introducir un dato");
		}
		sc.close();
	}
}
