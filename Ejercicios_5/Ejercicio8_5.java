package Ejercicios_5;

import java.util.Scanner;

public class Ejercicio8_5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce un número: ");

		int resultado = 0;
		int resultado1 = 0;
		int resultado2 = 0;
		int resultado3 = 0;
		int resultado4 = 0;
		int resultado5 = 0;
		int resultado6 = 0;
		int resultado7 = 0;
		int resultado8 = 0;

		int multiplo = scanner.nextInt();

		for (int i = multiplo; i < 10; i++) {

			resultado = multiplo * 1;
			resultado1 = multiplo * 2;
			resultado2 = multiplo * 3;
			resultado3 = multiplo * 4;
			resultado4 = multiplo * 5;
			resultado5 = multiplo * 6;
			resultado6 = multiplo * 7;
			resultado7 = multiplo * 8;
			resultado8 = multiplo * 9;
		}

		System.out.println("Multiplicar por 1 = " + resultado);
		System.out.println("Multiplicar por 2 = " + resultado1);
		System.out.println("Multiplicar por 3 = " + resultado2);
		System.out.println("Multiplicar por 4 = " + resultado3);
		System.out.println("Multiplicar por 5 = " + resultado4);
		System.out.println("Multiplicar por 6 = " + resultado5);
		System.out.println("Multiplicar por 7 = " + resultado6);
		System.out.println("Multiplicar por 8 = " + resultado7);
		System.out.println("Multiplicar por 9 = " + resultado8);
	}
}
