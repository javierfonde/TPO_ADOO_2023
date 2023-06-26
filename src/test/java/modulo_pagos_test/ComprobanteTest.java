package modulo_pagos_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


import modulo_pagos.Comprobante;


public class ComprobanteTest {
    Comprobante comprobante = new Comprobante( 2000, 2500, 123, "efectivo");
    @Test
    public void TestPagoComprobante() {
        assertEquals("NroDeComprobante 123: Pago 2500.0 efectivo, de 2000.0 y se le dio de Vuelto 500.0",comprobante.toString());
    }

}