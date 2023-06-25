package modulo_reserva;

public interface EstadoReserva {
    String getEstado();
    String pagar(EstadoReserva nuevoEstado);
}