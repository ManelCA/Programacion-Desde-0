package Ejercicio7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Eurocoin {
	public static void main(String[] args) {

		String moneda = "";
		int valor = 0;
		String posicion = "";

		ArrayList<Moneda> listaMonedas = new ArrayList<Moneda>();
		ArrayList<Integer> listaCentimos = new ArrayList<Integer>(Arrays.asList(1, 2, 5, 10, 25, 50));

		Random random = new Random();

		for (int i = 0; i < 6; i++) {

			if (random.nextInt(0, 2) == 0) {
				moneda = "Céntimo";

			} else {
				moneda = "Euro";

			}

			if (moneda.equals("Euro")) {
				valor = random.nextInt(1, 3);
			} else {
				valor = listaCentimos.get(random.nextInt(0, listaCentimos.size()));

			}

			if (random.nextInt(0, 2) == 0) {
				posicion = "Cara";

			} else {
				posicion = "Cruz";

			}

			listaMonedas.add(new Moneda(moneda, valor, posicion));
		}

//		for (int i = 0; i < listaMonedas.size(); i++) {
//
//			System.out.println(listaMonedas.get(i));
//
//		}
		
		for (Moneda moneda1 : listaMonedas) {
			System.out.println(moneda1);
		}
	}
}
