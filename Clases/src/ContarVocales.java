
public class ContarVocales {

	public static void main(String[] args) {


		String palabra = "Prueb3a Palabra3";
		int contadorA = 0;
		int contadorE = 0;

		for(int i = 0; i < palabra.length(); i++) {
			
			if(palabra.charAt(i) == '3') {
				contadorA++;
			}
			if(palabra.charAt(i) == 'e') {
				contadorE++;
			}

		}
		System.out.print("A= " + contadorA + "\t E= " + contadorE);
		
		
		
		
	}

}
