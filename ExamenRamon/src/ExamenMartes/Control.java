package ExamenMartes;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Control {

	private String codigoVuelo, origen, destino;
	private LocalDateTime fechasalida, fechallegada;

	public void menu() {

		System.out.println("---Menu---");
		System.out.println("1.-Mostrar cola de vuelos ordenada");
		System.out.println("2.-Añadir un nuevo vuelo a la cola");
		System.out.println("3.-Elimar un vuelo a la cola");
		System.out.println("4.-Dar salida a un vuelo");
		System.out.println("5.-Actualizar lista de vuelos");
		System.out.println("6.-Modificar horarios de un vuelo");
		System.out.println("7.-Salir");

	}

	public void menuOpciones(int opcion, LinkedList<Vuelo> listaVuelos) throws FechaHoraSalidaNoValidaException {
		Scanner scanner = new Scanner(System.in);
		Collections.sort(listaVuelos, new Comparator<Vuelo>() {

			@Override
			public int compare(Vuelo o1, Vuelo o2) {
				return o1.getCodigoVuelo().compareTo(o2.getCodigoVuelo());
			}
		});

		switch (opcion) {
		case 1: {
			System.out.println("Aquí tienes la lista de vuelos ordenada" + "\n");
//			Iterator<Vuelo> iterator = vuelo2.iterator();

			for (Vuelo vuelo : listaVuelos) {
				if (ChronoUnit.HOURS.between(vuelo.getFechasalida(), vuelo.getFechallegada()) <= 24) {
					System.out.println(vuelo);
				}
			}

			break;
		}
		case 2: {
			System.out.println("Ingrese el código del vuelo: ");
			codigoVuelo = scanner.next();
			System.out.println("Ingrese el origen: ");
			origen = scanner.next();
			System.out.println("Ingrese el destino: ");
			destino = scanner.next();
			System.out.println("Hora de salida ");
			fechasalida = LocalDateTime.parse(scanner.next());

			if (fechasalida.isBefore(LocalDateTime.now())) {
				throw new FechaHoraSalidaNoValidaException();
			}

			System.out.println("Hora de llegada ");
			fechallegada = LocalDateTime.parse(scanner.next());

			listaVuelos.add(new Vuelo(codigoVuelo, origen, destino, fechasalida, fechallegada));

			break;
		}
		case 3: {
			System.out.println("Ingrese el código del vuelo que quiere eliminar");
			listaVuelos.pop();
			break;
		}
		case 4: {

			break;
		}
		case 5: {

			break;
		}
		case 6: {

			break;
		}
		case 7: {
			System.out.println("Saliendo del programa...");
			return;
		}

		default: {
			System.out.println("No existe el número que ha ingresado, vuelve a intentarlo");
			return;
		}
		}
	}
}
