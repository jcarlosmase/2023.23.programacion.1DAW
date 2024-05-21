package examenEmpresa;

import java.util.ArrayList;

public abstract class Departamentos {
	protected String codigo;
	protected String nombre;
	protected int numPlanta;
	protected double salarioBase;
	protected double complemento;
	protected ArrayList<Trabajadores> trabajadores = new ArrayList<Trabajadores>();
	public Departamentos(String nombre, int numPlanta, float salarioBase,
			ArrayList<Trabajadores> trabajadores, double complemento) {
		this.nombre = nombre;
		this.numPlanta = numPlanta;
		this.salarioBase = salarioBase;
		this.trabajadores = trabajadores;
		this.complemento = complemento;
	}
	public abstract double getSalarioBase();
	public abstract double getComplemento();
	public Trabajadores buscarT(String nif){
		for(Trabajadores al: trabajadores)
			if(al.getNif().equals(nif))
				return al;
		return null;
	}
	public abstract String getCodigo();
}
