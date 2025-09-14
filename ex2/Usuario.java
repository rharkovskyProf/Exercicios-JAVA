package ex2;

import java.util.Scanner;

public class Usuario {
	private String nome;
	private String email;
	private String cpf;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public boolean validarEmail() {
		return this.email != null && this.email.contains("@");
	}
	
    public boolean validarCpf() {
        // Verifica se o CPF é nulo ou se não tem 11 dígitos
        if (this.cpf == null || this.cpf.length() != 11) {
            return false;
        }

        // Itera sobre a string para verificar se cada caractere é um dígito
        for (int i = 0; i < this.cpf.length(); i++) {
            if (!Character.isDigit(this.cpf.charAt(i))) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario novoUsuario = new Usuario();

        System.out.println("--- Formulário de Cadastro ---");
        System.out.print("Digite seu nome: ");
        novoUsuario.setNome(scanner.nextLine());

        System.out.print("Digite seu e-mail: ");
        novoUsuario.setEmail(scanner.nextLine());

        System.out.print("Digite seu CPF (apenas números): ");
        novoUsuario.setCpf(scanner.nextLine());
        
        if (novoUsuario.validarEmail())
        	if (novoUsuario.validarCpf())
        		System.out.println("Cadastro Realizado");
        	else
        		System.out.println("Cadastro Nao realizado: Erro de CPF");
        else
        	System.out.println("Cadastro Nao realizado: Erro de email");

	}

}
