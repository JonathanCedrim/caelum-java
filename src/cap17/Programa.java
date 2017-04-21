package cap17;

public class Programa implements Runnable {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("programa " + id + ", valor: " + i);
		}
	}
}