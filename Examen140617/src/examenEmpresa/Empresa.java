package examenEmpresa;

import java.util.ArrayList;

public class Empresa {
	private String cif;
	private String razonSoc;
	private String domicilioFiscal;
	private String tlfn;
	private ArrayList<Departamentos> deptos = new ArrayList();
	public Empresa(String cif, String razonSoc, String domicilioFiscal, String tlfn, ArrayList<Departamentos> deptos) {
		this.cif = cif;
		this.razonSoc = razonSoc;
		this.domicilioFiscal = domicilioFiscal;
		this.tlfn = tlfn;
		this.deptos = deptos;
	}
	public Empresa(String cif, ArrayList<Departamentos> deptos) {
		this.cif = cif;
		this.deptos = deptos;
	}
	public void nomina(String nif){
		for(Departamentos al: deptos)
			if(al.buscarT(nif).getNif().equals(nif))
			al.buscarT(nif).nomina(al.getCodigo(), al.getSalarioBase(), al.getComplemento());
	}
}
