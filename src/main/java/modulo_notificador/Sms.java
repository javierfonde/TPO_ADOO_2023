package modulo_notificador;

import Cliente.Observable;

public class Sms implements INotificacion {
    TwilioAPI api = new TwilioAPI();
    @Override
    public String notificar(Mensaje mensaje, Observable observable) {
        return api.notificarSms(observable, mensaje);
    }
}
