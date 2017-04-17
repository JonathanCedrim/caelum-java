package teste;

import java.util.Calendar;

import banco.Cliente;
import banco.Gerente;
import cap5.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Gerente("Jonathan", "430", 1000, 123, 10);

		funcionario.bonifica(1000);

		System.out.println(funcionario.calculaGanhoAnual());

		funcionario.demite();
		System.out.println(funcionario.estaNaEmpresa());

		System.out.println(funcionario.toString());
	}
}