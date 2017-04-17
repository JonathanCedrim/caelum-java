package banco;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}
	
	public void roda(Conta conta){
		this.saldoTotal += conta.saldo;
	}

	public double getSaldoTotal() {	
		return this.saldoTotal;
	}
}
