package Ejercicios_2;

import java.util.Scanner;

public class Ejercicio_7_2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese texto aquí:");
		String variable1 = scanner.next();

		System.out.println("Ingrese un carácter aquí:");
		char variable2 = scanner.next().charAt(0);

		System.out.println("------------------------------------------------------------------------");
		System.out.println("Los datos que has introducido son estos: " + variable1 + ", " + variable2);

	}
}
