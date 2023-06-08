package metodopago;

import modulo_reserva.Estado;

public class FacturaVencida {

	private String leyenda = "Vuelva a generar reserva";
	
	public String Pagar(Estado nuevo) {
		nuevo = "Vencido";
		return leyenda;
	}
	
	
	
}
