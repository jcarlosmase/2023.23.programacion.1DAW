package examenEmpresa;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Principal {

	public static void main(String[] args) {
		GregorianCalendar f1 = new GregorianCalendar(1997, 02, 8);
		GregorianCalendar f2 = new GregorianCalendar(1987, 02, 8);
		GregorianCalendar f3 = new GregorianCalendar(1977, 02, 8);
		Trabajadores t1 = new Trabajadores("12340E", "joaquin", "garcia", true, 8, f1);
		Trabajadores t2 = new Trabajadores("32522A", "pepe", "gonzalez", false, 8, f2);
		Trabajadores t3 = new Trabajadores("39289Y", "ale", "cordobes", false, 8, f3);
		ArrayList<Trabajadores> trabajadores = new ArrayList<Trabajadores>();
		trabajadores.add(t1);
		ArrayList<Trabajadores> trabajadores2 = new ArrayList<Trabajadores>();
		trabajadores.add(t2);
		ArrayList<Trabajadores> trabajadores3 = new ArrayList<Trabajadores>();
		trabajadores.add(t3);
		Departamentos d1 = new Contabilidad("contabilidad", 10, 1000, trabajadores, 100);
		Departamentos d2 = new Comercial("comercial", 8, 1000, trabajadores2, 100);
		Departamentos d3 = new Desarrollo("desarrollo", 9, 1000, trabajadores3, 150);
		ArrayList<Departamentos> dpts = new ArrayList();
		dpts.add(d1);
		dpts.add(d2);
		dpts.add(d3);
		Empresa e1 = new Empresa("322302E", dpts);
		e1.nomina("32522A");
	}

}
