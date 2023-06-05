import java.util.ArrayList;
import java.util.List;

import modulo_reserva.Reserva;

public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private int telefono;
    private String email;
    /*
     * private Notificador notificador;
     * private Cobrador cobrador;
     * private List<Comprobante> comprobantes;
     * private List<Factura> facturas;
     */
    private List<Reserva> reservas;

    public Cliente(String nombre, String apellido, int dni, int telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        /*
         * this.comprobantes = new ArrayList<>();
         * this.facturas = new ArrayList<>();
         */
        this.reservas = new ArrayList<>();
    }

    /*
     * public void cambiarFormaDeContacto(Notificador nueva) {
     * this.notificador = nueva;
     * }
     * 
     * public void cambiarFormaDePago(Cobrador nueva) {
     * this.cobrador = nueva;
     * }
     * 
     * public void pagar(Factura factura) {
     * this.facturas.add(factura);
     * this.cobrador.cobrar(factura);
     * }
     */

    public boolean soyElCliente(int dni) {
        return this.dni == dni;
    }
}
