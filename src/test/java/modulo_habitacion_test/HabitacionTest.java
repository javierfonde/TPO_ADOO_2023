package modulo_habitacion_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modulo_habitacion.Habitacion;
import modulo_habitacion.TipoHabitacion;

public class HabitacionTest {
	Habitacion habitacion=new Habitacion(285,4,8500.0, TipoHabitacion.Doble );
	@Test
	public void testeaCantidadDePersonas() {
		assertEquals(4, habitacion.getCantidaDePersonas());
	}
}
