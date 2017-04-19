package banco;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {
	
	public void alteraNumero(int numero){
		this.numero = numero;
	}
	
	
	public int compareTo(ContaPoupanca cp) {
		return Integer.compare(this.numero, cp.numero);
	}
		
}