import java.util.Arrays;

public class OrdenarArray {

	public static void main(String[] args) {


		int[] vector = {1,3,5,8,9,0,2,4,7,6};
		int total = vector.length;
		int numero = total;
		int mayor = 0;
		
		for ( int j = 0; j < total-1; j ++) {
			for(int i = 0; i < total-1; i++) {
			
				if(vector[i] > mayor) {
					mayor = vector[i];
				}
			}
		numero--;
		vector[numero] = mayor;
		
		}
			
		
		System.out.println(Arrays.toString(vector));

		
		
		
	}

}
