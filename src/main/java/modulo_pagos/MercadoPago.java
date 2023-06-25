package modulo_pagos;



public class MercadoPago implements IPago{

	 public Comprobante cobrar (Factura factura) {
		return new Comprobante(factura.getMonto(),factura.getMontoRecibido(), factura.getReserva(), "con tarjeta");
	}
}

