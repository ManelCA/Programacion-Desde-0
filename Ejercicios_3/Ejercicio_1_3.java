package Ejercicios_3;

import java.util.Scanner;

/**
 * 
 * 
 * 
 * 
 * @author manuelca
 * 
 */

public class Ejercicio_1_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese un número");
		double numero1 = scanner.nextDouble();

		System.out.println("Ingrese otro número");
		double numero2 = scanner.nextDouble();

		float resultado = (float) (numero1 * numero2);

		System.out.println("El primer número que ha ingresado es: " + numero1);
		System.out.println("El segundo número que ha ingresado es: " + numero2);
		System.out.println("Y este es el resultado de la multiplicación: " + resultado);

	}
}
