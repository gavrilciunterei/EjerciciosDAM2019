import java.util.Scanner;

public class SumaLosDigitos {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String cadena = "La suma de 12 y 250 da 262";
		int suma = 0;
		
		for(int i = 0; i < cadena.length(); i++) {
			
			if(cadena.charAt(i) == '1' || cadena.charAt(i)  =='2' || cadena.charAt(i) =='3' || cadena.charAt(i) == '4' || cadena.charAt(i) =='5' ||
					cadena.charAt(i)  =='6' || cadena.charAt(i)  =='7' || cadena.charAt(i)  =='8' || cadena.charAt(i)  =='9') {
				
				suma += Integer.parseInt(""+ cadena.charAt(i));

			}
			
		}
		System.out.println(suma);
		
		
		
		
		
	}

}
