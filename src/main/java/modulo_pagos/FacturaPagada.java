package metodopago;

import modulo_reserva.Estado;

public class FacturaPagada {
	private String leyenda = "Ya se registro el pago";
	
	public String Pagar(Estado nuevo) {
		nuevo = "Pagado";
		return leyenda;
	}

}
