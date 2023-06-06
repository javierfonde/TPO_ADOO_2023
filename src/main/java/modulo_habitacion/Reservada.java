package modulo_habitacion;

public class Reservada extends EstadoHabitacion {
	public Reservada() {
		this.estadoDetalle = "Reservada";
	}

	@Override
	public String reservar() {
		this.estado = new Disponible();
		return null;
	}

}
