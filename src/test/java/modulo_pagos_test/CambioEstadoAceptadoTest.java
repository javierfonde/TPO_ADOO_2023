package modulo_pagos_test;

import static org.junit.Assert.*;
import java.sql.Date;
import org.junit.Test;
import Cliente.Cliente;
import modulo_notificador.Email;
import modulo_pagos.Factura;
import modulo_pagos.FacturaPendienteDePago;
import modulo_reserva.Reserva;

public class CambioEstadoAceptadoTest {

    @Test
    public void testCambiarEstadoFacturaAceptado(){
        Cliente cliente = new Cliente("Juan", "Perez", 13243534, 43043234, "hola@gmail.com", new Email());
        Reserva reserva = new Reserva(123, new Date(2015, 2, 21), new Date(2018, 3, 23), cliente);
        Factura factura = new Factura(123, new Date(2015, 2, 21), new Date(2018, 3, 23), 2000, 0, cliente, reserva);

        //OPCION 1:
        assertEquals("pendiente", factura.pagar());

        //OPCION 2:
        assertEquals(FacturaPendienteDePago.class, factura.getEstado().getClass());
    }
}
    

