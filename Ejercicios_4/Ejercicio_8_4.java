package Ejercicios_4;

import java.util.Scanner;

//página 63

public class Ejercicio_8_4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese una hora");
		int hora = scanner.nextInt();

		System.out.println("Ingrese un minuto");
		int minuto = scanner.nextInt();

		if (hora > 24 || hora < 8) {
			System.out.println("No existe esa hora espabilao'");
		} else if (minuto > 60 || minuto < 0) {
			System.out.println("Ese minuto no existe espabilao'");
		} else if (hora <= 24 || hora > 8 && minuto <= 60 || minuto >= 0) {

			int resultado = hora * 60;
			int resultado1 = resultado * 60;
			int resultado2 = minuto * 60;

			System.out.println("Los segundos que faltan desde la hora y minuto que has puesto hasta medianoche son "
					+ resultado1 + resultado2);
		}
	}
}