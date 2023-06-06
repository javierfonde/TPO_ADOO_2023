package modulo_habitacion;

public abstract class Combinable {
	public abstract boolean admiteReserva();
	public abstract double calcularCostos();
	public abstract boolean quitarItem(Combinable item);
}
