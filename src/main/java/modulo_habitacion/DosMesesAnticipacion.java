package modulo_habitacion;

public class DosMesesAnticipacion extends DecoradorHabitacion {
		
	 public DosMesesAnticipacion(Habitacion habitacion) {
		super(habitacion);
		super.descuento=0.20;
	}
	 @Override
	 public double calcularCostos() {
		 double costoFinal =  (habitacion.calcularCostos() * (1 - getDescuento() ));
	      return costoFinal;
	    }
}
