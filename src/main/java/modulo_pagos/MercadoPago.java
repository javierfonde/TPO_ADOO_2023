package metodopago;

public class MercadoPago implements Pago{
	 MercadoPagoApi api = new MercadoPagoApi();
	 public Comprobante cobrar (Factura factura) {
			return new Comprobante();
	}
}
