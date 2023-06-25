package metodopago;


import Cliente.Observable;
import Cliente.Reserva;

import java.sql.Date;

import Cliente.EstadoReserva;
public class Factura {
	
	private long NroDeFactura;
	private Reserva Reserva;
	private Observable Cliente;
	private Date FechaDeEmision;
	private Date FechaDeVencimiento;
	private double Monto;
	private double MontoRecibido;
	private EstadoReserva Estado ;
	
	public String Pagar() {
		double calculo = MontoRecibido-Monto;
		String respuesta; 
		if (calculo>=0) {
			respuesta = "Monto Abonado, el vuelto es: " + calculo;
		}
		else {
			respuesta = "Falta abonar "+ calculo*-1;
		}
		return respuesta;
	}
	public Factura(long NroDeFactura, double Monto, double MontoRecibido ) {
		
		this.NroDeFactura = NroDeFactura;
		this.FechaDeEmision = FechaDeEmision;
		this.FechaDeVencimiento = FechaDeVencimiento;
		this.Monto = Monto;
		this.MontoRecibido = MontoRecibido;
		
	}
	
	public long getNroReserva() {
		return NroDeFactura;
	}
	public double Monto() {
		return Monto;
	}
	public double MontoRecibido() {
		return MontoRecibido;
	}
	
	
}
	
	
