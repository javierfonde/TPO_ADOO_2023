package modulo_notificador;

public class Notificador {
	Notificador notificador;
	INotificacion medio;
	public static Notificador obtenerInstancia() {
		if(!notificador){
			notificador = new Notificador();
		}

	}

	//Este metodo es de prueba.
	public String notificar(String mensaje) {
		return mensaje;
	}
}
