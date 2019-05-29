
public class Palindromo {

	public static void main(String[] args) {
		
	
		String cadena = "olo";
		String cadenaFinal = "";
		
		for(int i = 1; i <= cadena.length(); i++) {
			
			cadenaFinal += cadena.charAt(cadena.length()-i);
			
		}
		if(cadena.equals(cadenaFinal)) {
			System.out.println("Es palindroma");

		}
		
		System.out.println(cadenaFinal);

	}

}
