package Herencia1;

public class Animal {

	// animal (nombre, hacerruido) // perro(ladran), gato(maullan), caniche
	
	
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public Animal(String nombre) {
		this.nombre = nombre;
	}
	
	public void hacerRuido(){
		System.out.println("Ruido Animal");
	}


	
	
	
}
