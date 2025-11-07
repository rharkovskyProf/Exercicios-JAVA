package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Crie um ArrayList<String> com nomes de cidades. Permita que o usuário remova 
 * uma cidade informando o nome. Depois, exiba a lista atualizada.

 */
public class Cidade {
	public String nome;
	
	Cidade (String nomeCid) {
		this.nome=nomeCid;
	}

	public static void main(String[] args) {
		ArrayList<String> cidades =  new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String cidade;

		while (true) {
			System.out.print("Entre com a cidade: ");
			cidade = sc.nextLine();
			if (cidade.toLowerCase().equals("fim")) {
				break;
			}
			cidades.add(cidade);
		}

		System.out.println(cidades);
		System.out.println("Entre com o nome da cidade a remover: ");
		cidade = sc.nextLine();

		if (cidades.contains(cidade)) {
			cidades.remove(cidade);			
		}else {
			System.out.println("Cidade não encontrada");
		}

		System.out.println(cidades);
	}

}
