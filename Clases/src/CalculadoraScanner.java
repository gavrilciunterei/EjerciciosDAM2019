import java.util.Scanner;

public class CalculadoraScanner {

	public static double suma(int numero1, int numero2) {
	
		return numero1 + numero2;
	}
	public static double resta(int numero1, int numero2) {
		
		return numero1 - numero2;
	}
	public static double division(int numero1, int numero2) {
		
		return numero1 / numero2;
	}
	public static double multiplicacion(int numero1, int numero2) {
		
		return numero1 * numero2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String opcion, opcionPrincipal;
		int numero1, numero2;
		boolean continuar = true;
		double total = 1;
		opcionPrincipal = sc.next().substring(0, 1);

		while (continuar) {
			numero1 = sc.nextInt();
			numero2 = sc.nextInt();
			opcion = sc.next().substring(0, 1);

			switch (opcion) {
			case "+":
				if (numero1 == 0 && numero2 == 0 && opcion.equals("+")) {
					continuar = false;
				} else {
					if(opcionPrincipal.equals("+")) {
						total += suma(numero1, numero2);
					}
					if(opcionPrincipal.equals("-")) {
						total -= suma(numero1, numero2);
					}
					if(opcionPrincipal.equals("/")) {
						total /= suma(numero1, numero2);
					}
					if(opcionPrincipal.equals("*")) {
						total *= suma(numero1, numero2);
					}
				}
				break;
			case "-":
						
				break;
			case "*":
					
				break;
			case "/":
			
				break;
			}
		}
		System.out.println(total);
		sc.close();
	}

}
