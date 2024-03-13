package ExamenMartes;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Scanner;

public class GestAirport {
	public static void main(String[] args) throws FechaHoraSalidaNoValidaException {
		// Creamos las variables
		int opcion = 0;

		// Creamos las variables de los vuelos
		String codigoVuelo, origen, destino;
		LocalDateTime fechasalida, fechallegada;

		Scanner scanner = new Scanner(System.in);
		
		LinkedList<Vuelo> colaVuelos = new LinkedList<Vuelo>();
		
		colaVuelos.add(new Vuelo("ABC1234", "Madrid", "Madagascar", LocalDateTime.of(2024, 5, 12, 12, 00),
				LocalDateTime.of(2024, 8, 13, 13, 15)));
		colaVuelos.add(new Vuelo("ABC1456", "Colombia", "España", LocalDateTime.of(2024, 7, 7, 22, 15),
				LocalDateTime.of(2024, 7, 8, 11, 30)));
		colaVuelos.add(new Vuelo("ABC1678", "Filipinas", "Estados Unidos", LocalDateTime.of(2024, 12, 31, 12, 00),
				LocalDateTime.of(2025, 1, 1, 10, 15)));
		colaVuelos.add(new Vuelo("ABC1425", "Holanda", "España", LocalDateTime.of(2024, 8, 12, 12, 00),
				LocalDateTime.of(2024, 8, 12, 22, 15)));
		colaVuelos.add(new Vuelo("ABC7532", "Valencia", "Puerto Rico", LocalDateTime.of(2024, 05, 12, 12, 00),
				LocalDateTime.of(2024, 05, 13, 13, 15)));

		Control control = new Control();

		while (opcion != 7) {
			control.menu();
			opcion = scanner.nextInt();
			control.menuOpciones(opcion, colaVuelos);

		}

	}

}
