package ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class OrdenarNúmeros {
	public static void main(String[] args) {

		int numero;

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca 10 números melón");
			numero = scanner.nextInt();
			numeros.add(numero);
		}
		scanner.close();

		numeros.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});

		for (Integer integer : numeros) {
			System.out.println("Estos son los 10 números ordenados de menor a mayor " + integer);
		}
	}
}
