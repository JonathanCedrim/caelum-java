package saberMais;

public class Carro {
	private String cor;
	private String modelo;
	private Motor motor;
	private boolean status;
	private int velocidadeAtual = 0;
	private int velocidadeMaxima;

	public Carro(String cor, String modelo, Motor motor, int velocidadeMaxima) {
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void liga() {
		if (this.status) {
			System.out.println("carro ja esta ligado");
		} else {
			System.out.println("ligando...");
			this.status = true;
		}
	}

	public void desliga() {
		if (this.status) {
			System.out.println("desligando...");
			this.status = false;
			for (int i = velocidadeAtual; i >= 0; i--) {
				this.velocidadeAtual = i;
				System.out.println(velocidadeAtual + "...");
			}
			System.out.println("0");
		} else {
			System.out.println("carro ja esta desligado");
		}
	}

	public void acelera() {
		this.velocidadeAtual += 10;
		System.out.println(velocidadeAtual);
	}

	public int marcha() {
		if (this.velocidadeAtual < 0) {
			return -1;
		}
		if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			return 1;
		}
		if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			return 2;
		}
		return 3;
	}
}