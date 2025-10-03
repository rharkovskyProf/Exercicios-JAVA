package Livraria;

public class Livro {
	
	private String titulo;
	private Autor autor;
	private int anoPublicacao;
	
	Livro(String tit, Autor aut, int ano){
		this.titulo=tit;
		this.autor=aut;
		this.anoPublicacao=ano;
	}

	public void exibirDetalhes() {
		System.out.println("\nLivro: " + this.titulo);
		System.out.println("Ano Publicação: " + this.anoPublicacao);
		System.out.println("Autor: " + this.autor.getNome());
		System.out.println("Nacionalidae: " + this.autor.getNacionalidade());		
	}
	
	public static void main(String[] args) {
		
		Autor jarbas = new Autor("Jarbas", "Brasil");
		Autor ruimar = new Autor("Ruimar", "Brasil");		
		Autor lucas = new Autor("Lucas", "Brasil");	
		
		Livro livro1 = new Livro("JAVA", lucas, 2020);
		Livro livro2 = new Livro("Anos 80", jarbas, 2015);
		
		livro1.exibirDetalhes();
		livro2.exibirDetalhes();
	}

}
