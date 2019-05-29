import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AppGestionV2 {

	static Scanner sc = new Scanner(System.in);

	final static int CAPACIDAD = 3;
	static boolean continuar = true;
	static boolean salir = false;
	static boolean comprobar = true;
	static int pasadas = 0;

	static String[] nombre = new String[CAPACIDAD];
	static int[] edad = new int[CAPACIDAD];
	static double[] primeraNota = new double[CAPACIDAD];
	static double[] segundaNota = new double[CAPACIDAD];
	static double[] terceraNota = new double[CAPACIDAD];
	static double[] media = new double[CAPACIDAD];

	public static String opcion() {
		String opcion = sc.nextLine().toLowerCase();
		return opcion;

	}

	public static void anadir() {

		if (pasadas < CAPACIDAD) {
			System.out.println("Introduce el nombre:");
			nombre[pasadas] = sc.nextLine().toUpperCase();

			System.out.println("Introduce la edad:");
			edad[pasadas] = sc.nextInt();

			System.out.println(
					"Alumno añadido " + "[Nombre: " + nombre[pasadas].toString() + ", Edad: " + edad[pasadas] + "]");
			pasadas++;
		} else {
			System.out.println("No se pueden añadir más alumnos.");
		}

	}

	public static void nota() {
		System.out.println("Elige el alumno: ");
		for (int i = 0; i < nombre.length; i++) {
			if (nombre[i] != null) {
				System.out.print(i + "." + "[" + nombre[i] + "]\t");
			}
		}
		int elegido = sc.nextInt();
		salir = false;
		while (!salir) {

			if (primeraNota[elegido] == 0 && !salir) {
				System.out.println("ola");
				System.out.println("Introduce la nota de la primera evaluación: ");
				double notaUno = sc.nextDouble();
				primeraNota[elegido] = notaUno;
				salir = true;
				System.out.println("Nota de la primera evaluacion añadida.");
				media[elegido] = (primeraNota[elegido]);
			}
			if (segundaNota[elegido] == 0 && !salir) {
				System.out.println("Introduce la nota de la segunda evaluación: ");
				double notaDos = sc.nextDouble();
				segundaNota[elegido] = notaDos;
				salir = true;
				System.out.println("Nota de la segunda evaluacion añadida.");
				media[elegido] = (primeraNota[elegido] + segundaNota[elegido]) / 2;
			}
			if (terceraNota[elegido] == 0 && !salir) {
				System.out.println("Introduce la nota de la tercera evaluación: ");
				double notaTres = sc.nextDouble();
				terceraNota[elegido] = notaTres;
				salir = true;
				System.out.println("Nota de la tercera evaluacion añadida.");
				media[elegido] = (primeraNota[elegido] + segundaNota[elegido] + terceraNota[elegido]) / 3;
			}
		}
	}

	public static void listar() {
		System.out.println();

		for (int i = 0; i < CAPACIDAD; i++) {
			if (nombre[i] != null) {
				System.out.println("Nombre[" + nombre[i] + "]\t" + "Edad[" + edad[i] + "]\t" + "Nota1[" + primeraNota[i]
						+ "]\t" + "Nota2[" + segundaNota[i] + "]\t" + "Nota3[" + terceraNota[i] + "]\t Media["
						+ media[i] + "]");
			}
		}
	}

	public static void ordenar() {

		String temporalN;
		int temporalE;
		double temporalP;
		double temporalS;
		double temporalT;
		double temporalM;

		for (int i = 0; i < pasadas - 1; i++) {
			for (int j = i + 1; j < pasadas; j++) {
				if (nombre[i].compareTo(nombre[j]) > 0) {

					temporalN = nombre[i];
					nombre[i] = nombre[j];
					nombre[j] = temporalN;

					temporalE = edad[i];
					edad[i] = edad[j];
					edad[j] = temporalE;

					temporalP = primeraNota[i];
					primeraNota[i] = primeraNota[j];
					primeraNota[j] = temporalP;

					temporalS = segundaNota[i];
					segundaNota[i] = segundaNota[j];
					segundaNota[j] = temporalS;

					temporalT = terceraNota[i];
					terceraNota[i] = terceraNota[j];
					terceraNota[j] = temporalT;

					temporalM = media[i];
					media[i] = media[j];
					media[j] = temporalM;

				}
			}

		}
	}

	public static void main(String[] args) {

		System.out.println("a(Anadir) | n(Nota) | (l)Listar | (o)Ordenar | (s)Salir ");
		while (continuar) {

			switch (opcion()) {

			case "a":
				anadir();
				break;

			case "n":
				nota();
				break;

			case "l":
				listar();
				break;

			case "o":
				ordenar();
				break;

			case "s":
				continuar = false;
				break;
			}
		}
	}
}
