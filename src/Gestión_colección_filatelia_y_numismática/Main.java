package Gestión_colección_filatelia_y_numismática;

import java.util.Scanner;
import Gestión_colección_filatelia_y_numismática.models.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int respuesta;

        try{
            System.out.println("Tenemos las siguientes opciones: ");
            System.out.println("1. Añadir una nueva moneda");
            System.out.println("2. Añadir un nuevo sello");
            System.out.println("3. Mostrar todas las monedas");
            System.out.println("4. Mostar todos los sellos");
            System.out.println("5. Mostrar el precio total de la colección");
            System.out.println("6. Mostrar la rareza media de la colección");
            System.out.println("0. Salir");
            System.out.print("Qué opción eliges: ");
            respuesta = scanner.nextInt();

            do{
                try{
                    if(respuesta == 1){

                        try{

                            System.out.print("\nDime el país de la moneda: ");
                            String pais = scanner.next();
                            System.out.print("\nDime la autoridad gobernante de la moneda: ");
                            String autoridadGobernante = scanner.next();

                            System.out.print("\nDime la unidad monetaria de la moneda: ");
                            String unidadMonetaria = scanner.next();

                            System.out.print("\nDime el año de la moneda: ");
                            int annus = scanner.nextInt();
                            if (annus <= 0){
                                do {
                                    System.out.print("\nEl año debe ser un valor positivo.\nDime el año de la moneda: ");
                                    annus = scanner.nextInt();
                                }while(annus<=0);
                            }

                            System.out.print("\nDime el valor de la moneda: ");
                            int valor = scanner.nextInt();
                            if (valor <= 0){
                                do {
                                    System.out.print("\nEl valor debe ser un valor positivo.\nDime el valor de la moneda: ");
                                    annus = scanner.nextInt();
                                }while(valor<=0);
                            }

                            System.out.print("\nDime el precio de la moneda: ");
                            int precio = scanner.nextInt();
                            if (precio <= 0){
                                do {
                                    System.out.print("\nEl valor debe ser un valor positivo.\nDime el valor de la moneda: ");
                                    annus = scanner.nextInt();
                                }while(precio<=0);
                            }

                            System.out.print("\nDime la rareza de la moneda (1-10): ");
                            int rareza = scanner.nextInt();
                            if(rareza <1 || rareza >10){
                                do {
                                    System.out.print("\nLa rareza debe estar entre 1 y 10.\nDime la rareza de la moneda (1-10): ");
                                    rareza = scanner.nextInt();
                                } while (rareza < 1 || rareza > 10);
                            }

                            System.out.print("\nDime la composición de la moneda: ");
                            String composicion = scanner.next();

                            System.out.print("\nDime el peso de la moneda (en gramos): ");
                            int peso = scanner.nextInt();
                            if(peso<=0){
                                do{
                                    System.out.print("\nEl peso debe ser un valor positivo.\nDime el peso de la moneda (en gramos): ");
                                    peso = scanner.nextInt();
                                }while(peso<=0);
                            }

                            System.out.print("\nDime el diámetro de la moneda (en mm): ");
                            int diametro = scanner.nextInt();
                            if(diametro<=0){
                                do{
                                    System.out.print("\nEl diámetro debe ser un valor positivo.\nDime el diámetro de la moneda (en mm): ");
                                    diametro = scanner.nextInt();
                                }while(diametro<=0);
                            }

                            System.out.print("\nDime el grosor de la moneda (en mm): ");
                            int grosor = scanner.nextInt();
                            if(grosor<=0){
                                do{
                                    System.out.print("\nEl grosor debe ser un valor positivo.\nDime el grosor de la moneda (en mm): ");
                                    grosor = scanner.nextInt();
                                }while(grosor<=0);
                            }

                            System.out.print("\nDime el estado de conservación de la moneda (G, VG, F, VF, XF, AU, UNC): ");
                            String estadoConservacionStr = scanner.next().toUpperCase();
                            if(!estadoConservacionStr.equals("G") && !estadoConservacionStr.equals("VG") && !estadoConservacionStr.equals("F") && !estadoConservacionStr.equals("VF") && !estadoConservacionStr.equals("XF") && !estadoConservacionStr.equals("AU") && !estadoConservacionStr.equals("UNC")){
                                do{
                                    System.out.print("\nEl estado de conservación debe ser uno de los siguientes: G, VG, F, VF, XF, AU, UNC.\nDime el estado de conservación de la moneda: ");
                                    estadoConservacionStr = scanner.next().toUpperCase();
                                } while (!estadoConservacionStr.equals("G") && !estadoConservacionStr.equals("VG") && !estadoConservacionStr.equals("F") && !estadoConservacionStr.equals("VF") && !estadoConservacionStr.equals("XF") && !estadoConservacionStr.equals("AU") && !estadoConservacionStr.equals("UNC"));
                            }

                            Moneda moneda = new Moneda(pais, autoridadGobernante, unidadMonetaria, annus, valor, precio, rareza, composicion, peso, diametro, grosor, EnumEstadoConservacionMoneda.valueOf(estadoConservacionStr));
                            Coleccion.anadirElemento(moneda);

                        }catch(Exception e){
                            System.out.println("\nSe ha producido un error al crear la moneda. En consecuencia, no se ha podido añadir a la colección.\n\nVolviendo al menú principal...\n");
                            scanner.nextLine();

                        }

                    } else if(respuesta == 2){

                        try{
                            System.out.print("\nDime el país del sello: ");
                            String pais = scanner.next();

                            System.out.print("\nDime la autoridad gobernante del sello: ");
                            String autoridadGobernante = scanner.next();

                            System.out.print("\nDime la unidad monetaria del sello: ");
                            String unidadMonetaria = scanner.next();

                            System.out.print("\nDime el año del sello: ");
                            int annus = scanner.nextInt();
                            if(annus<0){
                                do{
                                    System.out.print("\nEl año debe ser un valor positivo.\nDime el año del sello: ");
                                    annus = scanner.nextInt();
                                }while(annus<0);
                            }

                            System.out.print("\nDime el valor del sello: ");
                            int valor = scanner.nextInt();
                            if(valor<0){
                                do{
                                    System.out.print("\nEl valor debe ser un valor positivo.\nDime el valor del sello: ");
                                    valor = scanner.nextInt();
                                }while(valor<0);
                            }

                            System.out.print("\nDime el precio del sello: ");
                            int precio = scanner.nextInt();
                            if(precio<0){
                                do{
                                    System.out.print("\nEl precio debe ser un valor positivo.\nDime el precio del sello: ");
                                    precio = scanner.nextInt();
                                }while(precio<0);
                            }

                            System.out.print("\nDime la rareza del sello (1-10): ");
                            int rareza = scanner.nextInt();
                            if (rareza < 1 || rareza > 10){
                                do {
                                    System.out.print("\nLa rareza debe estar entre 1 y 10.\nDime la rareza del sello (1-10): ");
                                    rareza = scanner.nextInt();
                                } while (rareza < 1 || rareza > 10);
                            }

                            System.out.print("\nDime la altura del sello (en mm): ");
                            int altura = scanner.nextInt();
                            if(altura<=0){
                                do{
                                    System.out.print("\nLa altura debe ser un valor positivo.\nDime la altura del sello (en mm): ");
                                    altura = scanner.nextInt();
                                }while(altura<=0);
                            }

                            System.out.print("\nDime la anchura del sello (en mm): ");
                            int anchura = scanner.nextInt();
                            if(anchura<=0){
                                do{
                                    System.out.print("\nLa anchura debe ser un valor positivo.\nDime la anchura del sello (en mm): ");
                                    anchura = scanner.nextInt();
                                }while(anchura<=0);
                            }

                            System.out.print("\nQué imagen quieres ponerle al sello: ");
                            String imagen = scanner.next();

                            System.out.print("\nDime el estado de conservación del sello (U, NSG, NF, N): ");
                            String estadoConservacionStr = scanner.next().toUpperCase();
                            if(!estadoConservacionStr.equals("U") && !estadoConservacionStr.equals("NSG") && !estadoConservacionStr.equals("NF") && !estadoConservacionStr.equals("N")){
                                do{
                                    System.out.print("\nEl estado de conservación debe ser uno de los siguientes: U, NSG, NF, N.\nDime el estado de conservación del sello: ");
                                    estadoConservacionStr = scanner.next().toUpperCase();
                                } while (!estadoConservacionStr.equals("U") && !estadoConservacionStr.equals("NSG") && !estadoConservacionStr.equals("NF") && !estadoConservacionStr.equals("N"));
                            }

                            Sello sello = new Sello(pais, autoridadGobernante, unidadMonetaria, annus, valor, precio, rareza, altura, anchura, imagen, EnumEstadoConservacionSello.valueOf(estadoConservacionStr));
                            Coleccion.anadirElemento(sello);

                        }catch(Exception e){
                            System.out.println("\nSe ha producido un error al crear el sello. En consecuencia, no se ha podido añadir a la colección.\n\nVolviendo al menú principal...\n");
                            scanner.nextLine();
                        }

                    } else if(respuesta == 3){
                        try{
                            Coleccion.MostrarMonedas();
                        }catch(Exception e){
                            System.out.println("\nError al mostrar las monedas: " + e.getMessage());
                            scanner.nextLine();
                        }

                    } else if(respuesta == 4){
                        try{
                            Coleccion.MostrarSellos();
                        }catch(Exception e){
                            System.out.println("\nError al mostrar los sellos: " + e.getMessage());
                            scanner.nextLine();
                        }

                    } else if(respuesta == 5){
                        try{
                            int precioTotalColeccion = Coleccion.ObtenerPrecioTotalColeccion();
                            System.out.println("\nEl precio total de la colección es: " + precioTotalColeccion);
                        }catch(Exception e){
                            System.out.println("\nError al calcular el precio total de la colección: " + e.getMessage());
                            scanner.nextLine();
                        }

                    } else if(respuesta == 6){
                        try{
                            double mediaRarezaColeccion = Coleccion.ObtenerRarezaMediaColeccion();
                            System.out.print("La media de la rareza de los objetos en la colección es: " + mediaRarezaColeccion);
                        }catch(Exception e){
                            System.out.print("\nError al calcular la rareza media de la colección: " + e.getMessage());
                            scanner.nextLine();
                        }

                    } else if(respuesta == 0){
                        System.out.print("\nSaliendo...\nSe ha salido y cerrado el programa correctamente");

                    } else{
                        System.out.println("\nOpción no válida. Debe elegir una opción del 0 al 6.");
                    }

                    System.out.println("Tenemos las siguientes opciones: ");
                    System.out.println("1. Añadir una nueva moneda");
                    System.out.println("2. Añadir un nuevo sello");
                    System.out.println("3. Mostrar todas las monedas");
                    System.out.println("4. Mostar todos los sellos");
                    System.out.println("5. Mostrar el precio total de la colección");
                    System.out.println("6. Mostrar la rareza media de la colección");
                    System.out.println("0. Salir");
                    System.out.print("Qué opción eliges: ");
                    respuesta = scanner.nextInt();

                }catch(Exception e){
                    System.out.println("No has ingresado un número.\n");
                    scanner.nextLine();
                }

            }while(respuesta != 0);

        }catch(Exception e){
            System.out.println("No has ingresado un número válido");
            scanner.nextLine();
        }

    }
}