package Exercicios;

import java.util.ArrayList;
import java.util.Random;

/*
 * Crie um ArrayList<Integer> e adicione 10 números. Exiba apenas os números pares.
 */
public class ex1 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros =  new ArrayList<>();
		Random numRand = new Random();
		for (int i = 0; i< 10; i++) {
			//numeros.add(i);
			numeros.add(numRand.nextInt(100));
		}
		System.out.println("LIsta completa");
		System.out.println(numeros);
		
		System.out.println("Números Pares");
		for (int n: numeros) {
			if (n%2==0) {
				System.out.println(n);
			}
		}

	}

}
