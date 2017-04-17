package banco;

public class GerenciadorDeImpostoDeRenda {
	private double total;

	void adiciona(Tributavel tributavel) {
		System.out.println("adiciona tributavel: " + tributavel);

		this.total += tributavel.calculaTributo();
	}

	public double extrato() {
		return this.total;
	}
}
