package Ramonchin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Mostrar {
	public static void main(String[] args) {

		ArrayList<Gatos> arrayGatos = new ArrayList<Gatos>();
		ArrayList<Integer> arrayNumero = new ArrayList<Integer>();

		// Añadir números a la lista
		arrayNumero.add(4);
		arrayNumero.add(1);
		arrayNumero.add(10);
		arrayNumero.add(7);
		arrayNumero.add(9);
		arrayNumero.add(2);
		arrayNumero.add(10);
		arrayNumero.add(19);
		arrayNumero.add(17);

		// Añadir gatos
		arrayGatos.add(new Gatos("Juancho", 70, "Pancho"));
		arrayGatos.add(new Gatos("Melón", 1900, "Sergio"));
		arrayGatos.add(new Gatos("AerJoder", 2500, "Yolanda"));

//		Iterator<Gatos> iterator = arrayGatos.iterator();
//
//		// Recorremos el array con el Iterator
//
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next().toString());
//		}

		// Hacemos el Collection para ordernar la lista
		// Creamos el compare to y el valueOf para pasar un String a Integer
		Collections.sort(arrayGatos, new Comparator<Gatos>() {

			@Override
			public int compare(Gatos o1, Gatos o2) {
				return Integer.valueOf(o2.getEdad()).compareTo(o1.getEdad());
			}
		});

		// Usamos el compare para ordenar los números de menor a mayor
		Collections.sort(arrayNumero, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		// Iterator para recorrer el arrayList de gatos
		Iterator<Gatos> iterator = arrayGatos.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Iterator para recorrer el arrayList de números
		Iterator<Integer> iterator1 = arrayNumero.iterator();

		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

	}
}
