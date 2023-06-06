package modulo_habitacion;

public class Item {
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
}
