package cap17;

public class Teste {
	public static void main(String[] args) {
		Programa p1 = new Programa();
		p1.setId(1);

		Programa p2 = new Programa();
		p2.setId(2);

		Programa p3 = new Programa();
		p3.setId(3);
		
		Programa p4 = new Programa();
		p4.setId(4);
		
		Programa p5 = new Programa();
		p5.setId(5);
		
		Programa p6 = new Programa();
		p6.setId(6);
		
		Programa p7 = new Programa();
		p7.setId(7);
		
		Programa p8 = new Programa();
		p8.setId(8);
		
		Programa p9 = new Programa();
		p9.setId(9);
		
		Programa p10 = new Programa();
		p10.setId(10);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		Thread t4 = new Thread(p4);
		Thread t5 = new Thread(p5);
		Thread t6 = new Thread(p6);
		Thread t7 = new Thread(p7);
		Thread t8 = new Thread(p8);
		Thread t9 = new Thread(p9);
		Thread t10 = new Thread(p10);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
	}
}