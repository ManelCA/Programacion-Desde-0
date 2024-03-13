package Repaso;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Fechas {
	public static void main(String[] args) {

		// Presenta fecha actual
		LocalDate actual = LocalDate.now();
		System.out.println("La fecha actual es: " + actual);

		// Presentar fecha y hora actual
		LocalDateTime actual1 = LocalDateTime.now();
		System.out.println("La fecha y hora actual son: " + actual1);

		// Presentar fecha y hora en Europa/París
		System.out.println("Fecha de una zona en concreto: " + ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Paris")));
	}
}
