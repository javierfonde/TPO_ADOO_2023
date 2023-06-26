package modulos_pagos_test;

import Cliente.Cliente;
import modulo_notificador.Email;
import modulo_pagos.*;
import modulo_reserva.Reserva;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.assertEquals;

public class CobradorTest {
    Cliente cliente = new Cliente("Juan","Perez",13243534,43043234,"hola@gmail.com",new Email());
    Reserva reserva = new Reserva(123,new Date(2015,2,21),new Date(2018,3,23),cliente);
    Factura fact = new Factura(123,new Date(2015,2,21),new Date(2018,3,23), 2000, 2500,cliente,reserva);

    @Test
    public void CambiarFormaPagoMercadoPago(){
        Cobrador cobrador = new Cobrador();
        cobrador.Medio(new Efectivo());
        cobrador.cambiarMetodo(new MercadoPago());


    }
    @Test
    public void CambiarFormaEfectivo(){
        Cobrador cobrador = new Cobrador();
        cobrador.Medio(new MercadoPago());
        cobrador.cambiarMetodo(new Efectivo());
    }
    @Test
    public void TestPagoConMercadoPago() {
        MercadoPago tarj = new MercadoPago();
        Comprobante comprobante=(tarj.cobrar(fact));
        assertEquals("NroDeComprobante 123: Pago 2500.0 con tarjeta, de 2000.0 y se le dio de Vuelto 500.0",comprobante.toString());
    }

    @Test
    public void TestPagoConEfectivo() {
        Efectivo efec = new Efectivo();
        Comprobante comprobante=(efec.cobrar(fact));
        assertEquals("NroDeComprobante 123: Pago 2500.0 con Efectivo, de 2000.0 y se le dio de Vuelto 500.0",comprobante.toString());
    }

}
