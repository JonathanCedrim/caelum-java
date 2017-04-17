package banco;

public class Cliente implements Autenticavel {
	private String name;
	private String RG;
	private String cpf;
	private int senha;

	public Cliente(String name, String rg, String cpf, int senha) {
		this.name = name;
		this.RG = rg;
		this.cpf = cpf;
		this.senha = senha;
	}

	public String toString() {
		return "Cliente [name=" + this.name + ", RG=" + this.RG + ", cpf=" + this.cpf + "]";
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
