package banco;

public abstract class Conta {
	protected int numero;
	protected Cliente cliente;
	protected double saldo;
	private double limite;

	public void saca(double montante) {
		if (saldo + limite > montante) {
			this.saldo = saldo + limite - montante;
		} else {
			throw new LogicaDeNegocioException("saldo insuficiente");
		}
	}

	public double saldo() {
		return this.saldo;
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

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", cliente=" + cliente + ", saldo=" + saldo + ", limite=" + limite + "]";
	}
}