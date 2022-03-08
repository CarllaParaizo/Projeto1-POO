package exerc2;

public class TesteLampada {

	 public static void main(String[] args) {
		 Lampada lamp= new Lampada();

		for(int x=0; x<25; x++)
		{
		lamp.cliqueInterruptor();
		System.out.println(lamp.getEstado());
		}

		 }
		

	}

