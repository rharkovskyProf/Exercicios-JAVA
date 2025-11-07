package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Crie um ArrayList<Double> para armazenar preços de produtos. 
 * Calcule e exiba: A soma de todos os preços, O maior preço e o menor preço.
 */
public class Preço {
	public double valor;
		
	public static void main(String[] args) {
		ArrayList<Double> precos =  new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		double preco, maior=0, menor=100, soma=0;
		

		while (true) {
			System.out.print("Entre com o preco: ");
			preco = Double.parseDouble(sc.nextLine());
			if (preco <= 0) {
				break;
			}
			soma =+ preco;
			if (preco > maior) { // maior preco
				maior = preco;
			}
			if (preco < menor) { // menor preco
				menor = preco;
			}
			
			precos.add(preco);
			
		}

		System.out.println(precos); // imprime a lista
		System.out.println("Maior preco: " + maior + " menor Preco: " + menor);
		System.out.println("Soma: " + soma + " Media: " + soma/precos.size());
		
		// forma mais profissional para obter o maximo e minimo
		System.out.println(Collections.max(precos));
		System.out.println(Collections.min(precos));
	}

}
