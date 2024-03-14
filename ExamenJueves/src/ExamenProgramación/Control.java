package ExamenProgramación;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Control {

	// Creamos la variable
	private String codigoVuelo, origen, destino;
	private LocalDateTime fechasalida, fechallegada;
	private String borrar;
	private int minutos = 0;

	// Creamos el scanner fuera de los métodos para en todos los métodos
	Scanner scanner = new Scanner(System.in);

	// Creamos el método menú
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

	/*
	 * Creamos el metodo de las opciones del menu para usar el metodo de arriba con
	 * el de abajo
	 */

	public void menuOpciones(int opcion, LinkedList<Vuelo> listaVuelos)
			throws FechaHoraSalidaNoValidaException, ValorNoValidoException {

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
			Iterator<Vuelo> iterator = listaVuelos.iterator();

			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			System.out.println("Ingrese el código del vuelo que quiere eliminar");
			borrar = scanner.next();

			for (int i = 0; i < listaVuelos.size(); i++) {
				listaVuelos.get(i).getCodigoVuelo().equals(borrar);
			}
		}

			break;

		case 4: {
			System.out.println("El vuelo salió" + listaVuelos.pop());

			break;
		}
		case 5: {

			for (int i = 0; i < listaVuelos.size(); i++) {
				if (listaVuelos.get(i).getFechasalida().isBefore(LocalDateTime.now())) {
					listaVuelos.remove(i);

				}
			}
			break;
		}
		case 6: {
			while (minutos <= 0) {
				System.out.println("Introduce cuantos minutos quiere cambiar YEEEEEEEEEEEEPA");
				minutos = scanner.nextInt();
				System.out.println("Ingrese el código del vuelo que quiere cambiar");
				borrar = scanner.next();
				for (int i = 0; i < listaVuelos.size(); i++) {
					if (listaVuelos.get(i).getCodigoVuelo().equals(borrar)) {
						listaVuelos.get(i).setFechallegada(listaVuelos.get(i).getFechallegada().plusMinutes(minutos));
						listaVuelos.get(i).setFechasalida(listaVuelos.get(i).getFechasalida().plusMinutes(minutos));
					}
				}
				if (minutos <= 0) {
					throw new ValorNoValidoException();
				} else {

				}
			}
			minutos = 0;
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
