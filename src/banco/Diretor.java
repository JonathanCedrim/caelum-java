package banco;

import cap5.Funcionario;

public class Diretor extends Funcionario implements Autenticavel{

	private int senha = 10;

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean autentica(int senha) {
		if(this.senha == senha){
			return true;
		}else{
			return false;
		}
		
	}

}
