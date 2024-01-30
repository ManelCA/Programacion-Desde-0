package Ejercicios_3;

import java.util.Scanner;

/**
 * 
 * 
 * 
 * 
 * @author manuelca
 *
 */

/*
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 * 
 */

public class Ejercicio_5_3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el importe de su factura: ");
		double factura = scanner.nextDouble();

		double resultado = (factura * 21) / 100;

		double resultado1 = factura - resultado;

		System.out.println("El resultado de su factura sin IVA es este: " + resultado1);

	}
}
