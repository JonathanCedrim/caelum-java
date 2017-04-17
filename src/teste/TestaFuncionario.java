package teste;

import java.util.Calendar;

import cap5.Funcionario;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Jonathan", "TI", Calendar.getInstance(), "42.134.412.12-2", 2000);
		
		funcionario.bonifica(1000);
		
		System.out.println(funcionario.calculaGanhoAnual());
		
		
		funcionario.demite();
		System.out.println(funcionario.estaNaEmpresa());
		
		System.out.println(funcionario.toString());
	}
}