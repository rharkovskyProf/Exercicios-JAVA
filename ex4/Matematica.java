package ex4;
import java.util.Scanner;

public class Matematica {

	public int numero;
	
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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Matematica tabuada = new Matematica();
		
		System.out.print("Entre com um número: ");
		tabuada.numero = sc.nextInt();
		
		tabuada.classificarNumero();
		tabuada.gerarTabuada();
		
		sc.close();
	}
}
