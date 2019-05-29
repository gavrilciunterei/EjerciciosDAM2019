import java.util.Scanner;

public class AppGestion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int CAPACIDAD = 3;
		boolean continuar = true;
		boolean salir = false;
		int pasadas = 0;

		String[] nombre = new String[CAPACIDAD];
		int[] edad = new int[CAPACIDAD];
		double[] primeraNota = new double[CAPACIDAD];
		double[] segundaNota = new double[CAPACIDAD];
		double[] terceraNota = new double[CAPACIDAD];
		double[] media = new double[CAPACIDAD];

		System.out.println("Anadir | Nota | Listar | Ordenar | Salir ");

		while (continuar) {
			String opcion = sc.nextLine().toLowerCase();

			switch (opcion) {

			case "a":
				if (pasadas < CAPACIDAD) {
					System.out.println("Introduce el nombre:");
					nombre[pasadas] = sc.nextLine().toUpperCase();

					System.out.println("Introduce la edad:");
					edad[pasadas] = sc.nextInt();

					System.out.println("Alumno añadido " + "[Nombre: " + nombre[pasadas].toString() + ", Edad: "
							+ edad[pasadas] + "]");
					pasadas++;
				} else {
					System.out.println("No se pueden añadir más alumnos.");
				}
				break;

			case "n":
				System.out.println("Elige el alumno: ");
				for (int i = 0; i < nombre.length; i++) {
					if (nombre[i] != null) {
						System.out.print(i + "." + "[" + nombre[i] + "]\t");
					}
				}
				int elegido = sc.nextInt();
				salir = false;
				while (salir == false) {
					if (primeraNota[elegido] == 0 && salir == false) {
						System.out.println("Introduce la nota de la primera evaluación: ");
						double notaUno = sc.nextDouble();
						primeraNota[elegido] = notaUno;
						salir = true;
						System.out.println("Nota de la primera evaluacion añadida.");
						media[elegido] = (primeraNota[elegido]);
					}
					if (primeraNota[elegido] != 0 && segundaNota[elegido] == 0 && salir == false) {
						System.out.println("Introduce la nota de la segunda evaluación: ");
						double notaDos = sc.nextDouble();
						segundaNota[elegido] = notaDos;
						salir = true;
						System.out.println("Nota de la segunda evaluacion añadida.");
						media[elegido] = (primeraNota[elegido] + segundaNota[elegido]) / 2;
					}
					if (primeraNota[elegido] != 0 && segundaNota[elegido] != 0 && terceraNota[elegido] == 0
							&& salir == false) {
						System.out.println("Introduce la nota de la tercera evaluación: ");
						double notaTres = sc.nextDouble();
						terceraNota[elegido] = notaTres;
						salir = true;
						System.out.println("Nota de la tercera evaluacion añadida.");
						media[elegido] = (primeraNota[elegido] + segundaNota[elegido] + terceraNota[elegido]) / 3;
					}
				}
				break;

			case "l":
				System.out.println();

				for (int i = 0; i < CAPACIDAD; i++) {
					if (nombre[i] != null) {
						System.out.println("Nombre[" + nombre[i] + "]\t" + "Edad[" + edad[i] + "]\t" + "Nota1["
								+ primeraNota[i] + "]\t" + "Nota2[" + segundaNota[i] + "]\t" + "Nota3[" + terceraNota[i]
								+ "]\t Media[" + media[i] + "]");
					}
				}
				break;

			case "o":
				boolean entrar = true;
				for (int i = 0; i < CAPACIDAD; i++) {
					if (nombre[i] == null) {
						entrar = false;
					}

				}
				if (entrar == false) {
					System.out.println("No se puede ordenar ya que no está lleno el array");
				}
				if (entrar) {
					String temporalN;
					int temporalE;
					double temporalP;
					double temporalS;
					double temporalT;
					double temporalM;

					for (int i = 0; i < nombre.length - 1; i++) {
						for (int j = i + 1; j < nombre.length; j++) {
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
				break;

			case "s":
				continuar = false;
				break;
			}
		}
	}
}
