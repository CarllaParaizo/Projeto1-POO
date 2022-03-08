package exerc1;

public class Churrasco {
	double qtdCarne;						
	
	void verificarConsumo(Pessoa pessoa) {	
		if(pessoa.vegetariana==true || pessoa.idade<=3)
			this.qtdCarne=this.qtdCarne+0;
			else
		if(pessoa.idade>=4 && pessoa.idade<=12)
			this.qtdCarne=this.qtdCarne+1;
			else
		if(pessoa.idade>13)
			this.qtdCarne=this.qtdCarne+2;
	}
	
	double getQtdCarne(){				
		return this.qtdCarne;
	}

}

