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

public class Ejercicio_4_4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double t;
		double g = 9.81;
		System.out.println("El obje");
		System.out.println("Ingrese la altura a la que cae el objeto ");
		double altura = scanner.nextDouble();

		t = Math.sqrt((2 * altura) / g);

		System.out.println("Este es el tiempo que tarda en caer " + t);
	}
}
