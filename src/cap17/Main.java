package cap17;

public class Main {
	public static void main(String[] args) {
		GeraPDF geraPDF = new GeraPDF();
		Thread threadPDF = new Thread(geraPDF);
		threadPDF.start();
				
		BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
		Thread threadBarra = new Thread(barraDeProgresso);
		threadBarra.start();					
	}
}