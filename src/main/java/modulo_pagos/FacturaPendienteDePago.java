package metodopago;

public class FacturaPendienteDePago extends EstadoFactura {
	private String leyenda = "Pendiente de pago";

    public FacturaPendienteDePago(Factura factura) {
        super(factura);
    }

	@Override
	public String pagar(EstadoDeFactura nuevo) {
        if (Factura != null) {
            Factura.setEstado(nuevo); 
        }
        return "Pago realizado. Estado actualizado: " + nuevo.getLeyenda();
    }

	@Override
    public String pagar() {
		factura.setEstado(new FacturaPagada(factura));
        return "Pago realizado sin cambios en el estado.";
    }

    public String getLeyenda() {
        return leyenda;
    }

}