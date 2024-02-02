package Ejercicios_4;

import java.util.Scanner;

public class Ejercicio_1_4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese un día de la semana: ");

		int dia = scanner.nextInt();

		String nombredia;

		switch (dia) {
		case 1:
			nombredia = "Lunes";
			System.out.println("El " + nombredia + " tenemos Bases de Datos");
			break;
		case 2:
			nombredia = "Martes";
			System.out.println("El " + nombredia + " tenemos FOL");
			break;
		case 3:
			nombredia = "Miércoles";
			System.out.println("El " + nombredia + " tenemos FOL");
			break;
		case 4:
			nombredia = "Jueves";
			System.out.println("El " + nombredia + " tenemos Bases de Datos");
			break;
		case 5:
			nombredia = "Viernes";
			System.out.println("El " + nombredia + " tenemos Contornos");
			break;
		case 6:
			nombredia = "Sábado";
			System.out.println("El " + nombredia + " no tenemos clase mi rey");
			break;
		case 7:
			nombredia = "Domingo";
			System.out.println("El " + nombredia + " mi rey tampoco hay clase");
			break;

		default:
			System.out.println("No existe ese día de la semana espabilao'");

		}
	}
}
