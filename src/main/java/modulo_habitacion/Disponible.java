package modulo_habitacion;

public class Disponible extends EstadoHabitacion {
	public Disponible() {
		this.estadoDetalle = "Disponible";
	}

	@Override
	public String reservar() {
		this.estado = new Reservada();
		return this.estado.getEstado();
	}
}
