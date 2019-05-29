package Herencia1;

public class Perro extends Animal{

	public Perro(String nombre) {
		super(nombre);
	}

	public void hacerRuido() {
		System.out.println(getNombre()+" Ladra");
	}
	
	
}
