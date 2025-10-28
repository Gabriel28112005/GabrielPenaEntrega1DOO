package Gestión_colección_filatelia_y_numismática.models;

import java.util.ArrayList;

public class Coleccion {
    private ArrayList<ElementoColeccionable> elementos;




    public void AñadirMonedaColeccion(Moneda moneda) {
        elementos.add(moneda);
    }

    public void AñadirSelloColeccion(Sello sello) {
        elementos.add(sello);
    }

    public void MostrarMonedasColeccion() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Moneda) {
                System.out.println(elemento.toString());
            }
        }
    }

    public void MostrarSellosColeccion() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Sello) {
                System.out.println(elemento.toString());
            }
        }
    }

    public int ObtenerPrecioTotalColeccion(){
        int precioTotal = 0;
        for (ElementoColeccionable elemento : elementos) {
            precioTotal += elemento.getPrecio();
        }
        return precioTotal;

    }

    public int ObtenerRarezaMediaColeccion(){
        int rarezaTotal = 0;
        for (ElementoColeccionable elemento : elementos) {
            rarezaTotal += elemento.getRareza();
        }
        return rarezaTotal / elementos.size();
    }



}
