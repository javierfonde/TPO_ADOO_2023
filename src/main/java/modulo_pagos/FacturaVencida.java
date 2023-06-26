package modulo_pagos;

public class FacturaVencida extends EstadoDeFactura {
    public FacturaVencida() {
        this.estado = "vencida";
    }

    @Override
    public String pagar() {
        return "La factura vencida no puede ser pagada. Debe generar otra.";
    }

}