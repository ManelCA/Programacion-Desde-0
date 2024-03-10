package Excepciones;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int numero = 0;
		int contador = 0;
		int numeroMax = 0;
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> arraynumeros = new ArrayList<Integer>();
		arraynumeros.add(numero);

		while (contador < 6) {
			try {
				System.out.println("Ingrese un número");
				numero = scanner.nextInt();

				if (numero > numeroMax) {
					numeroMax = numero;
				}

				contador++;

			} catch (InputMismatchException e) {

				System.out.println("Error: Por favor, ingresa un número entero válido.");
				scanner.nextLine();

			}
		}

		System.out.println("El número más grande es tururuurururur *música tensa* " + numeroMax + " *aplausos*");

		scanner.close();
	}
}
