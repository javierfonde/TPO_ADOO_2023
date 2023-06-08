package modulo_notificador_test;

import Cliente.Cliente;
import modulo_notificador.Email;
import modulo_notificador.Mensaje;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmailTest {
    Email email = new Email();
    Cliente cliente = new Cliente("Juan","Perez",13243534,43043234,"hola@gmail.com",new Email());

    Mensaje mensaje = new Mensaje("Pago","Pago recibido","Hotel");
    @Test
    public void TestNotificacionEmail() {
        assertEquals("Pago: Pago recibido de Hotel Email",email.notificar(mensaje,cliente));
    }
}
