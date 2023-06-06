package modulo_habitacion;

import java.util.LinkedList;
import java.util.List;

public class Minibar extends Servicio {
	List<Item> contenido = new LinkedList<>();

	@Override
	public boolean admiteReserva() {
		return false;
	}

	@Override
	public double calcularCostos() {
		double costo = 0.0;
		if (this.contenido.size() > 0) {
			for (Item item : this.contenido) {
				costo += item.costo();
			}
		}
		return costo;
	}
	public void agregarItem(Item nuevo) {
		if(!this.contenido.contains(nuevo)) {
			this.contenido.add(nuevo);
		}
	}
}
