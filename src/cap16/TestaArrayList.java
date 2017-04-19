package cap16;

import java.util.ArrayList;
import java.util.TreeSet;

public class TestaArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arvore = new ArrayList<Integer>();

		double inicio = System.currentTimeMillis();

		for (int i = 1000; i > 0; i--) {
			arvore.add(i);
		}

		double termino = System.currentTimeMillis();

		System.out.println("tempo: " + (termino - inicio));
	}
}
