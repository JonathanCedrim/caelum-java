package cap16;

import java.util.TreeSet;

public class TestaTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> arvore = new TreeSet<Integer>();
		
		double inicio = System.currentTimeMillis();
		
		for(int i = 1000; i > 0; i--){
			arvore.add(i);
		}
				
		double termino = System.currentTimeMillis();
		
		System.out.println("tempo: " + (termino - inicio));
	}
}