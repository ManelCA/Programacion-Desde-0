package Ejercicios_5;

import java.util.Scanner;

public class Ejercicio9_5 {
	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		System.out.println("Introduce un numero");
		int numero = sn.nextInt();

		long cifras = cuentaCifras(numero);

		System.out.println("Numero de cifras: " + cifras);

	}

	public static int cuentaCifras(int num) {

		int contador = 0;

		if (num == 0) {
			contador = 1;
		} else {

			for (int i = Math.abs(num); i > 0; i /= 100) {
				contador++;
			}
		}

		return contador;

	}
}
