package BibliotecaDig;

public class Livro extends ItemBiblioteca{
	
	private int	numeroPaginas;
	
	Livro (String titLivro, String autorLivro, int anoLivro, int numpag){
		super(titLivro, autorLivro, anoLivro);
		this.numeroPaginas=numpag;
	}
	
	@Override
	public void exibirInformacoes() {
		System.out.println("--------- Livro ------------------");
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Autor: " + this.autorOuEditora);
		System.out.println("Ano: " + this.anoPublicacao);
		System.out.println("Pags: " + this.numeroPaginas);
	}

}
