package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Crie um ArrayList<String> para armazenar nomes de frutas. 
 * Adicione 5 frutas e exiba todas elas.
 */
public class Fruta {

	public static void main(String[] args) {
		ArrayList<String> frutas =  new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String fruta;

		while (true) {
			System.out.print("Entre com a fruta: ");
			fruta = sc.nextLine();
			if (fruta.toLowerCase().equals("fim")) {
				break;
			}
			frutas.add(fruta);
		}
		
		System.out.println(frutas);
		// imprimindo iterando
		for (String f : frutas) {
			System.out.println(f);
			if (f.equals("maçã")) {
				System.out.println("Fruta do pecado");
			}
				
		}

	}

}
