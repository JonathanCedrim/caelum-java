package cap15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntrada {
	public static void main(String[] args) throws IOException{
		/*InputStream is = new FileInputStream("saida.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);*/
		
		BufferedReader br = new BufferedReader(
							new InputStreamReader(
							new FileInputStream("saida.txt")));
		
		String txt = br.readLine();
		
		while(txt != null){
			System.out.println(txt);
			txt = br.readLine();
		}
		br.close();
	}
}