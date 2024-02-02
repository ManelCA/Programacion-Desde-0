package Ejercicios_4;

import java.util.Scanner;

public class Ejercicio_5_4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Este programa es para hacer la media");

		System.out.println("Ingrese la primera nota ");
		double nota1 = scanner.nextDouble();

		System.out.println("Ingrese la segunda nota");
		double nota2 = scanner.nextDouble();

		System.out.println("Ingrese la tercera nota");
		double nota3 = scanner.nextDouble();

		double resultado = (nota1 + nota2 + nota3) / 3;		

		System.out.println("La media de tus tres notas es " + resultado);		

	}
}
