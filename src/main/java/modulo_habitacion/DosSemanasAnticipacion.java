package modulo_habitacion;

public class DosSemanasAnticipacion extends DecoradorHabitacion{
	private Habitacion habitacion; 
	
	public DosSemanasAnticipacion(Habitacion habitacion) {
		super(habitacion);
		this.habitacion= habitacion;
		this.descuento=0.15;
	}
	
	@Override
	public double calcularCostos() {
		double costoFinal =  (habitacion.calcularCostos() * (1 - getDescuento() ));
        return costoFinal;
    }
}
