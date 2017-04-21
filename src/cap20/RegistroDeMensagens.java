package cap20;

import java.util.ArrayList;
import java.util.Collection;

public class RegistroDeMensagens {
	
	public static void main(String[] args) throws InterruptedException {
		Collection<String> mensagens = new ArrayList<String>();

		Thread t1 = new Thread(new ProduzMensagens(0, 10000, mensagens));
		Thread t2 = new Thread(new ProduzMensagens(10000, 20000, mensagens));
		Thread t3 = new Thread(new ProduzMensagens(20000, 30000, mensagens));

		t1.start();
		t2.start();
		t3.start();

		// main aguarda o fim da thread para continuar
		t1.join();
		t2.join();
		t3.join();

		System.out.println("Threads produtoras de mensagens finalizadas!");

		for (int i = 0; i < 15000; i++) {
			if (!mensagens.contains("Mensagem " + i)) {
				throw new IllegalStateException("mensagem nao encontrada: " + i);
			}
		}

		if (mensagens.contains(null)) {
			throw new IllegalStateException("nao deve conter valor null");
		}
		System.out.println("executado com sucesso.");
	}
}