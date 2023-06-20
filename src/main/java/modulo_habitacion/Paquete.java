package modulo_habitacion;

import java.util.LinkedList;
import java.util.List;

public class Paquete extends Combinable {
	private List<Combinable> incluye = new LinkedList<>();

	@Override
	public boolean admiteReserva() {
		return false;
	}

	@Override
	public double calcularCostos() {
		double costo = 0;
		for (Combinable combinable : incluye) {
			costo += combinable.calcularCostos();
		}
		return costo;
	}

	@Override
	public boolean agregarItem(Combinable item) {
		boolean puedeInsertar = true;
		if (this == item || this.incluye.contains(item)
				|| (item instanceof Paquete && ((Paquete) item).incluye.contains(this))) {
			puedeInsertar = false;
		} else if (item instanceof Paquete) {
			for (Combinable elemento : ((Paquete) item).incluye) {
				if (!puedeInsertar) {
					break;
				} else {
					puedeInsertar = this.agregarItem(elemento);
				}
			}
		}
		if (puedeInsertar) {
			this.incluye.add(item);
		}
		return puedeInsertar;
	}

	@Override
	public boolean quitarItem(Combinable item) {
		boolean retiro = false;
		boolean encontrado = incluye.remove(item);
		if (encontrado) {
			retiro = true;
		} else {
			for (Combinable combinable : incluye) {
				retiro = combinable.quitarItem(item);
				if (retiro) {
					break;
				}
			}
		}
		return retiro;
	}

}
