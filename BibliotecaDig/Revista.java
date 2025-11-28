package BibliotecaDig;

public class Revista extends ItemBiblioteca{

	private int	numeroEdicao;
	
	Revista (String titRev, String EditoraRev, int anoRev, int edicao){
		super(titRev, EditoraRev, anoRev);
		this.numeroEdicao=edicao;
	}
	
	@Override
	public void exibirInformacoes() {
		System.out.println("--------- Revista ------------------");
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Editora: " + this.autorOuEditora);
		System.out.println("Ano: " + this.anoPublicacao);
		System.out.println("Edição: " + this.numeroEdicao);
	}
}
