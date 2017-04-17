package banco;

import cap5.Funcionario;

public class SistemaInterno {
	void Login(Autenticavel funcionario) {
		int senha = 123;

		boolean ok = funcionario.autentica(senha);
	}
}