package Gestión_colección_filatelia_y_numismática.models;

import java.util.ArrayList;

public class Coleccion {
    private static ArrayList<ElementoColeccionable> elementos = new ArrayList<>();





    public static void anadirElemento(ElementoColeccionable elemento) {
        elementos.add(elemento);
    }
    public static void MostrarMonedas() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Moneda) {
                int i=1;
                System.out.println(i + elemento.toString());
                i++;
            } else{
                System.out.print("No hay ninguna moneda en la lista.");
            }
        }
    }

    public static void MostrarSellos() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Sello) {
                int i=1;
                System.out.println(i + elemento.toString());
                i++;
            } else{
                System.out.print("No hay ningun sello en la lista");
            }
        }
    }

    public static int ObtenerPrecioTotalColeccion(){
        int precioTotal = 0;
        for (ElementoColeccionable elemento : elementos) {
            precioTotal += elemento.getPrecio();
        }
        return precioTotal;

    }

    public static int ObtenerRarezaMediaColeccion(){
        int rarezaTotal = 0;
        for (ElementoColeccionable elemento : elementos) {
            rarezaTotal += elemento.getRareza();
        }
        return rarezaTotal / elementos.size();
    }



}
