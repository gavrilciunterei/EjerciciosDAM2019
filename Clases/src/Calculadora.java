import java.util.Scanner;

public class Calculadora {
	
	private static Scanner sc= new Scanner(System.in);
	
	public static double sumar(double a, double b) {
		return a+b;
	}
	
	public static double restar(double a, double b) {
		return a-b;
	}
	
	public static double dividir(double a, double b) {
		double resultado = 0;

		if(b != 0) {
			resultado = a/b;
		}else {
			System.out.println("No se puede");
		}
		return resultado;
	}
	
	public static double multiplicar(double a, double b) {
		return a*b;
	}
		
		
	public static void main(String[] args) {
		
		boolean continuar = true;
		double a = 0, b = 0;
		String opcion;
		
		sc.useDelimiter("\n");
		
		while (continuar) {
			
			System.out.println("(+)Sumar | (-)Restar | (*)Multiplicar | (/)Dividir | (s)Salir");
			opcion = sc.next().substring(0, 1);
			
			if(!opcion.equals("s")){
				System.out.println("Introduce el primer numero: ");
				a = sc.nextDouble();
				
				System.out.println("Introduce el segundo numero: ");
				b = sc.nextDouble();
			}
		
			switch (opcion) {

				case "+":
					System.out.println(sumar(a, b));
					break;
				case "-":
					System.out.println(restar(a, b));
					break;
				case "*":
					System.out.println(multiplicar(a, b));
					break;
				case "/":
					System.out.println(dividir(a, b));
					break;
				case "s":
					continuar = false;
					break;
			}
		}
	}
	

}
