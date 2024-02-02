package Ejercicios_4;

import java.util.Scanner;

public class Ejercicio_2_4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese un día: ");
		int dia = scanner.nextInt();

		if (dia == 1) {
			System.out.println("Es Lunes, Jodienda mesopotamica");
		} else if (dia == 2) {
			System.out.println("Es Martes, falta poco para navidad");
		} else if (dia == 3) {
			System.out.println("Es Miércoles, falta menos para pascuas");
		} else if (dia == 4) {
			System.out.println("Es Jueves, falta poco para el viernes");
		} else if (dia == 5) {
			System.out.println("CHAVALES HOY ES VIERNEEEEEEEEES");
		} else if (dia == 6) {
			System.out.println("Sábado, sabadete");
		} else if (dia == 7) {
			System.out.println("Domingo de pascuas, ve a la iglesia pecador");
		} else if (dia <= 0 || dia > 7) {
			System.out.println("Ese día no existe, en que planeta vives?");
		}
	}
}
