package modulo_habitacion_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import modulo_habitacion.DecoradorHabitacion;
import modulo_habitacion.DosMesesAnticipacion;
import modulo_habitacion.DosSemanasAnticipacion;
import modulo_habitacion.Habitacion;
import modulo_habitacion.TipoHabitacion;

public class DecoratorTest {
	private Habitacion habitacion; 
	
	@Before
	public void configuracionInicial() {
		habitacion = new Habitacion(285,4,10000.0, TipoHabitacion.Doble );
	}
	
	
	@Test
	public void seTesteDescuento15porciento() {
	        
        DecoradorHabitacion habitacionDescuento = new DosSemanasAnticipacion(habitacion);
        assertEquals(8500, habitacionDescuento.calcularCostos());
        System.out.println("Costo final de la habitación con descuento de 2 semanas de anticipacion: " + habitacionDescuento.calcularCostos());
    }
	
	@Test
	public void seTesteDescuento20porciento() {
	       
	        DecoradorHabitacion habitacionDescuento = new DosMesesAnticipacion(habitacion);
	        assertEquals(8000, habitacionDescuento.calcularCostos());
	        System.out.println("Costo final de la habitación con descuento de 2 meses de anticipacion: " + habitacionDescuento.calcularCostos()) ;
	    }
}

