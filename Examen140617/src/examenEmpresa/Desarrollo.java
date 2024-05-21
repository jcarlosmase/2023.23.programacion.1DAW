package examenEmpresa;

import java.util.ArrayList;

public class Desarrollo extends Departamentos{
		public Desarrollo(String nombre, int numPlanta, float salarioBase, ArrayList<Trabajadores> trabajadores,float complemento) {
		super(nombre, numPlanta, salarioBase, trabajadores, complemento);
		codigo="des003";
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
