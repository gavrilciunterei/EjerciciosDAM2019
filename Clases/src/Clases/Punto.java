package Clases;

public class Punto {
	
		private double x;
		private double y;
		
		public Punto(double x, double y) {
			setX(x);
			setY(y);
		}
		
		public double getX() {
			return x;
		}
		public void setX(double x) {
			this.x = x;
		}
		public double getY() {
			return y;
		}
		public void setY(double y) {
			this.y = y;
		}
		public String toString() {
			return getX() + "" + getY();
		}
		public double distancia(Punto punto) {
			double total =  Math.sqrt(Math.pow((getX() - punto.getX()), 2) + Math.pow((getY() - punto.getY()),2));
			return total;
		}
		public int dentro(Circulo c) {	
			return c.dentro(this);
		}

}
