package Agenda;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	private static void anadir(Agenda con) throws IOException, SQLException {

		System.out.println("Nombre: ");
		String nombre = sc.next();
		System.out.println("Apellido: ");
		String apellido = sc.next();
		System.out.println("Fecha Nacimiento: ");
		String fecha_nacimiento = sc.next();
		System.out.println("Salario: ");
		double salario = sc.nextDouble();
		System.out.println("Correo: ");
		String correo = sc.next();

		Contacto c = new Contacto(nombre, apellido, fecha_nacimiento, salario, correo);
		con.anadir(c);

	}

	private static void eliminar(Agenda con) throws IOException, SQLException {
		System.out.println("Nombre: ");
		String nombre = sc.next();
		con.eliminar(nombre);
	}

	private static void buscar(Agenda con) throws IOException, SQLException {
		System.out.println("Nombre: ");
		String nombre = sc.next();
		con.buscar(nombre);

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

		Agenda con = new Agenda();

		boolean continuar = true;
		while (continuar) {
			System.out.print("(A)Añadir, (M)Mostrar, (B)Buscar, (E)Eliminar,(S)Salir");
			
			String opcion = sc.nextLine().toUpperCase();
			switch (opcion) {
			case "A":
				anadir(con);
				break;
			case "M":
				con.mostrar();
				break;
			case "B":
				buscar(con);
				break;
			case "E":
				eliminar(con);
				break;
			case "S":
				con.salir();
				continuar = false;
				break;
			}
		}

	}

}
