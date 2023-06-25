package modulo_notificador;

import Cliente.Observable;

public class Whatsapp implements INotificacion {
    @Override
    public String notificar(Mensaje mensaje, Observable observable) {
        return mensaje.toString() + " Whatsapp";
    }
}
