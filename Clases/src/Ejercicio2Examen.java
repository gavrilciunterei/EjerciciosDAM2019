import java.util.Scanner;

public class Ejercicio2Examen {

	public static void main(String[] args) {

		final int NUMEROS_TOTALES = 10;
		int total = 0;
		double media = 0;
		int contador = 1;
		int numero = 0;

		Scanner sc = new Scanner(System.in);

		total = sc.nextInt();
		int mayor = total;

		while (contador < NUMEROS_TOTALES) {
			numero = sc.nextInt();
			total += numero;
			if (numero > mayor) {
				mayor = numero;
			}
			contador++;
		}
		System.out.println(total);
		media = (double) (total / NUMEROS_TOTALES);
		System.out.println(media);
		System.out.println(mayor);

		sc.close();
	}
}
