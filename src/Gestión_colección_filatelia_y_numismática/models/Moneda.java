package Gestión_colección_filatelia_y_numismática.models;

public class Moneda extends ElementoColeccionable {
    private String composicion;
    private int peso, diametro, grosor;
    private EnumEstadoConservacionMoneda estadoConservacion;

    public Moneda(String pais, String autoridadGobernante, String unidadMonetaria, int annus, int valor, int precio, int rareza, String composicion, int peso, int diametro, int grosor, EnumEstadoConservacionMoneda estadoConservacion) {
       super(pais, autoridadGobernante, unidadMonetaria, annus, valor, precio, rareza);
        this.composicion = composicion;
        this.peso = peso;
        this.diametro = diametro;
        this.grosor = grosor;
        this.estadoConservacion = estadoConservacion;
    }

    @Override
    public String toString() {
        return "Moneda{ " +
                "pais: " + pais +
                ", autoridadGobernante: " + autoridadGobernante +
                ", unidadMonetaria: " + unidadMonetaria +
                ", annus: " + annus +
                ", valor: " + valor +
                ", precio: " + precio +
                ", rareza: " + rareza +
                " }";
    }


}
