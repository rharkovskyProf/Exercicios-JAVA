package Banco;

public abstract class Conta {

	protected int agencia;
	protected int numero;
	protected double saldo = 0;


	Conta(int ag, int numcc){
		this.agencia = ag;
		this.numero = numcc;
	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca (double valor) {
		double novoSaldo = saldo - valor;
		if(novoSaldo < 0)
			return false;

		this.saldo = novoSaldo;
		return true;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void exibeCC() {
		System.out.println("Agencia: "+ this.agencia);
		System.out.println("Conta: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
	}

}

