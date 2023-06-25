package modulo_reserva_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import Cliente.Cliente;
import modulo_notificador.Email;
import org.junit.Test;

public class ReservaTest {
	@Test
	public void testReserva() {
		Cliente cliente1 = new Cliente("Cliente", "Apellido", 1234567889, 987654321, "cliente@example.com",new Email());
		assertEquals("Cliente", cliente1.getNombre());
	}
}