package Banco;

public class ContaCorrenteNormal extends Conta{
	ContaCorrenteNormal(int ag, int numCC) {
		super(ag, numCC);
	}

	public static void main(String[] args) {
		
		ContaCorrenteNormal cc2 = new ContaCorrenteNormal(1, 200);
		cc2.exibeCC();
		cc2.deposita(400);
		cc2.exibeCC();
	}

}
