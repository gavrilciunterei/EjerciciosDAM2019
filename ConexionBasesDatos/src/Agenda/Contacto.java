package Agenda;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Contacto {

	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private double salario;
	private String correo;
	
	public Contacto() {}
	public Contacto(String nombre, String apellido, String fechaNacimiento, double salario, String correo) {

		setNombre(nombre);
		setApellido(apellido);
		setFechaNacimiento(fechaNacimiento);
		setSalario(salario);
		setCorreo(correo);

	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		if(validarFecha(fechaNacimiento)) {
			this.fechaNacimiento = fechaNacimiento;
		}else {
			this.fechaNacimiento = fechaDefecto();
		}
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public static boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    
	}
	
	public String fechaDefecto() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		return dateFormat.format(date);
	}
	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre.trim()+ ", apellido=" + apellido.trim() + ", fechaNacimiento=" + fechaNacimiento
				+ ", salario=" + salario + ", correo=" + correo.trim() + "]";
	}

}
