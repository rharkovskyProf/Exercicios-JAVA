package Livraria;

public class Autor {

	private String nome;
	private String nacionalidade;
	
	Autor (String nomeAutor, String nacional){
		this.nome = nomeAutor;
		this.nacionalidade = nacional;
	}
	
	public String getNome() {
		return(this.nome);
	}

	public String getNacionalidade() {
		return (this.nacionalidade);
	}
	
}
