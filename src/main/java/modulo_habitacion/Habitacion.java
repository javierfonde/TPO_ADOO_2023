package modulo_habitacion;

import java.util.LinkedList;
import java.util.List;

public class Habitacion extends Combinable {
	private EstadoHabitacion estado;
	private List<Servicio> servicios = new LinkedList<>();
	private int cantidadPersonas;
	private double costoBase;
	private TipoHabitacion tipo;
	private int nroDeHabitacion;

	public Habitacion(int nro, int personas, double costoBase, TipoHabitacion tipo) {
		this.estado = new Disponible();
		this.nroDeHabitacion = nro;
		this.cantidadPersonas = personas;
		this.costoBase = costoBase;
		this.tipo = tipo;
	}

	public String getEstado() {
		return this.estado.getEstado();
	}

	public void cambiarEstado() {
		if (this.estado.getClass() == Disponible.class) {
			this.estado = new Reservada();
		} else {
			this.estado = new Disponible();
		}
	}

	public void quitarServicio(Servicio retirar) {
		this.servicios.remove(retirar);
	}

	@Override
	public boolean admiteReserva() {
		return true;
	}

	@Override
	public double calcularCostos() {
		double costoTotal = this.costoBase;
		if (this.servicios.size() > 0) {
			for (Servicio servicio : this.servicios) {
				costoTotal += servicio.calcularCostos();
			}
		}
		return costoTotal;
	}

	@Override
	public boolean equals(Object o) {
		Habitacion otra = (Habitacion) o;
		return this == otra;
	}

	public int getCantidaDePersonas() {
		return this.cantidadPersonas;
	}

	public int getNRO() {
		return this.nroDeHabitacion;
	}

	public double getCostoBase() {
		return this.costoBase;
	}

	public TipoHabitacion getTipo() {
		return this.tipo;
	}

	public void agregarServicio(Servicio servicio) {

	}

	public String reservar() {
		return this.estado.reservar();
	}

	@Override
	public boolean quitarItem(Combinable item) {
		return servicios.remove(item);
	}

	@Override
	public boolean agregarItem(Combinable item) {
		if (item instanceof Servicio && !(item instanceof Item) && !this.servicios.contains(item)) {
			return this.servicios.add((Servicio) item);
		} else {
			return false;
		}
	}
}
