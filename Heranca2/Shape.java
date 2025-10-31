package Heranca2;

public abstract class Shape {
	
	String nome;
	int numLados;
	
	Shape (String nomeShape, int ladosShape){
		this.nome=nomeShape;
		this.numLados=ladosShape;
	}

	public  double getPerimetro() {
		return(0.0);
	}
	
	public  double  getArea() {
		return(0.0);	
	}
	
	public void displayDados() {
		System.out.println("\nForma: " + this.nome) ;
		System.out.println("Numero de lados: " + this.numLados);
		System.out.println("Area: " + this.getArea());
		System.out.println("Perimetro: " + this.getPerimetro());
	}
}
