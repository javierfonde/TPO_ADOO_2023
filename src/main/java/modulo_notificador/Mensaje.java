package modulo_notificador;

public class Mensaje {
    private String asunto;
    private String cuerpo;
    private String emisor;

    public Mensaje(String asunto, String cuerpo, String emisor) {
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.emisor = emisor;
    }
    public String toString(){
        return String.format("%1$s: %2$s de %3$s",asunto,cuerpo,emisor);
    }
}
