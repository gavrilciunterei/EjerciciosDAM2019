package Herencia1;

public class Caniche extends Perro{

	
	public Caniche(String nombre) {
		super(nombre);
	}

	public void hacerRuido() {
		System.out.println(getNombre()+" Ruido raro");
	}
}
