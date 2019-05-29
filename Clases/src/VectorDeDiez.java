import java.util.Arrays;

public class VectorDeDiez {

	public static void main(String[] args) {


		int[] vector = new int[10];	
		
		for (int i = 0; i < 10; i++) {
			vector[i]= i;
		}
		
		for(int i = (int)(Math.random()*10) * 10 * 10; i > 0; i--){
			int posA = (int)(Math.random()* 10);
			int posB =  (int)(Math.random()* 10);
			int temporal = vector[posA];
			vector[posA]= vector[posB];
			vector[posB] = temporal;
		}
		
		System.out.println(Arrays.toString(vector));
	}
	

}
