package modulo_notificador_test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import modulo_notificador.Notificador;

public class NotificadorTest {
	Notificador notificador=Notificador.obtenerInstancia();
	Cliente cliente = new Cliente;
	@Test
	public void test() {
		assertTrue(notificador.notificar();
	}
	

}
