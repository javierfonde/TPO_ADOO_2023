package modulo_notificador;

import Cliente.Observable;

public interface INotificacion {
    String notificar(Mensaje mensaje, Observable observable);
}
