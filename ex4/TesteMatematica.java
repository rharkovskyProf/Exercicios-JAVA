package ex4;

import java.util.Scanner;

public class TesteMatematica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		// usando a classe com atributo publico
		Matematica tabuada1 = new Matematica();
		
		System.out.print("Entre com um número: ");
		tabuada1.numero = sc.nextInt();
		
		tabuada1.classificarNumero();
		tabuada1.gerarTabuada();
		
		// usando a classe com atributo privado
		Matematica1 tabuada2 = new Matematica1();
		
		System.out.print("Entre com um número: ");
		//tabuada2.numero = sc.nextInt();
		int num1 = sc.nextInt();
		tabuada2.setNumero(num1);
		
		tabuada2.classificarNumero();
		tabuada2.gerarTabuada();	
		
		
		sc.close();
	}

}
