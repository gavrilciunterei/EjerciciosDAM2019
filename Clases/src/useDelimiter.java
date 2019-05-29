import java.util.Scanner;

public class useDelimiter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(":");
		
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
	}

}
