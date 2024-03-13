package ExamenProgramación;

import java.time.LocalDateTime;

public class Vuelo {

	private String codigoVuelo, origen, destino;
	private LocalDateTime fechasalida, fechallegada;

	public Vuelo(String codigoVuelo, String origen, String destino, LocalDateTime fechasalida,
			LocalDateTime fechallegada) {
		this.codigoVuelo = codigoVuelo;
		this.origen = origen;
		this.destino = destino;
		this.fechasalida = fechasalida;
		this.fechallegada = fechallegada;
	}

	protected String getCodigoVuelo() {
		return codigoVuelo;
	}

	protected void setCodigoVuelo(String codigoVuelo) {
		this.codigoVuelo = codigoVuelo;
	}

	protected String getOrigen() {
		return origen;
	}

	protected void setOrigen(String origen) {
		this.origen = origen;
	}

	protected String getDestino() {
		return destino;
	}

	protected void setDestino(String destino) {
		this.destino = destino;
	}

	protected LocalDateTime getFechasalida() {
		return fechasalida;
	}

	protected void setFechasalida(LocalDateTime fechasalida) {
		this.fechasalida = fechasalida;
	}

	protected LocalDateTime getFechallegada() {
		return fechallegada;
	}

	protected void setFechallegada(LocalDateTime fechallegada) {
		this.fechallegada = fechallegada;
	}

	@Override
	public String toString() {
		return "Codigo Vuelo: " + this.codigoVuelo + "\n" + "Origen: " + this.origen + "\n" + "Destino: " + this.destino
				+ "\n" + "Fecha Salida " + this.fechasalida + "\n" + "Fecha llegada " + this.fechallegada + "\n";
	}

}
