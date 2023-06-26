package controller;

import modulo_habitacion.*;

import java.util.ArrayList;

public class PaqueteController {
    private static PaqueteController controlador;
    private ArrayList<Paquete> paquetes = new ArrayList<Paquete>();
    public static PaqueteController getInstancia(){
        if(controlador==null){
            controlador = new PaqueteController();
        }
        return controlador;
    }
    public void agregarPaquete(Paquete paquete){
        paquetes.add(paquete);
    }
    public Paquete buscarPaquete(int nroPaquete){
        for (int i = 0; i < paquetes.size(); i++) {
            if (paquetes.get(i).getNroPaquete()==nroPaquete){
                return paquetes.get(i);
            }
        }
        return null;
    }

    public double calcularCosto(int nroPaquete){
        Paquete paquete = buscarPaquete(nroPaquete);
        return paquete.calcularCostos();
    }
    private double consultarCostoServicios(String nombreServicio){
        return 43;
    }
    public void actualizar(int nroPaquete,ArrayList<String> cambiarServicio){
        Paquete paquete = buscarPaquete(nroPaquete);
        if(cambiarServicio.get(0).equals("agregar")){
            switch (cambiarServicio.get(1)){
                case "internet":
                    paquete.agregarItem(new Internet(this.consultarCostoServicios("internet")));
                    break;
                case "tv":
                    paquete.agregarItem(new TV(this.consultarCostoServicios("tv")));
                    break;
                default:
                    //si no existe el servicio en la lista se cobra precio de un despertador
                    paquete.agregarItem(new Despertador(this.consultarCostoServicios("despertador")));
            }
        }
        else{
            switch (cambiarServicio.get(1)){
                case "internet":
                    paquete.quitarItem(new Internet(this.consultarCostoServicios("internet")));
                    break;
                case "tv":
                    paquete.quitarItem(new TV(this.consultarCostoServicios("tv")));
                    break;
                default:
                    //si no existe el servicio en la lista no se quita nada
                    return;
            }
        }
    }





}
