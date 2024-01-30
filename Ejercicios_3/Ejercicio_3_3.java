package Ejercicios_3;

import java.util.Scanner;

/**
 * 
 * 
 * 
 * @author manuelca
 *
 */

// Escribe un programa que calcule el área de un rectángulo

public class Ejercicio_3_3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce la base: ");
		double base = scanner.nextDouble();

		System.out.println("Introduce la altura");
		double altura = scanner.nextDouble();

		double resultado = base * altura;

		System.out.println("El área del rectangulo es: " + resultado + " m2");
	}
}
