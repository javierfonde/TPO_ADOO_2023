package modulo_pagos;


public class Cobrador {
	static private Cobrador cobrador = null;
	IPago medio;
	
	public Cobrador(IPago medio) {
		this.medio = medio;
	}
	public Comprobante cobrar (Factura factura) {
		return new Comprobante(factura.Monto(),factura.MontoRecibido(), factura.getNroReserva(), "con Efectivo");
	}
	
	public void cambiarMetodo(IPago nuevo){
		this.medio = nuevo;
	}
}
