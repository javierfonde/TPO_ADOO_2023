package modulo_habitacion;

public class DecoradorHabitacion extends Habitacion{
			protected Habitacion habitacion;
			private double descuento;
			
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

		    public double calcularCostos() {
		        double descuento = getDescuento();
		        double costoBase = habitacion.getCostoBase();
		        double costoFinal =  (costoBase * (1 - descuento));
		        return costoFinal;
		    }
//QUEDA PENDIENTE, CAMBIAR EL NOMBRE DEL METODO "CALCULARCOSTOS" PORQUE ES UTILIZADO EN HABITACION. Y REDUCIR CODIGO


			
			
}
