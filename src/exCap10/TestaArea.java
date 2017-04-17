package exCap10;

public class TestaArea {
	public static void main(String[] args) {
		AreaCalculavel ac = new Retangulo(5, 5);
		ac = new Circulo(5);
		ac = new Quadrado(5);
		System.out.println(ac.calculaArea());
	}
}