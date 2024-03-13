package ExamenProgramación;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Control {

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

	public void menuOpciones(int opcion, LinkedList<Vuelo> listaVuelos) {
		LinkedList<Vuelo> vuelo2 = listaVuelos;

		switch (opcion) {
		case 1: {
			System.out.println("Aquí tienes la lista de vuelos ordenada" + "\n");
			Collections.sort(vuelo2, new Comparator<Vuelo>() {

				@Override
				public int compare(Vuelo o1, Vuelo o2) {
					if (o1.getFechasalida().isBefore(LocalDateTime.now().plusHours(24))
							&& o2.getFechasalida().isBefore(LocalDateTime.now().plusHours(24))) {
						return o1.getCodigoVuelo().compareTo(o2.getCodigoVuelo());
					}
					return 0;
				}
			});

			Iterator<Vuelo> iterator = vuelo2.iterator();
			while (iterator.hasNext()) {

				if (ChronoUnit.HOURS.between(iterator.next().getFechallegada(),
						iterator.next().getFechasalida()) < 24) {
					System.out.println(iterator.next());
				}
			}

			break;
		}
		case 2: {
			System.out.println("Ingrese el código del vuelo: ");

			System.out.println("Ingrese el origen: ");

			System.out.println("Ingrese el destino: ");

			System.out.println("Hora de salida " + LocalDateTime.now());

			System.out.println("Hora de llegada ");
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
