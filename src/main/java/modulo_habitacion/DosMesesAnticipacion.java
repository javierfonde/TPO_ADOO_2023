package modulo_habitacion;

public class DosMesesAnticipacion extends DecoradorHabitacion {

	 public DosMesesAnticipacion(Habitacion habitacion) {
		super(habitacion);
	}
	 
	 public double getDescuento() {
		 return 0.20;
	 }
	
}
