package Ejercicios_3;

import java.util.Scanner;

/**
 * 
 * 
 * 
 * @author manuelca
 *
 */

//Escribe un programa que calcule el área de un triángulo.

public class Ejercicio_4_3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe la base: ");
		double base = scanner.nextDouble();

		System.out.println("Escribe la altura: ");
		double altura = scanner.nextDouble();

		double resultado = (base * altura) / 2;

		System.out.println("El área de un triangulo es " + resultado);

	}
}
