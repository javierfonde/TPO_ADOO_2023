package modulo_pagos;

public abstract class EstadoDeFactura {
    public Factura factura;
    private String leyenda;

    public EstadoDeFactura(Factura factura, String leyenda) {
        this.factura = factura;
        this.leyenda = leyenda;
    }

    public abstract String pagar();

    protected abstract String pagar(EstadoDeFactura nuevo);

    // Getters y setters
    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public String getLeyenda() {
        return leyenda;
    }
}