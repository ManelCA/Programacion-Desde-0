package Ejercicios_4;

import java.util.Scanner;

public class Ejercicio_3_4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("En la ecuación: ax * b = 0");
		System.out.println("--------------------------");

		System.out.println("Ingrese un número para a");
		double a = scanner.nextDouble();

		System.out.println("Ingrese un número para b");
		double b = scanner.nextDouble();
		double resultado;

		if (a > 0 && b > 0) {
			resultado = a / b;
			System.out.println("El resultado de despejar la x: " + resultado);

		} else if (b == 0 || a == 0) {
			System.out.println("No tiene solución real");
		}
	}
}
