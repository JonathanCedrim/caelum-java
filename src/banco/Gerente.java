package banco;

import cap5.Funcionario;

public class Gerente extends Funcionario implements Autenticavel {
	private String nome;
	private String cpf;
	private double salario;
	private int senha;
	private int numeroDeFuncionariosGerenciados;

	public Gerente(String nome, String cpf, double salario, int senha, int numeroDeFuncionariosGerenciados) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.senha = senha;
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	@Override
	public double getBonificacao() {
		return this.getBonificacao() * 1.4 + 1000;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("acesso permitido");
			return true;
		} else {
			System.out.println("acesso negado");
			return false;
		}
	}
}