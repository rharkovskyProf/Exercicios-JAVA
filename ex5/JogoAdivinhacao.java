package ex5;

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
	
	private int numeroAleatorio;
	private final int MAXIMASTENTATIVAS=5;
	
	public int getNumeroAleatorio() {
		return numeroAleatorio;
	}
	
	public void setNumeroAleatorio(int numeroAleatorio) {
		this.numeroAleatorio = numeroAleatorio;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		JogoAdivinhacao jogo1 = new JogoAdivinhacao();
		
		// escolhendo o número aleatório
		jogo1.setNumeroAleatorio(rd.nextInt(100)+1);
		
		int tentativa = 1;
		int palpite = 1;
		boolean palpiteCorreto = false;
		
		do {
			System.out.print("Entre com o palpite " + tentativa +" (1 a 100): ");
			palpite = sc.nextInt();
			
			palpiteCorreto = (palpite==jogo1.getNumeroAleatorio());
			
			if (palpiteCorreto) {
				break;
			} else if (palpite > jogo1.getNumeroAleatorio())
				System.out.println("Palpite alto - o número é menor");
			else
				System.out.println("Palpite baixo - o número é maior");
			
			tentativa++;
			
		} while (tentativa <= jogo1.MAXIMASTENTATIVAS);

		if (palpiteCorreto)
			System.out.println("Parabens, voce acertou!!");
		else
			System.out.println("Que pena, voce não adivinhou!! O número era " + jogo1.getNumeroAleatorio() );
	}
}
