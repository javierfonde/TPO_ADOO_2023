package modulo_pagos;

import Cliente.Cliente;
import modulo_reserva.Reserva;
import java.sql.Date;

public class Factura {

    private long nroDeFactura;
	private Reserva reserva;
	private Cliente cliente;
	private Date fechaDeEmision;
	private Date fechaDeVencimiento;
	private double monto;
    private double montoRecibido;
	private EstadoDeFactura estado;
	

	public Factura(long nroDeFactura, Date fechaDeEmision, Date fechaDeVencimiento, double monto, double montoRecibido,Cliente cliente,Reserva reserva ) {
		
		this.nroDeFactura = nroDeFactura;
		this.fechaDeEmision = fechaDeEmision;
		this.fechaDeVencimiento = fechaDeVencimiento;
		this.monto = monto;
		this.montoRecibido = montoRecibido;
        this.cliente = cliente;
        this.reserva = reserva;
		
	}
    
	public String pagar() {
		double calculo = montoRecibido-monto;
		String respuesta; 
        //if(this.estado.getEstado() != "vencida"){

            if (calculo>=0) {
			    respuesta = "pagada";
                this.estado = new FacturaPagada();
		    }
            else {
                respuesta = "pendiente";
                this.estado = new FacturaPendienteDePago();
            }
		    return respuesta;

        /*
        }
        else{
            return "La factura se encuentra vencida. No se puede pagar!";
        }
		*/
	}
    
    public long getNroDeFactura() {
        return nroDeFactura;
    }


    public int getReserva() {
        return reserva.getNumReserva();
    }

    public Cliente getCliente() {
        return cliente;
    }


    public Date getFechaDeEmision() {
        return fechaDeEmision;
    }

    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public double getMonto() {
        return monto;
    }

    public void setEstado(EstadoDeFactura estado) {
        this.estado = estado;
    }
    
    public EstadoDeFactura getEstado() {
        return estado;
    }

    public double getMontoRecibido() {
        return montoRecibido;
    }

    

   

   
}

