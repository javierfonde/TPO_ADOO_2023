package modulo_habitacion;

public class Item extends Combinable{
	private double costo;
	private String descripcion;

	public Item(String descripcion, double costo) {
		this.descripcion = descripcion;
		this.costo = costo;
	}
	public double costo() {
		return this.costo;
	}
	public String descripcion() {
		return this.descripcion;
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
