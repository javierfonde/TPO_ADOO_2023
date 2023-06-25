package modulo_pagos;



public class Comprobante {
	
	private Factura Factura;
	private double MontoACobrar;
	private double MontoRecibido;
	private double Vuelto;
	private long NroDeComprobante;
	private String MedioDePago;
	
	public Comprobante(double MontoACobrar, double MontoRecibido, long NroDeComprobante,String MedioDePago ) {
		double calculo =  MontoRecibido - MontoACobrar;
		this.MontoACobrar = MontoACobrar;
		this.MontoRecibido = MontoRecibido;
		this.Vuelto = this.vuelto(calculo);
		this.NroDeComprobante = NroDeComprobante;
		this.MedioDePago = MedioDePago;
		
	}
	
	public String toString() {
		return String.format("NroDeComprobante %1$s: Pago %2$s %5$s, de %3$s y se le dio de Vuelto %4$s",NroDeComprobante,MontoRecibido,MontoACobrar,Vuelto,MedioDePago);
				
	}
	public void cambiarMedio(String nuevo) {
		
	}
	
	private double vuelto (double calculo ) {
		if (calculo<0) {
			calculo*=-1;
		}
		
		return calculo;
	}
	
	
	
	
	
	
}		

