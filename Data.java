package Ex2;

import java.time.LocalDate;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	Data ( int d, int m, int a){
		this.dia=d;
		this.mes=m;
		this.ano=a;
	}
	
	Data () {
//		this.dia=19;
//		this.mes=9;
//		this.ano=2025;

		// usando a classe LocalDate 
		LocalDate hoje = LocalDate.now();
		this.dia=hoje.getDayOfMonth();
		this.mes=hoje.getMonthValue();
		this.ano=hoje.getYear();		
	}
	
	public void displayData() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
	}
	
	public static void main(String[] args) {
		//com parametros
		Data d1 = new Data(10,2,2024);
		d1.displayData();
		
		// sem parametros
		Data d2 = new Data();
		d2.displayData();
	}

}
