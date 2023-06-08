package metodopago;

import modulo_reserva.Estado;

public class FacturaPendienteDePago {
	
	private String leyenda = "se realizo el pago, pendiente al pago";
	
	public String Pagar(Estado nuevo) {
		nuevo = "Pendiente";
		return leyenda;
	}
	

}
