package cap5;

import java.util.HashMap;

public class Empresa {
	HashMap<String, Funcionario> funcionarios = new HashMap<String, Funcionario>();
	String cnpj;	
	
	public void adiciona(Funcionario funcionario){
		funcionarios.put(funcionario.getDepartamento(), funcionario);
	}
	
	@Override
	public String toString() { 
		return funcionarios.toString();
	}
}