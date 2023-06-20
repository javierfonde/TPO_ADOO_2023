package modulo_habitacion;

public abstract class DecoradorHabitacion extends Habitacion{
			protected Habitacion habitacion;
			protected double descuento;

			public DecoradorHabitacion (Habitacion habitacion) {
				super(habitacion.getNRO(), habitacion.getCantidaDePersonas(),habitacion.getCostoBase(),
				habitacion.getTipo());

				this.habitacion= habitacion;
			}

			public void setDescuento(double descuento) {
				this.descuento = descuento;
			}

			public double getDescuento() {
				return descuento;
			}

		    @Override
			public abstract double calcularCostos();


}
