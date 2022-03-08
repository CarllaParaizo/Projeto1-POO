package exerc1;

public class TesteChurrasco {

	public static void main(String[] args) {
	
		Pessoa p1 = new Pessoa("Arthur" , Sexo.Masculino , 12 , false);
		Pessoa p2 = new Pessoa("Marina" , Sexo.Feminino ,02 , true);
		Pessoa p3 = new Pessoa("Anna", Sexo.Masculino , 55 , false);
		Pessoa p4 = new Pessoa("João" , Sexo.Masculino , 50 , true);
		
		Churrasco churrascoDeDomingo = new Churrasco();
		
		churrascoDeDomingo.verificarConsumo(p1);
		churrascoDeDomingo.verificarConsumo(p2);
		churrascoDeDomingo.verificarConsumo(p3);
		churrascoDeDomingo.verificarConsumo(p4);
		
		System.out.println(churrascoDeDomingo.getQtdCarne());
	}
}
