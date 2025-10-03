
public class ValidadorPlaca {
	
	private String placa;
	private int codigo=0; 
	
	ValidadorPlaca (String plc){
		this.placa = plc;
	}

	public String getPlaca() {
		return placa;
	}

	public boolean validar() {
		//regra 1
		if (this.placa.length()!= 7) {
			this.codigo = 1; //erro tamanho
			return (false);
		}

		for (int i=0;i<7;i++) {
			//regra2 - Posições 0, 1, 2 devem ser letras			
			if ((i<3) && (Character.isDigit(this.placa.charAt(i))) ) {
				this.codigo = 2; //erro posições 0,1,2
				return (false);
			}
			
			//regra2 - Posição 3 deve ser um número
			if ((i==3) && (!Character.isDigit(this.placa.charAt(i))) ) {
				this.codigo = 3; //erro posições 3
				return (false);				
			}
			
			//regra2 - Posição 4 deve ser uma letra.
			if ((i==4) && (Character.isDigit(this.placa.charAt(i))) ) {
				this.codigo = 4; //erro posições 4
				return (false);				
			}
			
			//regra2 - Posições 5, 6 devem ser números
			if ((i>4) && (!Character.isDigit(this.placa.charAt(i))) ) {
				this.codigo = 5; //erro posições 5, 6
				return (false);				
			}

		}
		return(true);
	}
	
	public void informaValidade() {
		if (this.validar())
			System.out.println("Placa " + this.getPlaca() + ": VALIDA");
		else
			System.out.println("Placa " + this.getPlaca() + ": INVALIDA - " + this.getCodigoErro());
	}
	
	public String getCodigoErro() {
		switch (this.codigo) {
			case 0: return("Sem Erro");
			case 1: return("Erro de tamanho");
			case 2: return("Erro posições 0,1,2");
			case 3: return("Erro posição 3");
			case 4: return("Erro posição 4");
			case 5: return("Erro posição 5");
		}
		return("sem Erro");
	}
	
	public static void main(String[] args) {
		
		ValidadorPlaca placa1 = new ValidadorPlaca("ABC4E67");
		placa1.informaValidade();

		ValidadorPlaca placa2 = new ValidadorPlaca("ABC4E678");
		placa2.informaValidade();
		
		ValidadorPlaca placa3 = new ValidadorPlaca("ABCDE67");
		placa3.informaValidade();

		ValidadorPlaca placa4 = new ValidadorPlaca("ABC4567");
		placa4.informaValidade();
		
		ValidadorPlaca placa5 = new ValidadorPlaca("1BC4E67");
		placa5.informaValidade();
	},

}
