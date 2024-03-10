package Ejercicio7;

public class Moneda {

	private String moneda;
	private int valor;
	private String posicion;

	protected Moneda(String moneda, int valor, String posicion) {
		this.moneda = moneda;
		this.valor = valor;
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return this.valor + " " + this.moneda + " - " + this.posicion;
	}

}
