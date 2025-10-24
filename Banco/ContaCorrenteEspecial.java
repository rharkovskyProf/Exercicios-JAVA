package Banco;

public class ContaCorrenteEspecial  extends Conta{
	
	private double limite;
	
	ContaCorrenteEspecial (double lim, int ag, int numCC ) {
		super(ag, numCC);
		this.limite = lim;
	}
	
	public double getLimite() {
		return limite;
	}

	@Override
	public boolean saca (double valor) {
		double novoSaldo = this.saldo - valor;
		if(novoSaldo < this.limite)
			return false;

		this.saldo = novoSaldo;
		return true;
	}
	@Override
	public void exibeCC() {
		System.out.println("Agencia: "+ this.agencia);
		System.out.println("Conta: " + this.numero);
		System.out.println("Conta: " + this.limite);
		System.out.println("Saldo: " + this.saldo);
	}
	public static void main(String[] args) {

		ContaCorrenteEspecial cc1 = new ContaCorrenteEspecial(10000.0, 1, 100);
		cc1.exibeCC();
		cc1.deposita(500);
		cc1.exibeCC();

	}

}
