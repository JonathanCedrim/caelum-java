package cap16;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import banco.ContaCorrente;
import banco.Engenheiro;

public class ApiHashMap {

	public static void main(String[] args) {
		Map<String, ContaCorrente> mapaDeContas = new HashMap<String, ContaCorrente>();
		Map<String, Engenheiro> mapaDeContasArvore = new TreeMap<String, Engenheiro>();

		ContaCorrente cc0 = new ContaCorrente();
		ContaCorrente cc1 = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente();

		Engenheiro eng0 = new Engenheiro();
		Engenheiro eng1 = new Engenheiro();
		Engenheiro eng2 = new Engenheiro();

		mapaDeContas.put("diretor", cc0);
		mapaDeContas.put("gerente", cc1);
		mapaDeContas.put("secretaria", cc2);

		mapaDeContasArvore.put("diretor", eng0);
		mapaDeContasArvore.put("gerente", eng1);
		mapaDeContasArvore.put("secretaria", eng2);

		System.out.println(mapaDeContas);
		System.out.println(mapaDeContasArvore);

	}
}
