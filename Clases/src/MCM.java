
public class MCM {

	public static void main(String[] args) {


		int numero1 = 6;
		int numero2 = 4;
		boolean encontrado = false;
				
		for(int i = 1;	!encontrado; i ++) {					
			if(i % numero1== 0 && i % numero2 == 0) {		
				System.out.println(i);
				encontrado = true;
			}
		}
	}

}
