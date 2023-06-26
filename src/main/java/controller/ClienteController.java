package controller;

public class ClienteController {
    private static ClienteController controlador;
    public static ClienteController getInstancia(){
        if(controlador==null){
            controlador = new ClienteController();
        }
        return controlador;
    }

    //agregar, eliminar, buscar
    
}
