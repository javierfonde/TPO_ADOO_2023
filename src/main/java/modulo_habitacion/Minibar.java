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
				costo += item.calcularCostos();
			}
		}
		return costo;
	}
	public void agregarItem(Item nuevo) {
		if(!this.contenido.contains(nuevo)) {
			this.contenido.add(nuevo);
		}
	}

	@Override
	public boolean quitarItem(Combinable item) {
		return contenido.remove(item);
	}
}
