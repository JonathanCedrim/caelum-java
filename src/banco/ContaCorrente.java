package banco;

public class ContaCorrente extends Conta{

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}
	
	@Override
	public void deposita(double montante) {
		this.saldo += montante - 0.10;
	}
}
