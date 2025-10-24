import java.text.DecimalFormat;

public class TesteClasseDecimalFormat {

	public static void main(String[] args) {
		double numero = 2500.50;
		String numeroFormatado = new DecimalFormat("#,##00.00").format(numero);
		System.out.println("Numero Original: " + numero);
		System.out.println("Numero formatado: " + numeroFormatado);

	}

}
