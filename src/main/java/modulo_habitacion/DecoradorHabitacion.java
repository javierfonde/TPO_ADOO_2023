package modulo_habitacion;

public abstract class DecoradorHabitacion extends Habitacion{
			protected Habitacion habitacion;
			protected double descuento;
			
			public DecoradorHabitacion (Habitacion habitacion) {
				super(habitacion);
				this.habitacion= habitacion;
			}
			
			public void setDescuento(double descuento) {
				this.descuento = descuento;
			}
			
			public double getDescuento() {
				return descuento;
			}

		    public abstract double calcularCostos();
		    			
			
}
