package modulo_reserva;

import java.util.Date;
import java.util.List;
import Cliente.Cliente;
import modulo_habitacion.Paquete;

public class Reserva {
    private int numReserva;
    private Date checkIn;
    private Date checkOut;
    private Cliente cliente;
    private EstadoReserva estado;
    private Paquete paquete;

    public Reserva(int numReserva, Date checkIn, Date checkOut, Cliente cliente) {
        this.numReserva = numReserva;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.cliente = cliente;
        this.estado = new Registrada(this);
    }
    public void setPaquete(Paquete paquete){
        this.paquete=paquete;
    }
    public boolean soyLaReserva(int numReserva) {
        return this.numReserva == numReserva;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

	public EstadoReserva getEstado() {
		// TODO Auto-generated method stub
		return this.estado;
	}

    public int getNumReserva() {
        return numReserva;
    }

     public Paquete getPaquete() {
        return paquete;
     }

}
