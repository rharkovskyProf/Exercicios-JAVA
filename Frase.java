import java.util.Scanner;

public class Frase {
	
	private String frase;
		
	Frase(String sentenca){
		this.frase = sentenca;
	}

	public int contaVogais() {
		int contador=0;
		for (int i=0; i < this.frase.length(); i++) {
			switch (frase.toLowerCase().charAt(i)) {
				case 'a','e','i','o','u' : contador++;			
			}
		}
		return (contador);
	}
	
	public int contaLetras() {
		int contador=0;
		for (int i=0; i < this.frase.length(); i++) {
			if (Character.isLetter(this.frase.charAt(i)))
				contador++;
		}
		return (contador);
	}
	
	public int contaDigitos() {
		int contador=0;
		for (int i=0; i < this.frase.length(); i++) {
			if (Character.isDigit(this.frase.charAt(i)))
				contador++;
		}
		return (contador);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// lendo a frase		
		System.out.print("Frase: ");		
		Frase frs = new Frase(sc.nextLine());
		
		// resultados
		System.out.println("Vogais: " + frs.contaVogais());
		System.out.println("Consoantes: " + (frs.contaLetras()-frs.contaVogais()));
		System.out.println("Digitos: " + frs.contaDigitos());
		


	}

}
