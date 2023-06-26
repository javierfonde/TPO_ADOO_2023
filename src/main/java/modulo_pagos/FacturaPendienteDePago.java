package modulo_pagos;

public class FacturaPendienteDePago extends EstadoDeFactura {
    public FacturaPendienteDePago() {
        this.estado = "pendiente";
    }

	@Override
    public String pagar() {
		factura.setEstado(new FacturaPagada());
        return "Pago realizado";
    }
}