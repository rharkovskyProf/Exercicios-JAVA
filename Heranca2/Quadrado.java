package Heranca2;

public class Quadrado extends Shape{
	double lado;
	
	Quadrado (double tamLado){
		super("Quadrado", 4);
		this.lado = tamLado;
	}
	
	@Override
	public  double getPerimetro() {
		double perimetro = 4 * this.lado;
		return(perimetro);
	}
	
	@Override
	public  double  getArea() {
		double area = Math.pow(this.lado, 2);
		return(area);	
	}

}
