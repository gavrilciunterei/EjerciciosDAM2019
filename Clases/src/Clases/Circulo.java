package Clases;

public class Circulo {
	
	private Punto punto;
	private double radio;
	
	public Circulo(double x, double y, double radio) {
		punto = new Punto(x, y);
		this.radio = radio;
		
	}
	public Circulo(Punto punto, double radio) {
		this.punto = punto;
		this.radio = radio;
	}
	
	public Circulo() {
		this(0,0,0);
	}
	
	public Punto getPunto() {
		return punto;
	}

	public void setPunto(Punto punto) {
		this.punto = punto;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double area() {
		return Math.PI * Math.pow(getRadio(), 2);
	}
	
	public double perimetro() {
		return (2*Math.PI) * getRadio();
	}
	
	public String toString() {
		return "Circulo [punto=" + punto + ", radio=" + radio + "]";
	}
	
	public double distanciaPunto(Circulo circulo) {
		return getPunto().distancia(circulo.punto);
	}
	public double distanciaRadio(Circulo circulo) {
		return getPunto().distancia(circulo.punto) - (this.getRadio() - circulo.getRadio());
	}
	public int dentro(Punto p) {
		int resultado=0;
		if(getPunto().distancia(p) < getRadio()) {
			resultado = -1;
		}
		if(getPunto().distancia(p) > getRadio()) {
			resultado = 1;
		}
		
		return resultado;
	}
	
}
