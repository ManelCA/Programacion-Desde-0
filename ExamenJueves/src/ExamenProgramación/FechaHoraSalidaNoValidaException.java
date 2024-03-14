package ExamenProgramación;

public class FechaHoraSalidaNoValidaException extends Exception {
	@Override
	public String getMessage() {
		return "No se puede viajar en el tiempo en esta compañia vete a rayner";
	}
}
