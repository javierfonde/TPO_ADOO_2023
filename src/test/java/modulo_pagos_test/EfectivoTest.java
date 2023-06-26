package modulo_pagos_test;

import static org.junit.Assert.assertEquals;

import Cliente.Cliente;
import modulo_notificador.Email;
import modulo_reserva.Registrada;
import modulo_reserva.Reserva;
import org.junit.Test;

import modulo_pagos.Comprobante;
import modulo_pagos.Efectivo;
import modulo_pagos.Factura;

import java.sql.Date;


public class EfectivoTest {
    Efectivo efec = new Efectivo();
    Cliente cliente = new Cliente("Juan","Perez",13243534,43043234,"hola@gmail.com",new Email());
    Reserva reserva = new Reserva(123,new Date(2015,2,21),new Date(2018,3,23),cliente);
    Factura fact = new Factura(123,new Date(2015,2,21),new Date(2018,3,23), 2000, 2500,cliente,reserva);
    Comprobante comprobante=(efec.cobrar(fact));
    @Test
    public void TestPagoConEfectivo() {
        assertEquals("NroDeComprobante 123: Pago 2500.0 con Efectivo, de 2000.0 y se le dio de Vuelto 500.0",comprobante.toString());
    }



}