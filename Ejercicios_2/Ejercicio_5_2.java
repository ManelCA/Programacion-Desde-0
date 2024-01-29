package Ejercicios_2;

import java.util.Scanner;

public class Ejercicio_5_2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese cuantas pesetas quiere convertir");

		double euros = 0.0060;
		double pesetas = scanner.nextDouble();

		System.out.println("Con estas pesetas " + pesetas);
		System.out.println("Tienes estos euros " + (float) (pesetas * euros));
	}
}
