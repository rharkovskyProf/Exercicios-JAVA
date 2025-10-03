import java.util.Scanner;

public class Codificar {
	
	private String fraseOriginal;
	private String fraseCodificada;
	
	Codificar(String frase){
		this.fraseOriginal=frase;
	}
	
	public String CodificarFrase(){
		String frase = "";
		
		for (int i=0;i< this.fraseOriginal.length();i++) {
			char c = this.fraseOriginal.charAt(i);
			int cNum = (int) c;
			
			if (Character.isUpperCase(c))
				c = ( (c=='Z') ? 'A' : (char) (cNum+1) );
			
			if (Character.isLowerCase(c))
				c = ( (c=='z') ? 'a' : (char) (cNum+1) );			
			
			frase = frase + c;
		}
		return (frase);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Frase a codificar: ");
		String frase = sc.nextLine();
		
		Codificar frase1 = new Codificar(frase);
		
		System.out.println(frase);
		System.out.println(frase1.CodificarFrase());

		sc.close();
	}

}
