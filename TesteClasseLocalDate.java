import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TesteClasseLocalDate {

	private static String formatarData(LocalDate data) {
		return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
	public static void main(String[] args) {

		LocalDate data1, data2, data3;
		data1 = LocalDate.of(2000, 10, 23);
		data2 = LocalDate.now();
		data3 = data2.plusMonths(2);
		
		System.out.println("Data1 formatada: " + formatarData(data1));
		System.out.println("Data2 formatada: " + formatarData(data2));		
		System.out.println("Data3 formatada: " + formatarData(data3));		
	}

}
