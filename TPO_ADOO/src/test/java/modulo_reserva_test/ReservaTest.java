package modulo_reserva_test;

import Cliente.Cliente;
import modulo_reserva.*;

import java.util.Date;

public class ReservaTest {
    public static void main(String[] args) {
        // Crear clientes
        Cliente cliente1 = new Cliente("John", "Doe", 123456789, 987654321, "john.doe@example.com");
        Cliente cliente2 = new Cliente("Jane", "Smith", 987654321, 123456789, "jane.smith@example.com");

        // Crear reservas
        Reserva reserva1 = new Reserva(1, new Date(), new Date(), cliente1, new Registrada());
        Reserva reserva2 = new Reserva(2, new Date(), new Date(), cliente2, new Registrada());

        // Cambiar estado de las reservas
        reserva1.setEstado(new Pagada());
        reserva2.setEstado(new Cancelada());

        // Imprimir información de las reservas
        System.out.println("Reserva 1 - Estado: " + reserva1.getEstado().getEstado());
        System.out.println("Reserva 2 - Estado: " + reserva2.getEstado().getEstado());
    }
}
