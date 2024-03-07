import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConverterDataHoraTexto {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html


		LocalDate d04 = LocalDate.parse("2024-03-06");
		LocalDateTime d05 = LocalDateTime.parse("2024-03-06T01:30:26");
		Instant d06 = Instant.parse("2024-03-06T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		// formatando a data do d04 com traço para o padrão com barra
		System.out.println("d04: " + d04.format(fmt1));
	}

}
