
import java.util.Objects;
import java.util.Scanner;


public class PalindromoCapicua {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String opcion, cadena;
	long numero;
	
	System.out.println("Elige una opcion: \n a) Numero \n b) Cadena");
	opcion = sc.nextLine();

	
	
	if (Objects.equals(opcion, new String("a"))){
		
		System.out.println("Escriba un numero:");
		numero = sc.nextInt();
		
			
		long numero1, numeroInvertido = 0, resto = 0;
		numero1=numero;
		
	while (numero1!=0){
		
		
							
		resto=numero1%10; 		
		numeroInvertido = numeroInvertido * 10 + resto;
		numero1=numero1/10; 
		
		}
	if (numeroInvertido == numero){
		System.out.println("Es capicua");
		
	}
	else{
		System.out.println("No es capicua");
	}
	}
	
	
		
	if (Objects.equals(opcion, new String("b"))){

		String dadaLaVuelta = "";
		String cadena1;
		int contador;
		
		System.out.println("Escriba una cadena:");
		cadena = sc.nextLine();
		cadena1 = cadena;
		contador = cadena.length()-1;
		
		
	while (contador >= 0 ){
		dadaLaVuelta = dadaLaVuelta + cadena1.charAt(contador);
		contador--;
		}
	
			if (dadaLaVuelta.equals(cadena))	{
				
					System.out.println("Es palindroma");
												}
	
			else{
					System.out.println("No es palindroma");
				}
		
	
	
	
	}		
	sc.close();	
	}
}


