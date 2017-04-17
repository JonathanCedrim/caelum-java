package exCap10;

public class Circulo implements AreaCalculavel {

	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double calculaArea() {
		return Math.PI * this.raio * this.raio;
	}
}
