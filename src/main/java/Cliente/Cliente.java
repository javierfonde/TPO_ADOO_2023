package Cliente;

import java.util.ArrayList;
import java.util.List;

import modulo_notificador.INotificacion;
import modulo_notificador.Mensaje;
import modulo_notificador.Notificador;
import modulo_pagos.Cobrador;
import modulo_pagos.Comprobante;
import modulo_pagos.Factura;
import modulo_reserva.Reserva;

public class Cliente extends Observable {
    private String nombre;
    private String apellido;
    private int dni;
    private int telefono;
    private String email;

    private Notificador notificador;
    private Cobrador cobrador;
    private List<Comprobante> comprobantes;
    private List<Factura> facturas;
    private List<Reserva> reservas;

    public Cliente(String nombre, String apellido, int dni, int telefono, String email, INotificacion medio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.notificador = Notificador.obtenerInstancia(medio);
        this.comprobantes = new ArrayList<>();
        this.facturas = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }


    public void cambiarFormaDeContacto(INotificacion nuevo) {
        this.notificador.cambiarMetodoDeNotificacion(nuevo);
    }

    public void cambiarFormaDePago(Cobrador nueva) {
        this.cobrador = nueva;
    }
    
    public void pagar(Factura factura) {
        this.facturas.add(factura);
        this.cobrador.cobrar(factura);
    }
     

    public boolean soyElCliente(int dni) {
        return this.dni == dni;
    }

    @Override
    public String notificar(String cuerpoMensaje) {
        Mensaje mensaje = new Mensaje(this.nombre+" "+this.apellido , this.email, cuerpoMensaje);
        this.notificador.notificar(this, mensaje);
        return "Notificación enviada al cliente: " + this.nombre + " " + this.apellido;
    }

	public String getNombre() {
		return this.nombre;
	}
}
