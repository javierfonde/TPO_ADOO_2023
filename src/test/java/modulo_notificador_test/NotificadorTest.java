package modulo_notificador_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import Cliente.Cliente;
import modulo_notificador.*;
import org.junit.Test;

public class NotificadorTest {

	Cliente cliente = new Cliente("Juan","Perez",13243534,43043234,"hola@gmail.com",new Email());
	Mensaje mensaje = new Mensaje("Pago","Se recibio pago","hotel");
	@Test
	public void TestNotificacionMail() {
		Notificador notificador=Notificador.obtenerInstancia(new Email());
		assertEquals(notificador.notificar(cliente,mensaje),mensaje.toString()+" Email");
	}
	@Test
	public void TestNotificacionSMS() {
		Notificador notificador=Notificador.obtenerInstancia(new Sms());
		assertEquals(notificador.notificar(cliente,mensaje),mensaje.toString()+" SMS");
	}
	@Test
	public void TestNotificacionWhatsapp() {
		Notificador notificador=Notificador.obtenerInstancia(new Whatsapp());
		assertEquals(notificador.notificar(cliente,mensaje),mensaje.toString()+" Whatsapp");
	}
	@Test
	public void TestCambioDeMedioYNotificacionSMS() {
		Notificador notificador=Notificador.obtenerInstancia(new Whatsapp());
		notificador.cambiarMetodoDeNotificacion(new Sms());
		assertEquals(notificador.notificar(cliente,mensaje),mensaje.toString()+" SMS");
	}
	@Test
	public void TestCambioDeMedioYNotificacionEmail() {
		Notificador notificador=Notificador.obtenerInstancia(new Whatsapp());
		notificador.cambiarMetodoDeNotificacion(new Email());
		assertEquals(notificador.notificar(cliente,mensaje),mensaje.toString()+" Email");
	}
}
