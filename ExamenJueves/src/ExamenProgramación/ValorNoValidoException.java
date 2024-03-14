package ExamenProgramación;

public class ValorNoValidoException extends Exception {

	@Override
	public String getMessage() {
		return "No se pueden meter valores negativos o inferiores a la hora actual";
	}
}
