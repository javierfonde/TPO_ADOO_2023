package modulo_reserva_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import Cliente.Cliente;


public class ReservaTest {
    
	public static void main(String[] args) {
    Cliente cliente1 = new Cliente("John", "Doe", 123456789, 987654321, "john.doe@example.com");
    
    assertEquals("John", cliente1.getNombre());

	}
}
