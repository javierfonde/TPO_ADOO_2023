package modulo_pagos;

public abstract class EstadoDeFactura {
  protected Factura factura;
  protected String estado;

  public abstract String pagar();

  public Factura getFactura() {
    return factura;
  }

  public void setFactura(Factura factura) {
    this.factura = factura;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }







 
}