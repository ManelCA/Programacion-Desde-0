package Ramonchin;

public class Gatos {

	private String nombre;
	private int edad;
	private String raza;

	public Gatos(String nombre, int edad, String raza) {
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected String getRaza() {
		return raza;
	}

	protected void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "La edad del gato es: " + this.edad + "\n" + "Su raza es: " + this.raza + "\n" + "Su nombre: "
				+ this.nombre + "\n";
	}

}
