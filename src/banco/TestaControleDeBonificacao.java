package banco;

import cap5.Funcionario;

public class TestaControleDeBonificacao {
	public static void main(String[] args) {
		
		
		ControleDeBonificacao cb = new ControleDeBonificacao();
		
		Funcionario fn = new SecretariaAgencia();
		
		cb.registra(fn);
	}
}
