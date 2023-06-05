package modulo_notificador;

public class Notificador {
	Notificador notificador;
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
