/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.integrador.entidades;

import java.util.Scanner;


/**
 *
 * @author dev
 */
public class Contrato {
    
    
     public static void contrato() {
 
         Scanner sc = new Scanner(System.in);

        System.out.println("************************************    CONTRATO    ************************************\n\n");
        
        String dni, apellido, nombre, ocupacion, estadoCivil, localidad, provincia, tipologia, lineaConstructiva, lote, fechaNacimiento, fechaInicio, observaciones, fechaPago;
        int telefonoFijo, celular, superficie, precioFinal, codigoPostal, antiguedad, ingresoMensual,  valorNominal, pagoInicial, aporteMensual;

        
        System.out.print("Ingresar datos de Adherente:");
        System.out.println("");

        for (int i = 1; i <= 1; i++) {
            
            System.out.println("");
            System.out.println("Adherente N°" + i + ":");
            
            System.out.println("Ingresar el Apellido:");
            apellido = sc.nextLine();
            
            System.out.println("Ingresar el Nombre:");
            nombre = sc.nextLine();
            
            System.out.println("Ingresar dni (ej 34434321):");
            dni = sc.nextLine();
            
            System.out.println("Ingresar fecha de nacimiento (ej. 12 12 2023):");
            fechaNacimiento = sc.nextLine();
            
            System.out.println("Ingresar estado civil:");
            estadoCivil = sc.nextLine();
            
            System.out.println("Ingresar ocupacion:");
            ocupacion = sc.nextLine();
            
            System.out.println("Ingresar antiguedad (en numero):");
            antiguedad = Integer.parseInt(sc.nextLine());
            
            System.out.println("Ingresar ingresos mensuales:");
            ingresoMensual = Integer.parseInt(sc.nextLine());
            
            System.out.println("Ingrese localidad:");
            localidad = sc.nextLine();
            
            System.out.println("Ingresar codigo postal:");
            codigoPostal = Integer.parseInt(sc.nextLine());
            
            System.out.println("Ingresar provincia:");
            provincia = sc.nextLine();
            
            System.out.println("Ingresar telefono fijo:");
            telefonoFijo = Integer.parseInt(sc.nextLine());
            
            System.out.println("Ingresar celular:");
            celular = Integer.parseInt(sc.nextLine());
            System.out.println("");
            
            System.out.println("Ingrese tipologia elegida:");
            tipologia = sc.nextLine();
            
            System.out.println("Ingrese superficie:");
            superficie = Integer.parseInt(sc.nextLine());
            
            System.out.println("Ingrese si posee lote (si/no):");
            lote = sc.nextLine();
            
            System.out.println("Ingrese linea constructiva:");
            lineaConstructiva = sc.nextLine();
            
            System.out.println("Ingrese valor nominal en pesos:");
            valorNominal = Integer.parseInt(sc.nextLine());
            System.out.println("");
            
            System.out.println("Ingrese fecha de inicio de trabajo:");
            fechaInicio = sc.nextLine();
            
            System.out.println("Ingrese observaciones:");
            observaciones = sc.nextLine();
            
            System.out.println("Pago Inicial:");
            pagoInicial = Integer.parseInt(sc.nextLine());
            
            System.out.println("Aporte Mensual:");
            aporteMensual = Integer.parseInt(sc.nextLine());
            
            System.out.println("Fecha de Pago:");
            fechaPago = sc.nextLine();

            System.out.println("\nDatos de Adherente: \n"
                    + "Apellido y Nombre: " + apellido + " " + nombre + "\n"
                    + "DNI: " + dni +"\n"
                    + "Fecha de Nacimiento:  " + fechaNacimiento + "\n"
                    + "Estado Civil: " + estadoCivil + "\n"
                    + "Ocupacion:            " + ocupacion + "\n"
                    + "Antiguedad:  " + antiguedad + " años\n"
                    + "Ingreso mensual:      $" + ingresoMensual + "\n"
                    + "Localidad:   " + localidad + "\n"
                    + "Codigo Postal: " + codigoPostal + "\n"
                    + "Provincia:  " + provincia + "\n"
                    + "Telefono Fijo  " + telefonoFijo + "\n"
                    + "Celular:   " + celular + "\n"
                    + "Tipologia Elegida:  " + tipologia + "\n"
                    + "Superficie:  " + superficie + "m2 \n"
                    + "Lote:  " + lote + "\n"
                    + "Linea constructiva:   " + lineaConstructiva + "\n"
                    + "Valor Nominal Total Proyecto en Pesos:  $" + valorNominal + "\n"
                    + "INICIO TAREAS:  " + fechaInicio + "\n"
                    + "Observaciones:  " + observaciones + "\n"
                    + "Pago Inicial:   $" + pagoInicial + "\n"
                    + "Aporte Mensual:  $" + aporteMensual + "\n"
                    + "Fecha de Pago:   " + fechaPago + "\n\n");
        }

        System.out.println("********************************************************************************************");

       
    }
    
}
