package Ex1;

public class Retangulo {
	
	private double altura;
	private double largura;

	// Construtor
	Retangulo(double alt, double base) {
		this.altura = alt;
		this.largura = base;
	}
	
	public double calcularArea() {
		return (this.largura*this.altura);
	}
	
	public double calcularPerimetro() {
		return (2* (this.largura+this.altura));
	}
	
	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo (4.5, 6.0);
		System.out.println("area: " + r1.calcularArea());
		System.out.println("Perímetro: " + r1.calcularPerimetro());
	}

}
