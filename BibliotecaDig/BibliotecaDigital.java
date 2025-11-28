package BibliotecaDig;
import java.util.ArrayList;

public class BibliotecaDigital {
	
	private ArrayList<ItemBiblioteca> acervo = new ArrayList<>();
	
	public void adicionarItem(ItemBiblioteca item) {
		this.acervo.add(item);
		
	}
	
//	public int contarItensPorTipo() {
//		return(this.acervo.size());
//	}
	
	public void contarItensPorTipo() { // 
        int totalLivros = 0;
        int totalRevistas = 0;

        for (ItemBiblioteca item : acervo) {

            if (item instanceof Livro) { 
                totalLivros++;
            } else if (item instanceof Revista) { 
                totalRevistas++;
            }
        }

        // Imprime o resultado
        System.out.println("\n--- Contagem de Itens ---"); 
        System.out.println("Total de Livros: " + totalLivros);
        System.out.println("Total de Revistas: " + totalRevistas);
    }
	
	public void listarItens() {
		for (ItemBiblioteca item: acervo) {
			item.exibirInformacoes();
		}
		
		contarItensPorTipo();
	}
	
	public boolean apagarItem(String titulo) {
		
		boolean resultado = false;
		int cont = 0;
		
        for (ItemBiblioteca item : acervo) {
        	if (item.titulo.contains(titulo)) {
        		this.acervo.remove(cont);
        		resultado = true;
        		break;
        	}
        	cont++;
         }
        return(resultado);
	}

	public ArrayList<ItemBiblioteca> buscarPorTitulo(String titulo) {
		
		ArrayList<ItemBiblioteca> resultado =  new ArrayList<>();
		
        for (ItemBiblioteca item : acervo) {
        	if (item.titulo.contains(titulo)) {
        		resultado.add(item);
        	}
         }
        return(resultado);
	}
	public static void main(String[] args) {
		BibliotecaDigital bib1 = new BibliotecaDigital();
		
		// adicionar
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
		bib1.adicionarItem(new Revista("Automóvel Clássico", "Editora Rodas", 2018, 38));
		
		//Apagar
		bib1.listarItens();
		if (bib1.apagarItem("Java Básico"))
			System.out.println("*** Item apagado ***");
		else
			System.out.println("*** Item nao encontrado ***");
	
		// testando caso de nao encontrar
		if (bib1.apagarItem("Java Básico"))
			System.out.println("*** Item apagado ***");
		else
			System.out.println("*** Item nao encontrado ***");
		
		//Listar por titulo
		bib1.contarItensPorTipo();
		
		for (ItemBiblioteca item: bib1.buscarPorTitulo("Ciência Hoje")){
			item.exibirInformacoes();
		}
		

	}

}
