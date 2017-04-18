package cap15;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteSaida {
	public static void main(String[] args) throws IOException {
		
		OutputStream out = new FileOutputStream("saida.txt");						
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		StringBuilder build = new StringBuilder("[");
		build.append("Bem vindo, ");
		build.append("Jonathan");
		build.append("]");
		
		
		bw.write(build.toString());
		
		
		bw.close();
	}
}