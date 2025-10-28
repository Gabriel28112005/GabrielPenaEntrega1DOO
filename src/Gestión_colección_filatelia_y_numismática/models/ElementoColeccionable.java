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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAutoridadGobernante() {
        return autoridadGobernante;
    }

    public void setAutoridadGobernante(String autoridadGobernante) {
        this.autoridadGobernante = autoridadGobernante;
    }

    public String getUnidadMonetaria() {
        return unidadMonetaria;
    }

    public void setUnidadMonetaria(String unidadMonetaria) {
        this.unidadMonetaria = unidadMonetaria;
    }

    public int getAnnus() {
        return annus;
    }

    public void setAnnus(int annus) {
        this.annus = annus;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getRareza() {
        return rareza;
    }

    public void setRareza(int rareza) {
        this.rareza = rareza;
    }

    //Crea todos los gets y sets de los atributos




}
