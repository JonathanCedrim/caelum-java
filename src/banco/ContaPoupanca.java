package banco;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	public int compareTo(ContaPoupanca cp) {
		return Integer.compare(this.numero, cp.numero);
	}
}