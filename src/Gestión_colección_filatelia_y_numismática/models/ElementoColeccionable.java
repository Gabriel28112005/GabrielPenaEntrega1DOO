package Gestión_colección_filatelia_y_numismática.models;

public abstract class ElementoColeccionable {
    protected String pais, autoridadGobernante, unidadMonetaria;
    protected int annus, valor, precio, rareza;

    public ElementoColeccionable(String pais, String autoridadGobernante, String unidadMonetaria, int annus, int valor, int precio, int rareza) {
        this.pais = pais;
        this.autoridadGobernante = autoridadGobernante;
        this.unidadMonetaria = unidadMonetaria;
        this.annus = annus;
        this.valor = valor;
        this.precio = precio;
        this.rareza = rareza;
    }

    public int getPrecio() {
        return precio;
    }

    public int getRareza() {
        return rareza;
    }
    //Crea todos los gets y sets de los atributos




}
