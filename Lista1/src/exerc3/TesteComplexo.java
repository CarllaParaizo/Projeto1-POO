package exerc3;

public class TesteComplexo {

	public static void main(String[] args) {
		Complexo c1 = new Complexo(5, 2);
		Complexo c2 = new Complexo(3, 4);
		Complexo c = new Complexo();
		
		System.out.print("1� N�mero:");
		c1.mostrar();
		System.out.print("2� N�mero: ");
		c2.mostrar();
		
		c = c1.soma(c2);	
		System.out.print("Soma: ");
		c.mostrar();
		
		c = c1.multiplica(c2);
		System.out.print("Multiplica��o: ");
		c.mostrar();
		
		System.out.println("Nota��o Complexa: " + c.toString());;
		
		System.out.print("Modulo do 1� n�mero: ");
		System.out.printf("%.2f\n", c1.modulo());
		System.out.print("Modulo do 2� n�mero: ");
		System.out.printf("%.2f\n", c2.modulo());
		
		System.out.print("Argumento Principal do 1� n�mero: ");
		System.out.printf("%.2f\n", c1.argumentoPrincipal());
		System.out.print("Argumento Principal do 2� n�mero: ");
		System.out.printf("%.2f\n", c2.argumentoPrincipal());
	}

}
