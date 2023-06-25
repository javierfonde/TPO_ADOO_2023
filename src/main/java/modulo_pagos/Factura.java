package modulo_pagos;

import Cliente.Cliente;
import modulo_reserva.Reserva;

import java.sql.Date;

//import cliente.Cliente;
//import modulo_reserva.Reserva;

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
    
	public String Pagar() {
		double calculo = montoRecibido-monto;
		String respuesta; 
		if (calculo>=0) {
			respuesta = "Monto Abonado, el vuelto es: " + calculo;
		}
		else {
			respuesta = "Falta abonar "+ calculo*-1;
		}
		return respuesta;
	}
    
    public void pagar(EstadoDeFactura nuevoEstado) {
        estado = nuevoEstado;
        System.out.println(estado.pagar());
    }
    
    public long getNroDeFactura() {
        return nroDeFactura;
    }


    public int getReserva() {
        return reserva.getNumReserva();
    }


    public String getLeyenda() {
        return estado.getLeyenda();
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

    public EstadoDeFactura getEstado() {
        return estado;
    }

    public void setEstado(EstadoDeFactura estado) {
        this.estado = estado;
    }

    public double getMontoRecibido() {
        return montoRecibido;
    }
}

