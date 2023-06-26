package modulo_pagos;


public class FacturaPagada extends EstadoDeFactura {
    public FacturaPagada() {
        this.estado = "pagada";
    }

    @Override
    public String pagar() {
        if(estado != "pagada"){
            factura.setEstado(new FacturaPagada());
        return "Pago realizado";
        }
        else{
            return "La factura ya ha sido pagada anteriormente!";
        }
    }

    public String getEstado() {
        return estado;
    }
}