package cap16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterationAboveColletions {
	public static void main(String[] args) {
		Set<String> conjunto = new HashSet<String>();
		String text = null;
		conjunto.add("1");
		conjunto.add("2");
		conjunto.add("3");
		
		Iterator<String> i = conjunto.iterator();
		
		while (i.hasNext()) {
			 text = i.next();
			
			System.out.printf("%s ", text);
		}
	}
}
