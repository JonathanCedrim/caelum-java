package cap16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class APIComparatorComLambda implements Comparator<String>{

	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
	}
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();

		lista.add("Jonathan");
		lista.add("Adriano");
		lista.add("Maycom");		
		
		
		
		Collections.sort(lista, new APIComparatorComLambda());
		
		Collections.sort(lista, (s1, s2) -> Integer.compare(
												s1.length(), s2.length()));
		
		lista.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		System.out.println(lista);

	}
	
		
}