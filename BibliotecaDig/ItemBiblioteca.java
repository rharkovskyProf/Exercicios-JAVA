package BibliotecaDig;
import java.time.Year;

public abstract class ItemBiblioteca {
	
	protected String titulo;
	protected String autorOuEditora;
	protected int anoPublicacao;
	
	ItemBiblioteca(String tit, String autorEd, int ano){
		this.titulo = tit;
		this.autorOuEditora = autorEd;
		this.anoPublicacao = ano;
	}
	
	public void exibirInformacoes() {
		
	}
	
	public int calcularIdadePublicacao() {
		int anoAtual = Year.now().getValue();
		
		return (anoAtual - this.anoPublicacao);
	}


}
