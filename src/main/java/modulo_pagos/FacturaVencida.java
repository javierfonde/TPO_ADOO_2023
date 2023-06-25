package modulo_pagos;

public class FacturaVencida extends EstadoDeFactura {
    private String leyenda = "Vuelva a generar, vencido!";

    public FacturaVencida(Factura factura) {
        super(factura, "Vuelva a generar, vencido!");
    }

    @Override
    public String pagar(EstadoDeFactura nuevo) {
        factura.setEstado(nuevo);
        return "Pago realizado. Estado actualizado: " + nuevo.getLeyenda();
    }

    @Override
    public String pagar() {
        return "La factura vencida no puede ser pagada nuevamente.";
    }

    
}