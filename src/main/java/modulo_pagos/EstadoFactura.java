package metodopago;

public abstract class EstadoFactura {
    private Factura factura;

    public EstadoFactura(Factura factura) {
        this.factura = factura;
    }

	protected abstract String pagar(Estado nuevo);
    public abstract String pagar();

    // Getters y setters
    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
}