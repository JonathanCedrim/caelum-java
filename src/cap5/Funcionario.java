package cap5;

import java.util.Date;

public abstract class Funcionario {
	private String nome;
	private String departamento;
	private Date dataEntrada;
	private String RG;
	private double salario;
	private boolean estaNaEmpresa = true;
	
	public abstract double getBonificacao();		
	
	public void bonifica(double aumento) {
		this.salario += aumento;
	}

	public void demite() {
		this.estaNaEmpresa = false;
	}

	public double calculaGanhoAnual() {
		return salario * 12;
	}

	public boolean estaNaEmpresa() {
		return this.estaNaEmpresa;
	}
	
	public String getDepartamento(){
		return this.departamento;
	}
}