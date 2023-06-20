package metodopago;

import modul_pagos.EstadoDeFactura;

public class FacturaPagada extends EstadoFactura {
    private String leyenda = "Ya se registró el pago";

    public FacturaPagada(Factura factura) {
        super(factura);
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
        return "La factura ya se encuentra pagada.";
    }

    public String getLeyenda() {
        return leyenda;
    }
}