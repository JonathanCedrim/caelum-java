package banco;

public class ContaCorrente extends Conta implements Tributavel, Comparable<ContaCorrente> {

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public void deposita(double montante) {
		this.saldo += montante - 0.10;
	}

	public double calculaTributo() {
		return this.saldo * 0.01;
	}

	@Override
	public String toString() {
		return "R$" + this.saldo;
	}

	public int compareTo(ContaCorrente cc) {
		return Integer.compare(this.numero, cc.numero);
	}
}