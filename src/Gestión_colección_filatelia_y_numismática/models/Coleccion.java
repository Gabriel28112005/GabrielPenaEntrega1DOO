package Gestión_colección_filatelia_y_numismática.models;

import java.util.ArrayList;

public class Coleccion {
    private static ArrayList<ElementoColeccionable> elementos;




    public static void AnadirMoneda(Moneda moneda) {
        elementos.add(moneda);
    }

    public static void AnadirSello(Sello sello) {
        elementos.add(sello);
    }

    public static void MostrarMonedasColeccion() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Moneda) {
                System.out.println(elemento.toString());
            }
        }
    }

    public static void MostrarSellosColeccion() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Sello) {
                System.out.println(elemento.toString());
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
