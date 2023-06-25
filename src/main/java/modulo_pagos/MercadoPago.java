package modulo_pagos;

public class MercadoPago implements IPago{
	 private MercadoPagoAPI mercadoPago = new MercadoPagoAPI();
	 public Comprobante cobrar (Factura factura) {
		return new Comprobante(factura.Monto(),factura.MontoRecibido(), factura.getNroReserva(), "con tarjeta");
	}
}

