package ex1;

import java.util.Scanner;

public class ValidadorSenha {

    private String senha;

    // Setter para a senha
    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Método de validação de segurança da senha
    public boolean verificarSeguranca() {
        // 1. Tamanho mínimo de 8 caracteres
        if (senha.length() < 8) {
            return false;
        }

        boolean temMaiuscula = false;
        boolean temNumero = false;
        boolean temCaractereEspecial = false;

        // Itera sobre a string para verificar os requisitos
        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            // Paa as checagens vamos utilizar a classe Wrapper "Character"
            // e seus métodos isUpperCase(), isDigit(), isLetterOrDigit()
            // 2. Pelo menos uma letra maiúscula - Usand 
            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }

            // 3. Pelo menos um número
            if (Character.isDigit(c)) {
                temNumero = true;
            }

            // 4. Pelo menos um caractere especial
            // Checa se o caractere não é uma letra ou um número
            if (!Character.isLetterOrDigit(c)) {
                temCaractereEspecial = true;
            }
        }

        // Retorna true somente se todos os requisitos forem atendidos
        return temMaiuscula && temNumero && temCaractereEspecial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidadorSenha validador = new ValidadorSenha();

        System.out.println("--- Validador de Senha Segura ---");
        System.out.println("Sua senha deve conter:");
        System.out.println("- Mínimo de 8 caracteres");
        System.out.println("- Pelo menos uma letra maiúscula");
        System.out.println("- Pelo menos um número");
        System.out.println("- Pelo menos um caractere especial");

        // ficamos no loop até digitar uma senha válida
        while (true) {
            System.out.print("\nDigite a senha: ");
            String senhaDigitada = scanner.nextLine();
            validador.setSenha(senhaDigitada);

            if (validador.verificarSeguranca()) {
                System.out.println("Senha válida.");
                break;
            } else {
                System.out.println("Senha inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
