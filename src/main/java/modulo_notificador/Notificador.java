package modulo_notificador;

import Cliente.Observable;

public class Notificador {
	static private Notificador notificador = null;
	INotificacion medio = null;
	public Notificador(INotificacion medio) {
		this.medio = medio;
	}
	public static Notificador obtenerInstancia(INotificacion medio) {
		if(notificador == null){
			notificador = new Notificador(medio);
		}
		else{
			notificador.cambiarMetodoDeNotificacion(medio);
		}
		return notificador;
	}


	public void cambiarMetodoDeNotificacion(INotificacion nuevo){
		medio = nuevo;
	}
	public void notificar(Observable observable, Mensaje mensaje) {
		medio.notificar(mensaje,observable)
	}
}
