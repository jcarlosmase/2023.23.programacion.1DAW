package examenEmpresa;

import java.util.ArrayList;

public class Contabilidad extends Departamentos {

	public Contabilidad(String nombre, int numPlanta, float salarioBase,
			ArrayList<Trabajadores> trabajadores,float complemento) {
		super(nombre, numPlanta, salarioBase, trabajadores, complemento);
		codigo="con001";
	}
	@Override
	public double getComplemento() {
		return complemento;
	}

	public void setComplementoBase(float complementoBase) {
		complemento = complementoBase;
	}

	@Override
	public double getSalarioBase() {
		return salarioBase;
	}
	@Override
	public String getCodigo() {
		return codigo;
	}
}
