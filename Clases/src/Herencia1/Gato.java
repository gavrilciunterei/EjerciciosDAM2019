package Herencia1;

public class Gato extends Animal {

	public Gato(String nombre) {
		super(nombre);
	}

	public void hacerRuido() {
		System.out.println(getNombre()+" Maulla");
	}
	
}
