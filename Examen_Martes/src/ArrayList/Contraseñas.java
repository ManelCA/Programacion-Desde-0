package ArrayList;

import java.util.HashMap;
import java.util.Scanner;

public class Contraseñas {
	public static void main(String[] args) {

//Creamos las variables de nuestro programa 		
		String usuario = "";
		String contraseña = "";
		int contador = 0;

//Creamos el scanenr y hash map para saber cuál es el correcto 
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> nombres = new HashMap<String, String>();
		nombres.put("Salomé", "Pancho");

		while (contador < 3) {
			System.out.println("Introduzca usuario");
			usuario = scanner.next();

			if (nombres.containsValue(usuario)) {
				System.out.println("El usuario es correcto");
				System.out.println("----------------------");

				System.out.println("Ahora introduzca la contraseña");
				contraseña = scanner.next();
				if (nombres.containsKey(contraseña)) {

					System.out.println("La contraseña es correcta");
					System.out.println("Has logrado acceder al área restringida de foto pies de enanos, enhorabuena campeón");
					break;
				} else {
					System.out.println("Contraseña incorrecta");
					contador++;
				}
			} else {
				System.out.println("El usuario es incorrecto");
				contador++;
			}

		}
		scanner.close();
	}
}
