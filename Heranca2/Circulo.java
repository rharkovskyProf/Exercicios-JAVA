package Heranca2;

public class Circulo extends Shape{
	double raio;
	Circulo (double raioCir){
		super("Circulo", 0);
		this.raio=raioCir;
	}
	
	@Override
	public  double getPerimetro() {
		double perimetro = 2 * Math.PI * this.raio;
		return(perimetro);
	}
	@Override	
	public  double  getArea() {
		double area = Math.PI * Math.pow(raio, 2);
		return(area);	
	}
}
