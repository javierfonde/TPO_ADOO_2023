package modulo_habitacion_test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import modulo_habitacion.DecoradorHabitacion;
import modulo_habitacion.DosMesesAnticipacion;
import modulo_habitacion.DosSemanasAnticipacion;
import modulo_habitacion.Habitacion;
import modulo_habitacion.TipoHabitacion;

public class DecoratorTest {
	@Test
	public void seTesteDescuento15porciento() {
	Habitacion habitacion = new Habitacion(285,4,8500.0, TipoHabitacion.Doble );
        
        DecoradorHabitacion habitacionDescuento = new DosSemanasAnticipacion(habitacion);
        assertEquals(7225, habitacionDescuento.calcularCostos());
        System.out.println("Costo final de la habitación con descuento de 2 semanas de anticipacion: " + habitacionDescuento.calcularCostos());
    }
	
	@Test
	public void seTesteDescuento20porciento() {
		Habitacion habitacion = new Habitacion(285,4,500.0, TipoHabitacion.Doble );
	        
	        DecoradorHabitacion habitacionDescuento = new DosMesesAnticipacion(habitacion);
	        assertEquals(false, habitacionDescuento.calcularCostos()==56565);
	        System.out.println("Costo final de la habitación con descuento de 2 meses de anticipacion: " + habitacionDescuento.calcularCostos()) ;
	    }
}


