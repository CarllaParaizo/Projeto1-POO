package exerc2;

public class Lampada {
		
		int qtdCliques;
		boolean estado;
		void cliqueInterruptor()
		{
		if(this.qtdCliques<10)
		{
		this.qtdCliques++;
		mudarEstado();
		}
		else {
		this.estado=false;
		}
		}
		void mudarEstado()
		{
		if(this.estado == true)
		{
		this.estado=false;
		}
		else {
		this.estado=true ;
		}
		}
		boolean getEstado()
		{
		return this.estado;
		}

	}
