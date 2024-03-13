package Colecciones;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Vuelos {

	private String voo;
	private String companhia;
	private String destino;
	private LocalDateTime hora;

	public Vuelos(String voo, String compañia, String destino, LocalDateTime hora) {
		this.voo = voo;
		this.companhia = compañia;
		this.destino = destino;
		this.hora = hora;
	}

	protected String getVoo() {
		return voo;
	}

	protected void setVoo(String voo) {
		this.voo = voo;
	}

	protected String getCompañia() {
		return companhia;
	}

	protected void setCompañia(String compañia) {
		this.companhia = compañia;
	}

	protected String getDestino() {
		return destino;
	}

	protected void setDestino(String destino) {
		this.destino = destino;
	}

	protected LocalDateTime getHora() {
		return hora;
	}

	protected void setHora(LocalDateTime hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "El número del vuelo es: \n" + this.voo + " Compañia: \n" + this.companhia + " Destino: \n" + this.destino
				+ " Hora solicitud: \n" + this.hora + " duración \n" + diferenciaSegundos(hora, LocalDateTime.now());
	}

	public long diferenciaSegundos(LocalDateTime fechaInicio, LocalDateTime fechaFin) {

		long diferenciaEnSegundos = ChronoUnit.SECONDS.between(fechaInicio, fechaFin);
		return diferenciaEnSegundos;
	}

}
