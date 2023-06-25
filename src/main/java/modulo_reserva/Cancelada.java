package modulo_reserva;

public class Cancelada implements EstadoReserva {
    private Reserva reserva;

    public Cancelada(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public String getEstado() {
        return "Cancelada";
    }

    @Override
    public String pagar(EstadoReserva nuevoEstado) {
        return "No se puede pagar una reserva cancelada.";
    }
}
