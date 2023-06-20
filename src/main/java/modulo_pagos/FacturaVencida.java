package metodopago;

public class FacturaVencida extends EstadoFactura {
    private String leyenda = "Vuelva a generar reserva";

    public FacturaVencida(Factura factura) {
        super(factura);
    }

    @Override
    public String pagar(EstadoDeFactura nuevo) {
        if (factura != null) {
            factura.setEstado(nuevo);
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