package banco;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gerenciadorIR = new GerenciadorDeImpostoDeRenda();
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		ContaCorrente cc = new ContaCorrente();

		cc.deposita(10000);
		gerenciadorIR.adiciona(cc);

		System.out.printf("O saldo e : %.2f %n", cc.saldo);
		System.out.println(gerenciadorIR.extrato());
	}
}