package cap16;

import java.util.Collection;
import java.util.HashSet;

public class TestePerfomanceCollectionArrayAndHashSet {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new HashSet<Integer>();
		long inicio = System.currentTimeMillis();

		int total = 30000;

		for (int i = 0; i < total; i++) {
			teste.add(i);
		}

		for(int i = 0; i < total; i++){
			teste.contains(i);
		}
		
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
