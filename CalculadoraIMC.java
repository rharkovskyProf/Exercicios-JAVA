import java.util.Scanner;

public class CalculadoraIMC {
	
	public double calcularIMC(double pesoKG, double alturaM) {
		return (pesoKG /(alturaM*alturaM));
		//return (pesoKG/math.pow(alturaM,2)
	}
	
	public String classificar(double imc) {
		if (imc <=18.5) 
			return ("Abaixo do peso");
		else if (imc <=24.9)
			return ("Peso normal");
		else if (imc <=29.9)
			return ("Sobrepeso");		
		else if (imc <=34.9)
			return ("Obesidade Grau I");	
		else if (imc <=39.9)
			return ("Obesidade Grau II (Severa)");
		else 
			return ("Obesidade Grau III (Mórbida)");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CalculadoraIMC calc = new CalculadoraIMC();
		Double peso;
		Double altura;
		String pesoStr;
		String alturaStr;		
		
		double imc;
		
		while (true) {
			System.out.print("Entre com seu peso (Kg): ");
			pesoStr = sc.nextLine();
			peso=Double.parseDouble(pesoStr);

			if (peso == 0)
				break;
			
			System.out.print("Entre com sua altura (m): ");	
			alturaStr = sc.nextLine();
			altura=Double.parseDouble(alturaStr);
			
			imc= calc.calcularIMC(peso, altura);
			
			System.out.println("IMC: " + imc);
			System.out.println("Classificação: " + calc.classificar(imc));
		}
		
		sc.close();

	}

}
