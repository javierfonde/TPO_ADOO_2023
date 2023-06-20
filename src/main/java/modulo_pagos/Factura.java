package metodopago;

import modulo_reserva.Reserva;

import java.sql.Date;

import modulo_reserva.Estado;

public class Factura {
	
	private long nroDeFactura;
	private Reserva reserva;
	private Cliente cliente;
	private Date fechaDeEmision;
	private Date fechaDeVencimiento;
	private double monto;
	private EstadoDeFactura estado;
	
	public Factura() {
        estado = new FacturaPendienteDePago(this);
    }
    
    public void pagar() {
        System.out.println(estado.getPagar());
    }
    
    public void pagar(EstadoDeFactura nuevoEstado) {
        estado = nuevoEstado;
        System.out.println(estado.getPagar());
    }
    
    public String getLeyenda() {
        return estado.getLeyenda();
    }
    
    public void setEstado(EstadoDeFactura estado) {
        this.estado = estado;
    }
}
	
	
