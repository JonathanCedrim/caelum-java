package cap16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import banco.ContaCorrente;

public class ApiColletions {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		List<ContaCorrente> ccs = new ArrayList<ContaCorrente>();
		
		ContaCorrente cc0 = new ContaCorrente();
		ContaCorrente cc1 = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente();
					
		cc0.deposita(1000);
		cc1.deposita(3000);
		cc2.deposita(2000);
		
		ccs.add(cc0);
		ccs.add(cc1);
		ccs.add(cc2);		
		
		lista.add("Jonathan");
		lista.add("Adriano");
		lista.add("Maycom");			
		
		System.out.println(lista);
		System.out.println(ccs.toString());
		
		Collections.sort(lista);
		Collections.sort(ccs);
		
		System.out.println(lista);
		System.out.println(ccs.toString());
	}
}