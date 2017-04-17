package banco;

public abstract class Conta {
	private int numero;
	private Cliente cliente;
	protected double saldo;
	private double limite;

	public void saca(double montante) {
		if (saldo + limite > montante) {
			this.saldo = saldo + limite - montante;
		} else {
			throw new IllegalArgumentException("saldo insuficiente");
		}
	}

	public void deposita(double montante) {
		this.saldo += montante;
	}

	public void tranfere(Conta conta, double montante) {
		if (saldo + limite > montante) {
			this.saca(montante);
			conta.deposita(montante);
		} else {
			throw new IllegalArgumentException("saldo insuficiente");
		}
	}
	
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa;
	}

	public String toString() {
		return "Conta [numero=" + numero + ", cliente=" + cliente + ", saldo="
				+ saldo + ", limite=" + limite + "]";
	}
}