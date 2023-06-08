package metodopago;

import modulo_reserva.Reserva;

import java.sql.Date;

import modulo_reserva.Estado;

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
