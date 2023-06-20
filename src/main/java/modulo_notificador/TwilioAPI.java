package modulo_notificador;

import Cliente.Observable;

public class TwilioAPI {
    public String notificarSms(Observable observable, Mensaje mensaje){
        return mensaje.toString() + " SMS";
    }
    public String notificarWhatsapp(Observable observable, Mensaje mensaje){
        return mensaje.toString() + " Whatsapp";
    }
}

