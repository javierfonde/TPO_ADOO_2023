package modulo_habitacion;

public abstract class EstadoHabitacion {
	protected String estadoDetalle;
	protected EstadoHabitacion estado;
	protected Habitacion habitacion;

	public abstract String reservar();

	public String getEstado() {
		return this.estadoDetalle;
	}

}
