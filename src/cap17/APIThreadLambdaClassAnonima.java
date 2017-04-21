package cap17;

public class APIThreadLambdaClassAnonima {// implements Runnable {
	/*
	 * @Override public void run() { for (int i = 0; i < 100; i++) {
	 * System.out.println("Programa 1  valor: " + i); } }
	 */

	public static void main(String[] args) {
		/*
		 * Runnable r = new Programa1(); Thread t = new Thread(r);
		 * 
		 * t.start();
		 */

		// classe anonima
		/*
		 * Runnable r = new Runnable() { public void run() { for (int i = 0; i <
		 * 1000; i++) { System.out.println("programa 1 valor: " + i); } } };
		 * Thread t = new Thread(r); t.start();
		 */

		// lambda
		/*
		 * Runnable r = () -> { for (int i = 0; i < 1000; i++) {
		 * System.out.println("programa 1 valor: " + i); } }; Thread thread =
		 * new Thread(r); thread.start();
		 */
		// lambda mais curto
		new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("programa 1 valor: " + i);
			}
		}).start();
	}
}