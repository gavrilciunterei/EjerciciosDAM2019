package Agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Agenda {

	private Connection conn = DriverManager.getConnection("jdbc:sqlite:Agenda.db");

	public Agenda() throws SQLException, ClassNotFoundException {

	//	Class.forName("org.sqlite.JDBC");
		conn.setAutoCommit(true);

		String sql = "CREATE TABLE IF NOT EXISTS CONTACTO ("
				+ "NOMBRE VARCHAR PRIMARY KEY NOT NULL,"
				+ "APELLIDO VARCHAR NOT NULL," 
				+ "FECHA_NACIMIENTO VARCHAR NOT NULL," 
				+ "SALARIO INTEGER NOT NULL,"
				+ "CORREO VARCHAR NOT NULL"
				+ ");";

		conn.createStatement().executeUpdate(sql);

	}

	public boolean anadir(Contacto c) throws SQLException {

		String sql = "INSERT INTO CONTACTO (NOMBRE, APELLIDO, FECHA_NACIMIENTO, SALARIO, CORREO)"
				+ "VALUES (?, ?, ?, ?, ?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, c.getNombre());
		ps.setString(2, c.getApellido());
		ps.setString(3, c.getFechaNacimiento());
		ps.setDouble(4, c.getSalario());
		ps.setString(5, c.getCorreo());
		int contador = ps.executeUpdate();
		if (contador > 0) {
			return true;
		}
		return false;

	}

	public boolean eliminar(String nombre) throws SQLException {

		String sql = "DELETE FROM CONTACTO WHERE NOMBRE = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, nombre);

		int contador = ps.executeUpdate();
		if (contador > 0) {
			return true;
		}
		return false;
	}

	public void buscar(String nombre) throws SQLException {

		String sql = "SELECT * FROM CONTACTO WHERE NOMBRE = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, nombre);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println("[Nombre: "+rs.getString(1) + "] [Apellido: " + rs.getString(2) + "] [Fecha: " + rs.getString(3) + "] [Salario: " + rs.getInt(4)
					+ "] [Correo: " + rs.getString(5)+"]");
		}
	}

	public void mostrar() throws SQLException {

		String sql = "SELECT * FROM CONTACTO ORDER BY NOMBRE, APELLIDO";
		ResultSet rs = conn.createStatement().executeQuery(sql);

		while (rs.next()) {
			System.out.println("[Nombre: "+rs.getString(1) + "] [Apellido: " + rs.getString(2) + "] [Fecha: " + rs.getString(3) + "] [Salario: " + rs.getInt(4)
			+ "] [Correo: " + rs.getString(5)+"]");
		}

	}

	public void salir() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
