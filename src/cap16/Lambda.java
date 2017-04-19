package cap16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import banco.Conta;
import banco.ContaCorrente;

public class Lambda implements Comparator<String> {
	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
	}

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();

		Conta cc = new ContaCorrente();
		
		lista.add("Jonathan");
		lista.add("Adriano");
		lista.add("Maycom");

		Collections.sort(lista, new APIComparatorComLambda());

		Collections.sort(lista, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

		lista.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		lista.forEach(s -> System.out.print(s + " "));
		
		lista.removeIf(lista1 -> lista.equals(("Jonathan")));
		
	
		
		System.out.println();
		
		System.out.println(lista);

	}
}