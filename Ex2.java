package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Crie uma lista de nomes e permita que o usuário adicione nomes via Scanner. 
 * Depois, exiba todos os nomes em ordem alfabética.
 */
public class Ex2 {

	public static void main(String[] args) {
		ArrayList<String> nomes =  new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		String nome;
		
		while (true) {
			System.out.print("Entre com nome: ");
			nome = sc.nextLine();
			if (nome.toLowerCase().equals("fim")) {
				break;
			}
			nomes.add(nome);
		}
		
		System.out.println("Lista Original: " + nomes);
		Collections.sort(nomes); // ordena
		System.out.println("Lista Ordenada: " + nomes);
		
		

		

	}

}
