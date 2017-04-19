package cap16;

import java.util.Collection;
import java.util.HashSet;

import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class TesteHash {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Conta> teste = new HashSet<Conta>();

		long inicio = System.currentTimeMillis();

		int total = 30000;
		
		ContaPoupanca c0 = new ContaPoupanca();
		ContaPoupanca c1 = new ContaPoupanca();
		
	     c0.alteraNumero(10);
		 c1.alteraNumero(10);
		
		 Conta c = c0;
		 Conta cl = c1;
		 
		 teste.add(c);
		 teste.add(cl);
		
		
		 
		 System.out.println(teste);
		
		/*
		 * for (int i = 0; i < total; i++) {
		 * 
		 * teste.add(c0);
		 * 
		 * }
		 */

		

		/*
		 * for (int i = 0; i < total; i++) {
		 * System.out.println(teste.contains(i)); }
		 */

		/*
		 * Iterator<Integer> i = teste.iterator();
		 * 
		 * while(i.hasNext()){ System.out.println(i.next()); }
		 */
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}

}
