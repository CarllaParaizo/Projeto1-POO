package exerc7;

public class Porta {
	boolean isOpean;
	int numAberturas;
	
	void abrir(){
		numAberturas++;
		isOpean=true;
		System.out.println("Abriu a Porta");
	}
	void fechar() {
		isOpean=false;
		System.out.println("Fechou a Porta");
	}
}
