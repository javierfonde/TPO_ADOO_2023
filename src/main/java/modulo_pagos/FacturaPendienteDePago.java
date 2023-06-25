package modulo_pagos;


public class FacturaPendienteDePago extends EstadoDeFactura {
	private static String leyenda = "Pendiente de pago";

    public FacturaPendienteDePago(Factura factura) {
        super(factura, leyenda);
    }

	@Override
	public String pagar(EstadoDeFactura nuevo) {
        if (factura != null) {
            factura.setEstado(nuevo); 

        }
        return "Pago realizado. Estado actualizado: " + nuevo.getLeyenda();
    }

	@Override
    public String pagar() {
		factura.setEstado(new FacturaPagada(factura, leyenda));
        return "Pago realizado sin cambios en el estado.";
    }

    public String getLeyenda() {
        return leyenda;
    }

}