package Clases;

public class MainCirculo {

	public static void main(String[] args) {

		Circulo c1 = new Circulo(1,1, 2);
		Circulo c2 = new Circulo(1,1, 2);
		
		System.out.println(c1.distanciaPunto(c2));
		System.out.println(c1.distanciaRadio(c2));
		
	}

}
