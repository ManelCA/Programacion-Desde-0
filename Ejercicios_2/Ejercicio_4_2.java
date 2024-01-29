package Ejercicios_2;

import java.util.Scanner;

public class Ejercicio_4_2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese una cantidad");

		double euros = scanner.nextDouble();
		double pesetas = 166.386;
		
		System.out.println("Estos euros " + euros);
		System.out.println("Son " + (float)(euros * pesetas) + " pesetas");

	}
}
