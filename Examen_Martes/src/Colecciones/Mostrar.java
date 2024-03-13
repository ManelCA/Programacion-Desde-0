package Colecciones;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Mostrar {
	public static void main(String[] args) {

		int opcion;
		String numeroVuelo = "";
		String companhia = "";
		String destino = "";

		Scanner scanner = new Scanner(System.in);
		ArrayDeque<Vuelos> vuelos = new ArrayDeque<Vuelos>();

		while (true) {
			System.out.println("---------MENU------------");
			System.out.println("   1. Añadir vuelo ");
			System.out.println("   2. Asignar despegue ");
			System.out.println("   3. Salir");
			System.out.println("--Seleccione una opción--");

			opcion = scanner.nextInt();

			if (opcion == 1) {
				System.out.println("Ingrese el vuelo: ");
				numeroVuelo = scanner.next();
				System.out.println("Compañia: ");
				companhia = scanner.next();
				System.out.println("Destino: ");
				destino = scanner.next();

				if (ComprobarVuelo(numeroVuelo)) {
					vuelos.add(new Vuelos(numeroVuelo, companhia, destino, LocalDateTime.now()));
					System.out.println("Datos vuelo: " + numeroVuelo + " " + companhia + " " + destino + " "
							+ LocalDateTime.now());
				} else {
					System.out.println("Valor incorrecto");
				}

			}

			try {
				if (opcion == 2) {
					System.out.println(vuelos.getFirst().toString());
					System.out.println("¿Despegue correcto? presiona [S-Sí] o [N-No]");
					String respuesta = scanner.next();

					if (respuesta.equals("S")) {
						System.out.println("El vuelo despegó");
						vuelos.pop();

					} else if (respuesta.equals("N")) {
						System.out.println("No se despega");

					} else {
						System.out.println(
								"Chaval es sencillo S de Sí y N de No espabila que no te cagas mientras respiras de milagro");
					}
				}
			} catch (NoSuchElementException e) {
				System.out.println("No hay vuelos disponibles");
			}

			if (opcion == 3) {
				System.out.println("Saliendo del programa...");
				break;
			}

			if (opcion > 3 && opcion < 0) {
				System.out.println("Ingrese un número válido");
				return;
			}
		}

		scanner.close();
	}

	public static boolean ComprobarVuelo(String numeroVuelo) {

		if (numeroVuelo.length() == 7) {
			for (int i = 0; i < 7; i++) {
				if (Character.isAlphabetic(numeroVuelo.charAt(i)) && i <= 2) {

				} else if (!Character.isAlphabetic(numeroVuelo.charAt(i)) && i <= 2) {
					System.out.println("Letras Incorrectas");
					return false;
				}

				if (Character.isDigit(numeroVuelo.charAt(i)) && i > 2) {

				} else if (!Character.isDigit(numeroVuelo.charAt(i)) && i > 2) {
					System.out.println("Números Incorrectas");
					return false;
				}
			}

		} else {

			return false;
		}

		return true;
	}

}
