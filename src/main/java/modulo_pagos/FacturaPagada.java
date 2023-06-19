package metodopago;

import modul_pagos.EstadoDeFactura;

public class FacturaPagada {
	
	private String leyenda = "Ya se registro el pago"; // Atributo

    // Operación pagar que recibe un nuevo estado y devuelve un mensaje
    public String pagar(EstadoDeFactura nuevo) {
        // Lógica para realizar el pago y cambiar al nuevo estado
        // ...
        return "Pago realizado. Estado actualizado: " + nuevo.getLeyenda();
    }

    // Operación pagar sin parámetros que devuelve un mensaje
    public String pagar() {
        // Lógica para realizar el pago sin cambios en el estado
        // ...
        return "Pago realizado sin cambios en el estado.";
    }

    public String getLeyenda() {
        return leyenda;
    }

}
