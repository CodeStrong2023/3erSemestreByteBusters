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
public class MenuPrincipal {
    
    
    public static void MostrarMenu() {
        
        Scanner leer3 = new Scanner(System.in);
        int opcion3;

        do {
            System.out.println("------ MENÚ PRINCIPAL------ \n"
                    + "1. Inicio \n"
                    + "2. Nosotros \n"
                    + "3. Tipologia \n"
                    + "4. Cotiza tu vivienda propia \n"
                    + "5. Contrato \n"
                    + "6. Contactos \n"
                    + "7. Salir \n"
                    + "Seleccione una opción: ");

            opcion3 = leer3.nextInt();

            switch (opcion3) {
                case 1:
                    Inicio.inicio();
                    break;
                case 2:
                    Nosotros.nosotros();
                    break;
                case 3:
                    Tipologia.tipologia();
                    break;
                case 4:
                    Cotizacion.mostrarCotizacion();
                    break;
                case 5:
                    Contrato.contrato();
                    break;
                case 6:
                    Contacto.contactanos();
                    break;
                case 7:
                    System.out.println("Gracias por elegirnos!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion3 != 7);

    }
    
}
