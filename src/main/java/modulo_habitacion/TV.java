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

	@Override
	public boolean quitarItem(Combinable item) {
		return false;
	}

	@Override
	public boolean agregarItem(Combinable item) {
		return false;
	}


}
