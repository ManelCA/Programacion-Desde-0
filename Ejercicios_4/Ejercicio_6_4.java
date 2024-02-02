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

public class Ejercicio_6_4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Este programa es para hacer la media");
		System.out.println("------------------------------------");
		System.out.println("Ingrese la primera nota ");
		double nota1 = scanner.nextDouble();

		System.out.println("Ingrese la segunda nota");
		double nota2 = scanner.nextDouble();

		System.out.println("Ingrese la tercera nota");
		double nota3 = scanner.nextDouble();

		double resultado = (nota1 + nota2 + nota3) / 3;

		if (resultado < 5 && resultado >= 0) {

			System.out.println("Tu nota es un INSUFICIENTE " + (int) (resultado));

		} else if (resultado >= 5 && resultado < 6) {

			System.out.println("Tu nota es un SUFICIENTE " + (int) (resultado));

		} else if (resultado >= 6 && resultado < 7) {

			System.out.println("Tu nota es un BIEN " + (int) (resultado));

		} else if (resultado >= 7 && resultado <= 8) {

			System.out.println("Tu nota es un NOTABLE " + (int) (resultado));

		} else if (resultado >= 9 && resultado <= 10) {

			System.out.println("Tu nota es un SOBRESALIENTE " + (int) (resultado));
		}
	}
}