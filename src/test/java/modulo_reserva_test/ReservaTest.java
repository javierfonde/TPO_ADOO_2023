package modulo_reserva_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import Cliente.Cliente;

public class ReservaTest {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Cliente", "Apellido", 1234567889, 987654321, "cliente@example.com");
		assertEquals("Cliente", cliente1.getNombre());
	}
}