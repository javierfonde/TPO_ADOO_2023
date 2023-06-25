package modulo_pagos;


public class FacturaPagada extends EstadoDeFactura {
    private String leyenda = "Ya se registró el pago";

    public FacturaPagada(Factura factura, String leyenda) {
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
        return "La factura ya se encuentra pagada.";
    }

    public String getLeyenda() {
        return leyenda;
    }
}