package Ejercicios_4;

import java.util.Scanner;

/**
 * 
 * 
 * 
 * 
 * @author manuelca
 *
 */

public class Ejercicio_7_4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese la primera variable");
		double a = scanner.nextDouble();

		System.out.println("Ingrese la segunda variable");
		double b = scanner.nextDouble();

		System.out.println("Ingrese la tercera variable");
		double c = scanner.nextDouble();

		double resultado = b * b - 4 * a * c;

		if (resultado < 0) {
			System.out.println("El resultado no existe");
		} else {

			resultado = (Math.sqrt(b * b - 4 * a * c));

			double resultado1 = ((-b) - resultado) / 2 * a;
			double resultado2 = ((-b) + resultado) / 2 * a;

			System.out.println("El resultado con el - es " + resultado1);
			System.out.println("El resultado con el + es " + resultado2);
		}
	}
}
