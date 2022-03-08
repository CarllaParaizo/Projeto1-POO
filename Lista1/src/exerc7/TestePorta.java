package exerc7;

public class TestePorta {

	public static void main(String[] args) {
		Porta p = new Porta();
			for(int op=0; op <= 12; op++) {
				p.abrir();
				p.fechar();
		}
	}

}
