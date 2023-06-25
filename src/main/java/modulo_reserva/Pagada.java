package modulo_reserva;

public class Pagada implements EstadoReserva {
    private Reserva reserva;

    public Pagada(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public String getEstado() {
        return "Pagada";
    }

    @Override
    public String pagar(EstadoReserva nuevoEstado) {
        return "La reserva ya está pagada.";
    }
}
