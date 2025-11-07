package Exercicios;
/*
 * Crie um programa que leia 5 frases e armazene em um ArrayList<String>. 
 * Depois  exiba todas as frases, e  exiba apenas as frases que contêm 
 * a palavra "Java".
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Frase {
	public String frase;
	
	Frase (String txt) {
		this.frase=txt;
	}

	public static void main(String[] args) {
		ArrayList<String> frases =  new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String frase;

		while (true) {
			System.out.print("Entre com a frase: ");
			frase = sc.nextLine();
			if (frase.toLowerCase().equals("fim")) {
				break;
			}
			frases.add(frase);
		}
		System.out.println(frases);
		
		System.out.println("Frases com a palavra Java");
		for (String texto: frases) {
			if (texto.contains("Java")) {
				System.out.println(texto);
			}
		}
	}
}
