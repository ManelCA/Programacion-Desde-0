package Excepciones2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class RandomException {
	public static void main(String[] args) throws Exception {
		
		Random random = new Random();
		Exception excepcion = null;

		ArrayList<Exception> errores = new ArrayList<Exception>();
		errores.add(new NumberFormatException());
		errores.add(new IOException());
		errores.add(new FileNotFoundException());
		errores.add(new IndexOutOfBoundsException());
		errores.add(new ArithmeticException());

		excepcion = errores.get(random.nextInt(0 , errores.size()));
		
		throw excepcion; 
		
		
	}
}
