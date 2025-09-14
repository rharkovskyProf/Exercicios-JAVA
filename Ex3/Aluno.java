package Ex3;

import java.util.Scanner;

public class Aluno {
	private String nome;
	private double media;
	public String situacao; //Como é publico pode ser acionado diretamente
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public void verificarSituacao() {
		if (this.media >= 7.0)
			this.situacao = "APROVADO";
		else
			this.situacao = "REPROVADO";		
	}

	public static void main(String[] args) {
		Aluno al1 = new Aluno();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome do Aluno: ");
        String nome = sc.nextLine();
        
        // ler como string e converter com Wrapper Dublr
        System.out.print("Média do Aluno: ");
        String mediaStr = sc.nextLine();
        double media1 = Double.parseDouble(mediaStr);
        
        al1.setNome(nome);
        al1.setMedia(media1);
        al1.verificarSituacao();
        
        System.out.println("Situação do Aluno " + al1.getNome() + " é "+ al1.situacao);
	}
}
