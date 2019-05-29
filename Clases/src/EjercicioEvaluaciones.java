import java.util.Scanner;

public class EjercicioEvaluaciones {

	public static void main(String[] args) {


		// Ana 6 7 8
		// Luis 4 5 7
		// Pio 9 8 9
		// Entrda:mString int int int
		// Salida: Ana 7.0 ,\n Luis 5... \n Pio 8.8...
		// (has)
		//  useDelimiter (" ");
		
		
		Scanner sc = new Scanner(System.in);
		String nombre;
		int nota1;
		int nota2;
		int nota3;
		int media;

		
		while(sc.hasNext()) {
			nombre = sc.next();
			
			while(!sc.hasNextInt()) {
				nombre = nombre+ " "+ sc.next();
			}
			
			nota1 = sc.nextInt();
			nota2 = sc.nextInt();
			nota3 = sc.nextInt();
			
			media = (nota1+nota2+nota3)/3;
			
			System.out.println(nombre + " " + media);
	
		}
		sc.close();
	}
	

}
