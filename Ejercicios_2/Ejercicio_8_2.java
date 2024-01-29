package Ejercicios_2;

import java.util.Scanner;

public class Ejercicio_8_2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese una carácter: ");
		char variable = scanner.next().charAt(0);
		System.out.println("Ingrese otro carácter: ");
		char variable1 = scanner.next().charAt(0);
		System.out.println("Ingrese otro carácter: ");
		char variable2 = scanner.next().charAt(0);
		System.out.println("Ingrese otro carácter: ");
		char variable3 = scanner.next().charAt(0);
		System.out.println("Ingrese otro carácter: ");
		char variable4 = scanner.next().charAt(0);

		System.out.println("Este es el resultado de los 5 carácteres que has ingresado: " + variable + variable1
				+ variable2 + variable3 + variable4);
	}
}
