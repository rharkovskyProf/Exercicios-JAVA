package Heranca;

public class Gato extends Animal{
	
	Gato (String nomeCat){
		super(nomeCat, "Mamifero");
	}
	
	@Override
	public void fazerSom() {
		System.out.println("Gato faz MIAU MIAU!!");

	}

}
