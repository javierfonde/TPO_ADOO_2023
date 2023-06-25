package modulo_pagos;



public class Cobrador {
	private Pago medio;
	
	public void ObjetoPago(Pago medio) {
        this.medio = medio;
    } 
	
	public Comprobante cobrar (Factura factura) {
		return new Comprobante();
	}
	
	public void cambiarMetodoDeNotificacion(Pago nuevo){
		this.medio = nuevo;
	}
}