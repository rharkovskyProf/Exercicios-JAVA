package Heranca;

public class Cachorro extends Animal{
	
	Cachorro (String nomeCao){
		super(nomeCao, "Mamifero");
	}
	
	@Override
	public void fazerSom() {
		System.out.println("Cachorro faz AU AU!!");

	}

}
