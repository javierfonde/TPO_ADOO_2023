package modulo_pagos;



public class Efectivo implements IPago{
	
	private double DineroPagado;
	private double cambio;//no lo uso ya que el vuelto lo calculo directamente en el comprobante 
	
	public Comprobante cobrar (Factura factura) {
		return new Comprobante(factura.Monto(),factura.MontoRecibido(), factura.getNroReserva(), "con Efectivo");
	}
	

}
