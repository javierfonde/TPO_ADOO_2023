public abstract class EstadoFactura {
    private Factura factura;

    public EstadoFactura(Factura factura) {
        this.factura = factura;
    }

    public abstract String pagar();

    // Getters y setters
    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
}