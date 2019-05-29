import java.util.Arrays;

public class MiListado {
	
	


	public static void main(String[] args) {
		
		String[] nombres = {"Lucia", "Ana", "Juan", "Jose"};
		int[] edades = {19,21,34,18};
		String temporal;
		int temporalN;
		
		for(int i = 0; i < nombres.length; i ++) {
			System.out.println(nombres[i] + "\t" + edades[i]);
		}
		System.out.println();
		
		// ordenado por nombres y edades 
		
		for(int i = 0; i<nombres.length-1; i++) {
	         for (int j = i+1; j<nombres.length; j++) {	
		        if(nombres[i].compareTo(nombres[j])>0){
		
		        	temporal = nombres[i];
		        	nombres[i] = nombres[j];
		        	nombres[j]= temporal;
		        	
		        	temporalN = edades[i];
		        	edades[i] = edades[j];
		        	edades[j]= temporalN;
					
				}
	         }
		}
	
		for(int i = 0; i < nombres.length; i ++) {
			System.out.println(nombres[i] + "\t" + edades[i]);
		}
			
	}

}
