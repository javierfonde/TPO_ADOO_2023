package metodopago;



public class EstadoDeFactura {
	
	private Factura factura; // Atributo
    private String leyenda; // Atributo

    // Constructor
    public void EstadoFactura(Factura factura, String leyenda) {
        this.factura = factura;
        this.leyenda = leyenda;
    }

    // Operación pagar que recibe un nuevo estado y devuelve un mensaje
    public String pagar(EstadoDeFactura nuevo) {
        // Lógica para realizar el pago y cambiar al nuevo estado
        // ...
        return "Pago realizado. Estado actualizado: " + nuevo.getLeyenda();
    }

    // Operación pagar sin parámetros que devuelve un mensaje
    public String pagar() {
        // Lógica para realizar el pago sin cambiar el estado
        // ...
        return "Pago realizado sin cambios en el estado.";
    }

    // Getter para obtener la leyenda
    public String getLeyenda() {
        return leyenda;
    }
	
	
	
	
	

}
