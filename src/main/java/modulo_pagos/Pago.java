package metodopago;
import Cliente.Observable;
public interface Pago {
	Comprobante cobrar(Factura factura);

}
