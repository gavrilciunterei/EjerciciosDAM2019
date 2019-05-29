import java.util.Scanner;

public class PrimerPrograma {
	
	
	// está casado y tiene dos hijos o más
	// no está casado y tiene 1 o más hijos
	// no está casado y es menos de edad
	
	
	
	public static void comprobar(boolean casado, int edad, int hijos){
		boolean beca = false;
		
		if(casado && hijos > 1 || !casado && hijos > 0 || !casado && edad < 18) {
			beca = true;
			System.out.println("Tiene beca");
		}
		else {
			System.out.println("No tiene beca");
		}
	}
	


	public static void main(String[] args) {

		int edad = 0;
		boolean casado=false;

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Está casado?");
		String casadoo = sc.nextLine();
		if(casadoo == "si") {
			casado = true;
		}
	
		
		if(!casado) {
		System.out.println("Introduce tu edad:");
		edad = sc.nextInt();
		}
		
		System.out.println("Cuantos hijos tiene?");
		int hijos = sc.nextInt();
		
		comprobar(casado, edad, hijos);
		
		sc.close();
	}

	
}
