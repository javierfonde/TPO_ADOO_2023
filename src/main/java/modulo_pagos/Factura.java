package metodopago;


import Cliente.Observable;
import Cliente.Reserva;
import java.sql.Date;

import modulo_reserva.Estado;
import Cliente.EstadoReserva;
public class Factura {
	
	private long NroDeFactura;
	private Reserva Reserva;
	private Cliente Cliente;
	private Date FechaDeEmision;
	private Date FechaDeVencimiento;
	private double Monto;
	private Estado EstadoFactura;
	
	public String Pagar(String respuesta) {
		return respuesta;
	}
	
	

}
