package ex1;

import java.util.Scanner;

public class ValidadorSenha {
	private String senha;
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean TestaMaiuscula () {
		String maiusculas = "QWERTYUIOPASDFGHJKLÇZXCVBNM";
		for (int i=0;i < senha.length();i++) 
			for (int j=0; j < maiusculas.length();j++) {
				if (this.senha.charAt(i) == maiusculas.charAt(j))
					return true;
			}
		return false;
	}
		
	public boolean TestaDigitos () {
		String digitos = "0123456789";
		for (int i=0;i < senha.length();i++) 
			for (int j=0; j < digitos.length();j++) {
				if (this.senha.charAt(i) == digitos.charAt(j))
					return true;
			}
		return false;
	}
	
	public boolean TestaEspeciais () {
		String especiais = "!@#$%&*";
		for (int i=0;i < senha.length();i++) 
			for (int j=0; j < especiais.length();j++) {
				if (this.senha.charAt(i) == especiais.charAt(j))
					return true;
			}
		return false;
	}

	public boolean verificarSeguranca() {
		if (this.senha.length()< 8) 
			return false;

		if (!TestaMaiuscula()) 
			return false;
		
		if (!TestaDigitos()) 
			return false;
		
		if (!TestaEspeciais()) 
			return false;
		
		return true;
	}

	public static void main(String[] args) {
	// lendo a senha	
		ValidadorSenha senha1 = new ValidadorSenha();
		Scanner sc = new Scanner(System.in);
		System.out.println("--- Validador de Senha ---");
        System.out.println("Sua senha deve ter:");
        System.out.println("- Pelo menos 8 caracteres");
        System.out.println("- Uma letra maiúscula");
        System.out.println("- Um número");
        System.out.println("- Um caractere especial (!@#$%&*)");
		System.out.print("Entre com a Senha a validar: ");
		String minhaSenha = sc.nextLine();
		
	//testando
		senha1.setSenha(minhaSenha);
		if (senha1.verificarSeguranca())
			System.out.println("SENHA VÁLIDA");
		else
			System.out.println("SENHA INVÁLIDA");

		sc.close();
	}

}
