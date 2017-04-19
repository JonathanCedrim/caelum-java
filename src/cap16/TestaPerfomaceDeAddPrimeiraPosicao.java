package cap16;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestaPerfomaceDeAddPrimeiraPosicao {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();

		// trocar depois por ArrayList
		List<Integer> teste = new LinkedList<Integer>();

		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}

		Iterator<Integer> i = teste.iterator();
		
		while (i.hasNext()) {
			Integer integer = i.next();			
		}
		
		
		/*
		 * for(Integer integer : teste){
		 * 
		 * }
		 */

		/*
		 * for (int i = 0; i < 30000; i++) { teste.get(i); }
		 */

		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo gasto: " + tempo);
	}
}