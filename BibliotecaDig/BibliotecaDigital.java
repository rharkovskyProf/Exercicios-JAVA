package BibliotecaDig;
import java.util.ArrayList;

public class BibliotecaDigital {
	
	private ArrayList<ItemBiblioteca> acervo = new ArrayList<>();
	
	public void adicionarItem(ItemBiblioteca item) {
		this.acervo.add(item);
		
	}
	
	public int contarItensPorTipo() {
		return(this.acervo.size());
	}
	
	public void listarItens() {
		for (ItemBiblioteca item: acervo) {
			item.exibirInformacoes();
		}
	}

	public static void main(String[] args) {
		BibliotecaDigital bib1 = new BibliotecaDigital();
		
		Livro livro1 = new Livro("Java Básico", "João Silva", 2015, 300);
		Revista revista1 = new Revista("Tech News", "Editora Tech", 2020, 12);
		bib1.adicionarItem(livro1);
		bib1.adicionarItem(revista1);
		
		bib1.adicionarItem(new Livro("Estruturas de Dados", "Maria Souza", 2018, 450));
		bib1.adicionarItem(new Revista("Ciência Hoje", "Editora Ciência", 2019, 45));
		bib1.adicionarItem(new Livro("Design Patterns", "Erich Gamma et al.", 1994, 500));
		bib1.adicionarItem(new Livro("O Guia do Mochileiro", "Douglas Adams", 1979, 224));
		bib1.adicionarItem(new Revista("Natureza Viva", "Editora Ambiental", 2023, 55));
		bib1.adicionarItem(new Revista("História em Foco", "Editora Saber", 2022, 18));
		bib1.adicionarItem(new Livro("A Arte da Guerra", "Sun Tzu (Edição Moderna)", 2005, 150));
		bib1.adicionarItem(new Livro("Inteligência Artificial: Uma Abordagem Moderna", "Stuart Russell e Peter Norvig", 2010, 1152));
		bib1.adicionarItem(new Revista("Saúde & Bem-Estar", "Editora Viva", 2024, 1));
		bib1.adicionarItem(new Revista("Automóvel Clássico", "Editora Rodas", 2017, 33));

		//Listar
		bib1.listarItens();
	}

}
