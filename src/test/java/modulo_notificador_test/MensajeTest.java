package modulo_notificador_test;

import modulo_notificador.Mensaje;
import modulo_notificador.Notificador;
import modulo_notificador.Sms;
import modulo_notificador.Whatsapp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MensajeTest {
    Mensaje mensaje = new Mensaje("Pago","Pago recibido","Hotel");
    @Test
    public void TestPasajeACadena() {
        assertEquals("Pago: Pago recibido de Hotel",mensaje.toString());
    }
}
