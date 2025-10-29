package Gestión_colección_filatelia_y_numismática;

import java.util.Scanner;
import Gestión_colección_filatelia_y_numismática.models.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int respuesta;




        try{


            System.out.println("Por favor, elige una opción: ");
            System.out.println("1. Añadir una nueva moneda");
            System.out.println("2. Añadir un nuevo sello");
            System.out.println("3. Mostrar todas las monedas");
            System.out.println("4. Mostar todos los sellos");
            System.out.println("5. Mostrar el precio total de la colección");
            System.out.println("6. Mostrar la rareza media de la colección");
            System.out.println("0. Salir");
            respuesta = scanner.nextInt();

            do{
                try{
                    System.out.println("Por favor, elige una opción: ");
                    System.out.println("1. Añadir una nueva moneda");
                    System.out.println("2. Añadir un nuevo sello");
                    System.out.println("3. Mostrar todas las monedas");
                    System.out.println("4. Mostar todos los sellos");
                    System.out.println("5. Mostrar el precio total de la colección");
                    System.out.println("6. Mostrar la rareza media de la colección");
                    System.out.println("0. Mostrar todas las monedas");
                    respuesta = scanner.nextInt();

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
                            do {
                                if(rareza < 1 || rareza > 10){
                                    System.out.print("\nLa rareza debe estar entre 1 y 10.\nDime la rareza de la moneda (1-10): ");
                                    rareza = scanner.nextInt();
                                }
                            } while (rareza < 1 || rareza > 10);

                            System.out.print("\nDime la composición de la moneda: ");
                            String composicion = scanner.next();



                            System.out.print("\nDime el peso de la moneda (en gramos): ");
                            int peso = scanner.nextInt();
                            do{
                                if(peso<=0){
                                    System.out.print("\nEl peso debe ser un valor positivo.\nDime el peso de la moneda (en gramos): ");
                                    peso = scanner.nextInt();
                                }
                            }while(peso<=0);



                            System.out.print("\nDime el diámetro de la moneda (en mm): ");
                            int diametro = scanner.nextInt();
                            do{
                                if(diametro<=0){
                                    System.out.print("\nEl diámetro debe ser un valor positivo.\nDime el diámetro de la moneda (en mm): ");
                                    diametro = scanner.nextInt();
                                }
                            }while(diametro<=0);

                            System.out.print("\nDime el grosor de la moneda (en mm): ");
                            int grosor = scanner.nextInt();
                            do{
                                if(grosor<=0){
                                    System.out.print("\nEl grosor debe ser un valor positivo. Dime el grosor de la moneda (en mm): ");
                                    grosor = scanner.nextInt();
                                }
                            }while(grosor<=0);

                            System.out.print("\nDime el estado de conservación de la moneda (G, VG, F, VF, XF, AU, UNC): ");
                            String estadoConservacionStr = scanner.next().toUpperCase();
                            do{
                                if(!estadoConservacionStr.equals("G") && !estadoConservacionStr.equals("VG") && !estadoConservacionStr.equals("F") && !estadoConservacionStr.equals("VF") && !estadoConservacionStr.equals("XF") && !estadoConservacionStr.equals("AU") && !estadoConservacionStr.equals("UNC")){
                                    System.out.print("\nEl estado de conservación debe ser uno de los siguientes: G, VG, F, VF, XF, AU, UNC.\nDime el estado de conservación de la moneda: ");
                                    estadoConservacionStr = scanner.next().toUpperCase();
                                }
                            } while (!estadoConservacionStr.equals("G") && !estadoConservacionStr.equals("VG") && !estadoConservacionStr.equals("F") && !estadoConservacionStr.equals("VF") && !estadoConservacionStr.equals("XF") && !estadoConservacionStr.equals("AU") && !estadoConservacionStr.equals("UNC"));

                            Moneda moneda = new Moneda(pais, autoridadGobernante, unidadMonetaria, annus, valor, precio, rareza, composicion, peso, diametro, grosor, EnumEstadoConservacionMoneda.valueOf(estadoConservacionStr));

                        }catch(Exception e){
                            System.out.println("Ha ingresado un parámetro incorrecto.\nVolviendo al menú principal ");
                            break;
                        }

                    } else if(respuesta == 2){

                        try{
                            System.out.print("\nDime el país de la moneda: ");
                            String pais = scanner.next();
                            System.out.print("\nDime la autoridad gobernante de la moneda: ");
                            String autoridadGobernante = scanner.next();
                            System.out.print("\nDime la unidad monetaria de la moneda: ");
                            String unidadMonetaria = scanner.next();
                            System.out.print("\nDime el año de la moneda: ");
                            int annus = scanner.nextInt();
                            System.out.print("\nDime el valor de la moneda: ");
                            int valor = scanner.nextInt();
                            System.out.print("\nDime el precio de la moneda: ");
                            int precio = scanner.nextInt();
                            System.out.print("\nDime la rareza de la moneda (1-10): ");
                            int rareza = scanner.nextInt();
                            do {
                                if(rareza < 1 || rareza > 10){
                                    System.out.print("\nLa rareza debe estar entre 1 y 10. Dime la rareza de la moneda (1-10): ");
                                    rareza = scanner.nextInt();
                                }
                            } while (rareza < 1 || rareza > 10);


                        }catch(Exception e){
                            System.out.println("Error al crear el sello: " + e.getMessage());
                        }











                    } else if(respuesta == 3){

                    } else if(respuesta == 4){

                    } else if(respuesta == 5){

                    } else if(respuesta == 6){

                    } else if(respuesta == 0){
                        System.out.print("\nSaliendo...");
                        break;
                    } else{
                        System.out.println("Opción no válida");
                    }


                }catch(Exception e){
                    System.out.println("No has ingresado un número\n");
                }

            }while(respuesta != 0);



        }catch(Exception e){
            System.out.println("No has ingresado un número válido");
        }







    }
}