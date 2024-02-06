package Ejercicios_5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7_5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String codigo1 = "";
		Random generador = new Random();

		int codigo = generador.nextInt(1000, 10000);

		System.out.println(codigo);
		for (int i = 0; i < 4; i++) {
			System.out.println("Introduce una cifra");
			codigo1 += scanner.nextLine();
		}

		if (Integer.parseInt(codigo1) == codigo) {
			System.out.println("Has acertado");

		} else {

			System.out.println("Has fallado");

		}
	}
}
