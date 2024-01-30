package Ejercicios_3;

import java.util.Scanner;

/**
 * 
 * 
 * 
 * @author manuelca
 *
 */

public class Ejercicio_2_3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese un número: ");
		double numero1 = scanner.nextDouble();

		System.out.println("Ingrese otro número: ");
		double numero2 = scanner.nextDouble();

		System.out.println("Este es el valor que has ingresado: " + numero1);
		System.out.println("Este es el segundo valor que has ingresado: " + numero2);
		System.out.println("-------------------------------------------------------");
		System.out.println("La solución a la suma es: " + (float) (numero1 + numero2));
		System.out.println("La solución a la resta es: " + (float) (numero1 - numero2));
		System.out.println("La solución a la multiplicación es: " + (float) (numero1 * numero2));
		System.out.println("La solución a la división es: " + (float) (numero1 / numero2));
	}
}
