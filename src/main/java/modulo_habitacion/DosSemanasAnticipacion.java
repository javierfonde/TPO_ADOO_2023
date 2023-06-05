package modulo_habitacion;

public class DosSemanasAnticipacion extends DecoradorHabitacion{
	private Habitacion habitacion; 
	public DosSemanasAnticipacion(Habitacion habitacion) {
		super(habitacion);
		this.habitacion= habitacion;
	}
	
	public double getDescuento() {
		return 0.15;
	}
	
	public double calcularCostos() {
        return habitacion.getCostoBase() * (1 - getDescuento()) ;
    }
}
