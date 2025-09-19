package ex4;
import java.util.Scanner;

public class Matematica1 {

	private int numero;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void gerarTabuada() {
		System.out.println("Tabuada de " + this.numero);
		System.out.println("============");
		for (int i = 1; i <=10; i++) {
			System.out.println(this.numero + " x " + i + " = " + (this.numero*i));
		}
	}
	
	public void classificarNumero() {
		if (this.numero > 0)
			System.out.println(this.numero + " é Positivo");
		else if (this.numero < 0)
			System.out.println(this.numero + " é Negativo");
		else 
			System.out.println(this.numero + " é ZERO");
	}

}
