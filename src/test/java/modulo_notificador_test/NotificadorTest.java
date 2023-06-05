package modulo_notificador_test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import modulo_notificador.Notificador;

public class NotificadorTest {
	Notificador notificador=Notificador.obtenerInstancia();
	@Test
	public void test() {
		assertTrue(notificador.notificar("hola")=="hol");
	}
	

}
