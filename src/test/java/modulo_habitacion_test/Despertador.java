package modulo_habitacion_test;

import modulo_habitacion.Servicio;

public class Despertador extends Servicio {
	private double costo;

	public Despertador(double costo) {
		this.costo = costo;
	}

	@Override
	public boolean admiteReserva() {
		return false;
	}

	@Override
	public double calcularCostos() {
		return this.costo;
	}

}
