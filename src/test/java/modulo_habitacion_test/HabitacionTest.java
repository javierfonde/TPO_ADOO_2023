package modulo_habitacion_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import modulo_habitacion.Habitacion;
import modulo_habitacion.Item;
import modulo_habitacion.Minibar;
import modulo_habitacion.TV;
import modulo_habitacion.TipoHabitacion;

public class HabitacionTest {

	private Habitacion habitacion;
	private TV tv;
	private Minibar minibar;
	private Item champagne;
	private Item vino;
	private Item snacks;

	@Before
	public void configuracionInicial() {
		habitacion = new Habitacion(285, 4, 8500.0, TipoHabitacion.Doble);
		tv = new TV(550.25);
		champagne = new Item("Champagne \'Patrones de Diseño\' 2023", 2500.50);
		vino = new Item("Vino Malbec \'Patrones de Diseño\' 2023", 1800.75);
		snacks = new Item("Snacks \'Patrones de Diseño\' 100Gr", 970.05);
		minibar = new Minibar();
		minibar.agregarItem(champagne);
		minibar.agregarItem(snacks);
		minibar.agregarItem(vino);

		habitacion.agregarServicio(tv);
		habitacion.agregarServicio(minibar);

	}

	@Test
	public void testeaQueLaHabitacionSeaDe4Personas() {
		assertEquals(4, habitacion.getCantidaDePersonas());
	}

	@Test
	public void testeaQueLaHabitacionSeaDe5PersonasSeEsperaQueNo() {
		assertFalse(5 == habitacion.getCantidaDePersonas());
	}

	@Test
	public void testeaNROHabitacion() {
		assertEquals(285, habitacion.getNRO());
	}

	@Test
	public void testeaNROHabitacionSeEsperaQueNoSeaCorrecto() {
		assertFalse(205 == habitacion.getNRO());
	}

	@Test
	public void testeaCostoBase() {
		assertEquals(8500.0, habitacion.getCostoBase(), 0.0);
	}

	@Test
	public void testeaCostoBaseSeEsperaQueNoSeaCorrecto() {
		assertFalse(3250.50 == habitacion.getCostoBase());
	}

	@Test
	public void testeaCostoTotalSinDescuento() {
		assertEquals(14321.55, habitacion.calcularCostos(), 0.0);
	}

	@Test
	public void testeaCostoTotalSinDescuentoSeEsperaQueNoSeaCorrecto() {
		assertFalse(0.00 == habitacion.calcularCostos());
	}

	@Test
	public void testeaCostoTotalSinDescuentoHabiendoQuitadoServicioTV() {
		habitacion.quitarServicio(tv);
		assertEquals(13771.3, habitacion.calcularCostos(), 0.0);
	}

	@Test
	public void testeaCostoTotalSinDescuentoHabiendoQuitadoServicioTVSeEsperaQueNoSeaCorrecto() {
		assertFalse(0.00 == habitacion.calcularCostos());
	}

	@Test
	public void testeaCostoTotalSinDescuentoHabiendoAgregadoServicioDespertador() {
		habitacion.agregarServicio(new Despertador(300.00));
		assertEquals(14621.55, habitacion.calcularCostos(), 0.0);
	}

	@Test
	public void testeaCostoTotalSinDescuentoHabiendoQuitadoServicioSeEsperaValorInicialYaQueNoHayServicioDespertador() {
		Despertador servicio = new Despertador(300.00);
		habitacion.quitarServicio(servicio);
		assertTrue(14321.55 == habitacion.calcularCostos());
	}

	@Test
	public void testeaTipoDeHabitacion() {
		assertEquals(TipoHabitacion.Doble, habitacion.getTipo());
	}

	@Test
	public void testeaTipoDeHabitacionSeEsperaQueNoSeaCorrecto() {
		assertFalse(TipoHabitacion.Familiar == habitacion.getTipo());
	}

	@Test
	public void testCambioDeEstadoDisponibleReservada() {
		assertTrue("Reservada" == habitacion.reservar());
	}
	
	@Test
	public void testVerficarEstadoDispobleAlCrearHabitacion() {
		assertTrue("Disponible" == habitacion.getEstado());
	}
}
