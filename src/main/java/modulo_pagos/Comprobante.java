package metodopago;

public class Comprobante {
	
	private Factura Factura;
	private double MontoCobrado;
	private double MontoRecibido;
	private double Vuelto;
	private long NroDeComprobante;
	private String MedioDePago;
	
	
	/*public String ToString() {#NO RECUERDO LO QUE DEVUELVE 
		 
	}*/
	
	public double getMontoRecibido() {
		return MontoRecibido;
	}
}	
