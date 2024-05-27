
package proyecto.integrador.entidades;
import java.util.InputMismatchException;
import java.util.Scanner;
   
public class Cotizacion {
    public Cotizacion() {
}
    public static void mostrarCotizacion (){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        
        while (!salir){
            System.out.println("\n Digite el tamaño del inmueble:   \n1=Small  \n2=Medium \n3=Big  \n4=Salir");
            
            try{
            opcion = sn.nextInt();
            
                switch (opcion) {
                    case 1:     //Tamaño: Small
                        System.out.println("Digite m2 a construir:  \n1=45m2  \n2=60m2  \n3=74m2");
                        try {
                            opcion = sn.nextInt();
                            switch (opcion) {
                                case 1:     //m2 a construir: 45
                                    System.out.println("Digite linea a construir: \n1= Standar  ($299.000 el m2) \n2= Premium  ($348.000 el m2)\n3= Country  ($420.000 el m2)");
                                    try {
                                        opcion = sn.nextInt();

                                        switch (opcion) {    
                                            case 1:
                                                double ss1 = (45 * 299000);// Precio de 45m2 a construir de Small la linea standar

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((ss1 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 45" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", ss1) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((ss1 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 45" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", ss1) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((ss1 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 45" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", ss1) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            case 2:
                                                double sp1 = (45 * 348000);// Precio de 45m2 a construir de Small la linea premium

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((sp1 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 45" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sp1) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((sp1 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 45" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sp1) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((sp1 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 45" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sp1) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            case 3:
                                                double sc1 = (45 * 420000);// Precio de 45m2 a construir de Small la linea Country

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((sc1 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 45" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sc1) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((sc1 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 45" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sc1) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((sc1 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 45" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sc1) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            default:
                                                System.out.println("Ingrese una opción valida");

                                                }
                                            } catch (InputMismatchException e) {
                                                System.out.println("Debes ingresar una opción valida");
                                                sn.next();
                                            }
                                            break;//m2 a construir: 45
                                            
                                case 2:     //m2 a construir: 60
                                    System.out.println("Digite linea a construir: \n1= Standar  ($299.000 el m2) \n2= Premium  ($348.000 el m2)\n3= Country  ($420.000 el m2)");
                                    try {
                                        opcion = sn.nextInt();

                                        switch (opcion) {    
                                            case 1:
                                                double ss2 = (60 * 299000);// Precio de 60m2 a construir de Small la linea standar

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((ss2 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 60" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", ss2) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((ss2 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 60" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", ss2) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((ss2 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 60" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", ss2) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            case 2:
                                                double sp2 = (60 * 348000);// Precio de 60m2 a construir de Small la linea premium

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((sp2 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 60" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sp2) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((sp2 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 60" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sp2) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((sp2 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 60" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sp2) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            case 3:
                                                double sc3 = (60 * 420000);// Precio de 60m2 a construir de Small la linea Country

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((sc3 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 60" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sc3) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((sc3 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 60" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sc3) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((sc3 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 60" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sc3) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            default:
                                                System.out.println("Ingrese una opción valida");

                                                }
                                            } catch (InputMismatchException e) {
                                                System.out.println("Debes ingresar una opción valida");
                                                sn.next();
                                            }
                                            break;//m2 a construir: 60
                                case 3:     //m2 a construir: 72
                                    System.out.println("Digite linea a construir: \n1= Standar  ($299.000 el m2) \n2= Premium  ($348.000 el m2)\n3= Country  ($420.000 el m2)");
                                    try {
                                        opcion = sn.nextInt();

                                        switch (opcion) {    
                                            case 1:
                                                double ss3 = (60 * 299000);// Precio de 72m2 a construir de Small la linea standar

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((ss3 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 72" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", ss3) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((ss3 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 72" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", ss3) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((ss3 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 72" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", ss3) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            case 2:
                                                double sp3 = (72 * 348000);// Precio de 72m2 a construir de Small la linea premium

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((sp3 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 72" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sp3) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((sp3 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 72" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sp3) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((sp3 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 72" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sp3) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            case 3:
                                                double sc3 = (72 * 420000);// Precio de 72m2 a construir de Small la linea Country

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((sc3 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 72" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sc3) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((sc3 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 72" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sc3) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((sc3 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Small" + "\n# m2 a construir: 72" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sc3) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            default:
                                                System.out.println("Ingrese una opción valida");

                                                }
                                            } catch (InputMismatchException e) {
                                                System.out.println("Debes ingresar una opción valida");
                                                sn.next();
                                            }
                                            break;//m2 a construir: 72
                                default:
                                    System.out.println("Ingrese una opción valida");

                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Debes ingresar una opción valida");
                            sn.next();
                        }
                        break;
 
                case 2:     //Tamaño: MEDIUM    
                        System.out.println("Digite m2 a construir:  \n1=70m2  \n2=88m2  \n3=103m2");
                        try {
                            opcion = sn.nextInt();
                            switch (opcion) {
                                case 1:     //m2 a construir: 70
                                    System.out.println("Digite linea a construir: \n1= Standar  ($299.000 el m2) \n2= Premium  ($348.000 el m2)\n3= Country  ($420.000 el m2)");
                                    try {
                                        opcion = sn.nextInt();

                                        switch (opcion) {    
                                            case 1:
                                                double ms1 = (70 * 299000);// Precio de 70m2 a construir de Medium la linea standar

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((ms1 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 70" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", ms1) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((ms1 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 70" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", ms1) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((ms1 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 70" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", ms1) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            case 2:
                                                double mp1 = (70 * 348000);// Precio de 70m2 a construir de Medium la linea premium

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((mp1 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 70" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", mp1) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((mp1 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 70" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", mp1) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((mp1 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 70" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", mp1) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            case 3:
                                                double mc1 = (70 * 420000);// Precio de 70m2 a construir de Medium la linea Country

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((mc1 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 70" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", mc1) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((mc1 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 70" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", mc1) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((mc1 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 70" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", mc1) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            default:
                                                System.out.println("Ingrese una opción valida");

                                                }
                                            } catch (InputMismatchException e) {
                                                System.out.println("Debes ingresar una opción valida");
                                                sn.next();
                                            }
                                            break;//m2 a construir: 70
                                            
                                case 2:     //m2 a construir: 88
                                    System.out.println("Digite linea a construir: \n1= Standar  ($299.000 el m2) \n2= Premium  ($348.000 el m2)\n3= Country  ($420.000 el m2)");
                                    try {
                                        opcion = sn.nextInt();

                                        switch (opcion) {    
                                            case 1:
                                                double ms2 = (88 * 299000);// Precio de 88m2 a construir de Medium la linea standar

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((ms2 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 88" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", ms2) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((ms2 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 88" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", ms2) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((ms2 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 88" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", ms2) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            case 2:
                                                double mp2 = (88 * 348000);// Precio de 88m2 a construir de Medium la linea premium

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((mp2 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 88" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", mp2) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((mp2 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 88" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", mp2) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((mp2 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 88" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", mp2) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            case 3:
                                                double mc2 = (88 * 420000);// Precio de 88m2 a construir de Medium la linea Country

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((mc2 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 88" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", mc2) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((mc2 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 88" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", mc2) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((mc2 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 88" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", mc2) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            default:
                                                System.out.println("Ingrese una opción valida");

                                                }
                                            } catch (InputMismatchException e) {
                                                System.out.println("Debes ingresar una opción valida");
                                                sn.next();
                                            }
                                            break;//m2 a construir: 88
                                            
                                case 3:     //m2 a construir: 103
                                    System.out.println("Digite linea a construir: \n1= Standar  ($299.000 el m2) \n2= Premium  ($348.000 el m2)\n3= Country  ($420.000 el m2)");
                                    try {
                                        opcion = sn.nextInt();

                                        switch (opcion) {    
                                            case 1:
                                                double ms3 = (103 * 299000);// Precio de 103m2 a construir de Medium la linea standar

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((ms3 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 103" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", ms3) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((ms3 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 103" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", ms3) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((ms3 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 103" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", ms3) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            case 2:
                                                double mp3 = (103 * 348000);// Precio de 103m2 a construir de Medium la linea premium

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((mp3 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 103" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", mp3) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((mp3 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 103" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", mp3) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((mp3 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 103" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", mp3) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            case 3:
                                                double sc3 = (103 * 420000);// Precio de 103m2 a construir de Medium la linea Country

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((sc3 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 103" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sc3) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((sc3 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 103" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sc3) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((sc3 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Medium" + "\n# m2 a construir: 103" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", sc3) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            default:
                                                System.out.println("Ingrese una opción valida");

                                                }
                                            } catch (InputMismatchException e) {
                                                System.out.println("Debes ingresar una opción valida");
                                                sn.next();
                                            }
                                            break;//m2 a construir: 103
                                default:
                                    System.out.println("Ingrese una opción valida");

                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Debes ingresar una opción valida");
                            sn.next();
                        }
                        break;
                    
                case 3:     //Tamaño: BIG    
                        System.out.println("Digite m2 a construir:  \n1=73m2  \n2=92m2  \n3=120m2");
                        try {
                            opcion = sn.nextInt();
                            switch (opcion) {
                                case 1:     //m2 a construir: 73
                                    System.out.println("Digite linea a construir: \n1= Standar  ($299.000 el m2) \n2= Premium  ($348.000 el m2)\n3= Country  ($420.000 el m2)");
                                    try {
                                        opcion = sn.nextInt();

                                        switch (opcion) {    
                                            case 1:
                                                double bs1 = (70 * 299000);// Precio de 73m2 a construir de Big la linea standar

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((bs1 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 73" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bs1) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((bs1 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 73" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bs1) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((bs1 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 73" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bs1) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            case 2:
                                                double bp1 = (73 * 348000);// Precio de 73m2 a construir de Big la linea premium

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((bp1 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 73" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bp1) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((bp1 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 73" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bp1) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((bp1 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 73" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bp1) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            case 3:
                                                double bc1 = (73 * 420000);// Precio de 73m2 a construir de Big la linea Country

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((bc1 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 73" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bc1) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((bc1 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 73" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bc1) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((bc1 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 73" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bc1) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            default:
                                                System.out.println("Ingrese una opción valida");

                                                }
                                            } catch (InputMismatchException e) {
                                                System.out.println("Debes ingresar una opción valida");
                                                sn.next();
                                            }
                                            break;//m2 a construir: 73
                                            
                                case 2:     //m2 a construir: 92
                                    System.out.println("Digite linea a construir: \n1= Standar  ($299.000 el m2) \n2= Premium  ($348.000 el m2)\n3= Country  ($420.000 el m2)");
                                    try {
                                        opcion = sn.nextInt();

                                        switch (opcion) {    
                                            case 1:
                                                double bs2 = (92 * 299000);// Precio de 92m2 a construir de Big la linea standar

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((bs2 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 92" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bs2) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((bs2 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 92" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bs2) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((bs2 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 92" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bs2) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }

                                                        default:
                                                            System.out.println("Ingrese una opción valida");

                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();

                                                }

                                                break;
                                            case 2:
                                                double bp2 = (92 * 348000);// Precio de 92m2 a construir de Big la linea premium
                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((bp2 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 92" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bp2) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((bp2 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 92" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bp2) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((bp2 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 92" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bp2) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        default:
                                                            System.out.println("Ingrese una opción valida");
                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();
                                                }
                                                break;
                                            case 3:
                                                double bc2 = (92 * 420000);// Precio de 92m2 a construir de Medium la linea Country

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();
                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((bc2 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 93" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bc2) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((bc2 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 92" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bc2) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();
                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((bc2 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 92" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bc2) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        default:
                                                            System.out.println("Ingrese una opción valida");
                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();
                                                }
                                                break;
                                            default:
                                                System.out.println("Ingrese una opción valida");
                                                }
                                            } catch (InputMismatchException e) {
                                                System.out.println("Debes ingresar una opción valida");
                                                sn.next();
                                            }
                                            break;//m2 a construir: 92
                                            
                                case 3:     //m2 a construir: 120
                                    System.out.println("Digite linea a construir: \n1= Standar  ($299.000 el m2) \n2= Premium  ($348.000 el m2)\n3= Country  ($420.000 el m2)");
                                    try {
                                        opcion = sn.nextInt();

                                        switch (opcion) {    
                                            case 1:
                                                double bs3 = (120 * 299000);// Precio de 120m2 a construir de Big la linea standar
                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();
                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((bs3 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 120" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bs3) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((bs3 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 120" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bs3) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();
                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((bs3 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 120" + "\n# Linea de construcción: Standar" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bs3) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();
                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        default:
                                                            System.out.println("Ingrese una opción valida");
                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();
                                                }
                                                break;
                                            case 2:
                                                double bp3 = (120 * 348000);// Precio de 120m2 a construir de Big la linea premium
                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((bp3 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 120" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bp3) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();
                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((bp3 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 120" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bp3) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((bp3 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 120" + "\n# Linea de construcción: Premium" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bp3) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        default:
                                                            System.out.println("Ingrese una opción valida");
                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();
                                                }
                                                break;
                                            case 3:
                                                double bc3 = (120 * 420000);// Precio de 120m2 a construir de Big la linea Country

                                                System.out.println("Dijite el plazo de construcción:    \n1= 12 meses   \n2= 24 meses    \n3= 36 meses");
                                                try {
                                                    opcion = sn.nextInt();

                                                    switch (opcion) {
                                                        case 1: {
                                                            double cuotas01 = (((bc3 * 150) / 100) / 12);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 120" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 12 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bc3) + "\n# El monto mensual a pagar en 12 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:50%");
                                                            System.out.println("\n #Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 2: {
                                                            double cuotas01 = (((bc3 * 200) / 100) / 24);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 120" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 24 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bc3) + "\n# El monto mensual a pagar en 24 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:100%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        case 3: {
                                                            double cuotas01 = (((bc3 * 260) / 100) / 36);
                                                            System.out.println("\n# Tamaño del inmueble: Big" + "\n# m2 a construir: 120" + "\n# Linea de construcción: Country" + "\n# Plazo de construcción: 36 meses" + "\n# Al contado la suma a entregar es de: $" + String.format("%.0f", bc3) + "\n# El monto mensual a pagar en 36 cuotas es de: $" + String.format("%.0f", cuotas01) + ". CFT:160%");
                                                            System.out.println("\n Digite una opción: \n1= Desea salir al salir \n2= Generar nueva cotización ");
                                                            try {
                                                                opcion = sn.nextInt();

                                                                switch (opcion) {
                                                                    case 1:
                                                                        salir = true;
                                                                    case 2:
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Debes ingresar una opción valida");
                                                                sn.next();
                                                            }
                                                            break;
                                                        }
                                                        default:
                                                            System.out.println("Ingrese una opción valida");
                                                    }
                                                } catch (InputMismatchException e) {
                                                    System.out.println("Debes ingresar una opción valida");
                                                    sn.next();
                                                }
                                                break;
                                            default:
                                                System.out.println("Ingrese una opción valida");

                                                }
                                            } catch (InputMismatchException e) {
                                                System.out.println("Debes ingresar una opción valida");
                                                sn.next();
                                            }
                                            break;//m2 a construir: 120
                                default:
                                    System.out.println("Ingrese una opción valida");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Debes ingresar una opción valida");
                            sn.next();
                        }
                        break;
                    
                case 4:
                    salir=true;
                    break;
                default:
                    System.out.println("Ingrese una opción valida");  
            }
            }catch(InputMismatchException e){
                System.out.println("Debes ingresar una opción valida");
                sn.next();
            }
        }
        System.out.println("fin");
    }

}


