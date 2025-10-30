package Gestión_colección_filatelia_y_numismática.models;

public class Sello extends ElementoColeccionable{
    private int altura, anchura;
    private String imagen;
    private EnumEstadoConservacionSello estadoConservacion;

    public Sello(String pais, String autoridadGobernante, String unidadMonetaria, int annus, int valor, int precio, int rareza, int altura, int anchura, String imagen, EnumEstadoConservacionSello estadoConservacion) {
        super(pais, autoridadGobernante, unidadMonetaria, annus, valor, precio, rareza);
        this.altura = altura;
        this.anchura = anchura;
        this.imagen = imagen;
        this.estadoConservacion = estadoConservacion;
    }

    @Override
    public String toString() {
        return "Sello{" +
                "pais='" + pais + '\'' +
                ", autoridadGobernante='" + autoridadGobernante + '\'' +
                ", unidadMonetaria='" + unidadMonetaria + '\'' +
                ", annus=" + annus +
                ", valor=" + valor +
                ", precio=" + precio +
                ", rareza=" + rareza +
                '}';
    }

}
