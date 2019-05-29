import java.util.Scanner;

public class ProgramaEnteros {
	
	
	public static int cifras(long numero) {
		
		return Integer.toString((int) numero).length();
	}
	
	public static boolean esPar(long numero) {
		if(numero%2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean esPrimo(long numero) {
		int contador = 0;
		
		for(int i  = 1; i <= numero; i++){
	       if((numero % i) == 0)
	        {
	            contador++;
	        }
	    }
		
        if(contador <= 2)
        {
            return true;
        }else{
            return false;
        }
		
	}
	
	public static boolean esCapicua(long numero) {
		
		String cadena = Long.toString(numero);
		String cadenaInvertida = "";
		
		for(int i = 1; i <= cadena.length(); i ++) {
			cadenaInvertida += cadena.charAt(cadena.length()-i);
		}
		
		if (cadenaInvertida.equals(cadena)){
			return true;
		}else {
			return false;
		}
	}
	
	public static int parteEnteraDeLaRaizCuadrada(long numero) {
		
		int raiz = 0;
		
		while (raiz * raiz <= numero) {
			raiz++;
		}
		
		return raiz - 1;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un numero positivo ? ");
		long numero = sc.nextLong();
		
		System.out.println(numero + " tiene "+ cifras(numero)+ " cifras");
		System.out.println(numero + " es " + (esPar(numero) ? "par" : "impar"));
		System.out.println(numero + " " +(esPrimo(numero) ? "es primo" : "no es primo"));
		System.out.println(numero + " " +(esCapicua(numero) ? "es capicua" : "no es capicua"));
		System.out.println(parteEnteraDeLaRaizCuadrada(numero) + " es la parte entera de la raiz cuadrada de " +numero); 
		
		sc.close();
	}

}
