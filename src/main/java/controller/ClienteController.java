package controller;

import Cliente.Cliente;
import modulo_habitacion.Habitacion;
import modulo_habitacion.Paquete;
import modulo_notificador.INotificacion;
import modulo_pagos.Cobrador;
import modulo_pagos.Factura;
import modulo_reserva.Reserva;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class ClienteController {
    private static ClienteController controlador;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public static ClienteController getInstancia(){
        if(controlador==null){
            controlador = new ClienteController();
        }
        return controlador;
    }
    public void agregarCliente(String nombre, String apellido, int dni, int telefono, String email, INotificacion medio){
        Cliente cliente = new Cliente(nombre,apellido,dni,telefono,email,medio);
        clientes.add(cliente);
    }
    public Cliente buscarCliente(int dni){
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).soyElCliente(dni)){
                return clientes.get(i);
            }
        }
        return null;
    }
    public void cambiarFormaDeContacto(int dniCliente,INotificacion nuevo) {
        Cliente cliente = buscarCliente(dniCliente);
        cliente.cambiarFormaDeContacto(nuevo);
    }
    public void cambiarFormaDePago(int dniCliente,Cobrador nueva) {
        Cliente cliente = buscarCliente(dniCliente);
        cliente.cambiarFormaDePago(nueva);
    }
    public void pagar(int dniCliente,Factura factura) {
        Cliente cliente = buscarCliente(dniCliente);
        cliente.pagar(factura);
    }
    public String notificar(int dniCliente,String cuerpoMensaje){
        Cliente cliente = buscarCliente(dniCliente);
        return cliente.notificar(cuerpoMensaje);
    }
   public Reserva reservar(int dniCliente,int nroPaquete){
        Cliente cliente = buscarCliente(dniCliente);
        Paquete paquete = PaqueteController.getInstancia().buscarPaquete(nroPaquete);
        cliente.notificar("Reserva nro " +nroPaquete +  " creada exitosamente y aguarda pago");
        return new Reserva(nroPaquete,new Date(),new Date(),cliente);
   }



    
}
