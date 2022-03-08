package exerc4;

	public class Triangulo {
		double lado1;
		double lado2;
		double lado3;
		double area;
		double perimetro;
	public Triangulo()
	{
		lado1=25;
		lado2=30;
		lado3=21;
	}

	 void calcularArea()
	{
	this.area=lado1*(Math.sqrt(3)/2);
	}
	void calcularperimetro()
	{
	this.perimetro=lado1*3;
	}

	 double getPerimetro() {
	return this.perimetro;
	}
	double getArea() {
	return this.area;
	}
}


