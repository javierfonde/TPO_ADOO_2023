package modulo_habitacion;

public class TV extends Servicio {
	private double costo;

	public TV(double costo) {
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
