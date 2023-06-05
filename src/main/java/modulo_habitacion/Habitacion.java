package modulo_habitacion;

import java.util.List;

public class Habitacion extends Combinable{
	private EstadoHabitacion estado;
	private List<Servicio> servicios;
	private int cantidadPersonas;
	private double costoBase;
	private TipoHabitacion tipo;
	private int nroDeHabitacion;
	
	protected Habitacion(Habitacion habitacion) {
		this.estado= habitacion.estado;
		this.servicios= habitacion.servicios;
		this.cantidadPersonas=habitacion.cantidadPersonas;
		this.costoBase=habitacion.costoBase;
		this.tipo=habitacion.tipo;
		this.nroDeHabitacion=habitacion.nroDeHabitacion;
	}
	
	public Habitacion(int nro, int personas, double costoBase, TipoHabitacion tipo) {
		this.estado = new Disponible();
		this.nroDeHabitacion = nro;
		this.cantidadPersonas = personas;
		this.costoBase = costoBase;
		this.tipo = tipo;
	}
	public EstadoHabitacion getEstado() {
		return this.estado;
	}
	public void cambiarEstado() {
		if(this.estado.getClass()==Disponible.class) {
			this.estado=new Reservada();
		}else {
			this.estado=new Disponible();
		}
	}
	public void agregarServicio(Servicio nuevo) {
		this.servicios.add(nuevo);
	}
	public void quitarServicio(Servicio retirar) {
		this.servicios.remove(retirar);
	}
	@Override
	public boolean admiteReserva() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public double calcularCostos() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean equals(Object o) {		
		return true;
	}
	public int getCantidaDePersonas() {
		return this.cantidadPersonas;
	}
	
	public double getCostoBase() {
        return this.costoBase;
    }
}