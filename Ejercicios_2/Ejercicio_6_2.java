package Ejercicios_2;

import java.util.Scanner;

public class Ejercicio_6_2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el importe de su factura");
		System.out.println("--------------------------------");

		double factura = scanner.nextDouble();
		double iva1 = (factura * 21) / 100;
		double resultado = factura - iva1;

		System.out.println("El importe sin IVA es este " + factura);
		System.out.println("El importe con IVA es este " + (float) resultado);

	}
}
