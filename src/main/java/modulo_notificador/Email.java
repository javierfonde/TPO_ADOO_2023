package modulo_notificador;

import Cliente.Observable;

public class Email implements INotificacion{
    JakartaAPI api = new JakartaAPI();
    public String notificar(Mensaje mensaje, Observable observable) {
        return api.notificarEmail(observable,mensaje);
    }
}
