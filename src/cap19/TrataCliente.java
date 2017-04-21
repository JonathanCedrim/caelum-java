package cap19;

import java.io.InputStream;
import java.util.Scanner;

public class TrataCliente implements Runnable {

	private InputStream cliente;
	private Servidor servidor;

	public TrataCliente(InputStream cliente, Servidor servidor) {
		this.cliente = cliente;
		this.servidor = servidor;
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(this.cliente);

		while (sc.hasNext()) {
			servidor.distribuiMensagem(sc.nextLine());
		}
		sc.close();
	}
}
