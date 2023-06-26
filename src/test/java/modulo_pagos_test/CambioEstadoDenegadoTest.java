package modulo_pagos_test;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

import Cliente.Cliente;
import modulo_notificador.Email;
import modulo_pagos.Factura;
import modulo_pagos.FacturaPagada;
import modulo_reserva.Reserva;

public class CambioEstadoDenegadoTest {
    @Test
    public void testCambiarEstadoFacturaDenegado() {
        Cliente cliente = new Cliente("Jose", "Alvarez", 15121314, 43043234, "hola@gmail.com", new Email());
        Reserva reserva = new Reserva(456, new Date(2015, 2, 21), new Date(2018, 3, 23), cliente);
        Factura factura = new Factura(456, new Date(2015, 3, 21), new Date(2018, 4, 23), 2000, 1950, cliente, reserva);
       
        assertFalse("pagada" == factura.pagar());


        assertFalse(FacturaPagada.class == factura.getEstado().getClass());
    }
}