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

	public void agregarItem(Combinable item) {
		if (!incluye.contains(item)) {
			incluye.add(item);
		}
	}

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
