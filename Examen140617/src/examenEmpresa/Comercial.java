package examenEmpresa;

import java.util.ArrayList;

public class Comercial extends Departamentos{
	public Comercial(String nombre, int numPlanta, float salarioBase, ArrayList<Trabajadores> trabajadores, float complemento) {
		super(nombre, numPlanta, salarioBase, trabajadores, complemento );
		codigo="com002";
	}
	@Override
	public double getSalarioBase() {
		return salarioBase;
	}
	@Override
	public double getComplemento() {
		return complemento;
	}
	@Override
	public String getCodigo() {
		return codigo;
	}

}
