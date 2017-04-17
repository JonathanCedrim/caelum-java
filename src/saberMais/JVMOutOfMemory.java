package saberMais;

public class JVMOutOfMemory {
	public static void main(String[] args) {
		String[] i = new String[1000000000];

		for (int j = 0; j < i.length; j++) {
			i[j] = new String("X");

		}
	}
}
