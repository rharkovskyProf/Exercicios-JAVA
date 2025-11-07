package Exercicios;
/*
 * 3. Crie uma classe Aluno com atributos nome e nota. Armazene vários alunos em 
 * um ArrayList e exiba apenas os que têm nota maior que 7.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
	public String nome;
	public double nota;
	
	Aluno(String nomeAluno, double notaAluno){
		this.nome = nomeAluno;
		this.nota = notaAluno;
	}
	
	public static void main(String[] args) {
		ArrayList<Aluno> nomes =  new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String nome;
		double nota;
		Aluno aluno; 
		
		while (true) {
			System.out.print("Entre com nome do aluno: ");
			nome = sc.nextLine();
			if (nome.toLowerCase().equals("fim")) {
				break;
			}
			System.out.print("Entre com nota: ");
			nota = Double.parseDouble(sc.nextLine());

			aluno = new Aluno(nome, nota);
			nomes.add(aluno);
			//nomes.add(new Aluno(nome, nota));
		}
		
		System.out.println("=======================");
		System.out.println("Aluno Aprovados (nota >= 7.0");
		for (Aluno al : nomes) {
			if (al.nota >= 7.0) {
				System.out.println("Aluno: " + al.nome + " Nota: " + al.nota);
			}
		}
		
	}

}
