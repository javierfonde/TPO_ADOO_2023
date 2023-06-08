package modulo_habitacion_test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import modulo_habitacion.Habitacion;
import modulo_habitacion.Paquete;
import modulo_habitacion.TipoHabitacion;

public class PaqueteTest {
	private Paquete paqueteUno = new Paquete();
	private Paquete paqueteDos = new Paquete();
	private Paquete paqueteTres = new Paquete();
	private Habitacion habitacionUno = new Habitacion(285, 4, 8500.0, TipoHabitacion.Doble);
	private Habitacion habitacionDos = new Habitacion(285, 4, 8500.0, TipoHabitacion.Doble);

	@Test
	public void agregarPaqueteSeEsperaQueSePuedaHacer() {
		paqueteUno.agregarItem(habitacionUno);
		paqueteUno.agregarItem(paqueteTres);
		paqueteTres.agregarItem(habitacionDos);
		assertTrue(paqueteDos.agregarItem(paqueteUno));
	}

	@Test
	public void testAgregarPaqueteRecursivoSeEsperaQueSeNoPuedaHacerYaQueEntrariaEnLoop() {
		assertFalse(paqueteDos.agregarItem(paqueteDos));
	}

	@Test
	public void testAgregarPaqueteQueContieneElPaqueteQueAgregarNoDeberiaEntrariaEnLoopSiSeAgrega() {
		paqueteUno.agregarItem(paqueteDos);
		paqueteTres.agregarItem(paqueteUno);
		assertFalse(paqueteDos.agregarItem(paqueteTres));
	}
}
