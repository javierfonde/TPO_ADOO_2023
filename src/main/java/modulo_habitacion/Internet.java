package modulo_habitacion;

public class Internet extends Servicio {
	private double costo;

	public Internet(double costo) {
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

	@Override
	public boolean quitarItem(Combinable item) {
		return false;
	}
}