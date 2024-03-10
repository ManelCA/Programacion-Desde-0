package Excepciones1;

public class Mostrar {
	public static void main(String[] args) {

		Gato gato = new Gato(Sexo.MACHO);
		Gato gato1 = new Gato(Sexo.MACHO);

		try {
			Gato cria = gato.apareaCon(gato1);
		} catch (PedoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
