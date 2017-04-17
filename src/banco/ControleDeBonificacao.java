package banco;

import cap5.Funcionario;

public class ControleDeBonificacao {
	private double totalDeBonificacoes = 0;
	
	public void registra(Funcionario funcionario){
		System.out.println("adiciona bonificao do funcionario : " + funcionario);
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}
	
	public double getTotalDeBonificacoes(){
		return this.totalDeBonificacoes;
	}
}