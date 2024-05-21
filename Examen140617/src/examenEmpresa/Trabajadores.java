package examenEmpresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Trabajadores {
	private String nif;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String tlfn;
	private boolean jefe;
	private int numHoras;
	private GregorianCalendar fechaNac;
	private GregorianCalendar fechaIncorporacion;

	public Trabajadores(String nif, String nombre, String apellidos, String direccion, String tlfn, boolean jefe,
			int numHoras, GregorianCalendar fechaNac, GregorianCalendar fechaIncorporacion) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.tlfn = tlfn;
		this.jefe = jefe;
		this.numHoras = numHoras;
		this.fechaNac = fechaNac;
		this.fechaIncorporacion = fechaIncorporacion;
	}
	public Trabajadores(String nif, String nombre, String apellidos, boolean jefe,
			int numHoras, GregorianCalendar fechaIncorporacion) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.jefe = jefe;
		this.numHoras = numHoras;
		this.fechaIncorporacion = fechaIncorporacion;
	}
	
	public String getNif() {
		return nif;
	}

	public boolean getJefe() {
		return jefe;
	}

	public void nomina(String codDpto, double salarioBase, double complemento) {
		double salario;
		GregorianCalendar fecha = new GregorianCalendar();
		int años = fecha.get(Calendar.YEAR) - fechaIncorporacion.get(Calendar.YEAR);
		if (codDpto.equals("com002"))
			complemento *= numHoras;
		else if (codDpto.equals("des003"))
			complemento *= años;
		if (jefe)
			salario = salarioBase * 1.1 + complemento;
		else
			salario = salarioBase + complemento;

		System.out.println("DATOS DEL TRABAJADOR: \n NIF: " + nif + " Nombre y apellidos: " + nombre + " " + apellidos
				+ " \n " + " Numero de horas de jornada  " + numHoras + " Numero de años de antigüedad " + años + "\n"
				+ "CONCEPTOS \nSalario base................ " + salarioBase + "\n" + "Complementos:……………………………………………..."
				+ complemento + "\n" + "Total Nomina: .... : " + salario);
	}

}
