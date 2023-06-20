package modulo_notificador;


import Cliente.Observable;

public class JakartaAPI {
    public String notificarEmail(Observable observable, Mensaje mensaje){
        return mensaje.toString() + " Email";
    }
}
