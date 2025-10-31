package Heranca;

public abstract class Animal {
	String nome;
	String familia;
	
	Animal (String nomeAnimal, String familiaAnimal){
		this.nome = nomeAnimal;
		this.familia = familiaAnimal;
	}
	
	public void fazerSom() {
		
	}
	
	public void exibirInfo() {
		System.out.println("Informações do animal:");
		System.out.println("Animal "+ this.nome + " - Familia: " + this.familia);
		this.fazerSom();
	}
	
}
