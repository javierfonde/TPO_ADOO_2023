package modulo_reserva;

public class Registrada implements EstadoReserva {
    private Reserva reserva;

    public Registrada(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public String getEstado() {
        return "Registrada";
    }

    @Override
    public String pagar(EstadoReserva nuevoEstado) {
        reserva.setEstado(nuevoEstado);
        return "La reserva ha sido pagada correctamente.";
    }
}
