package cap19;

import java.io.InputStream;
import java.util.Scanner;

public class Recebedor implements Runnable {
	private InputStream servidor;

	public Recebedor(InputStream servidor) {
		this.servidor = servidor;
	}

	@Override
	public void run() {
		Scanner in = new Scanner(this.servidor);

		while (in.hasNext()) {
			System.out.println(in.nextLine());
		}
	}
}
