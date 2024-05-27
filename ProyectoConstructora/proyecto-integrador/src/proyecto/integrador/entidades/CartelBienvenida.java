/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.integrador.entidades;

/**
 *
 * @author dev
 */
public class CartelBienvenida {

    public CartelBienvenida() {
    }
    
    public static void mostrarCartelBienvenida() {
        int anchoCartel = 30;
        String textoBienvenida = "         BIENVENIDO         ";
        String textoBienvenida2 = "  CONSTRUCTORA BYTE BUSTER  ";
        int margenSuperior = 2;
        int margenInferior = 2;

        // Imprimir margen superior
        for (int i = 1; i <= margenSuperior; i++) {
            System.out.print(" ");
        }
        System.out.println();

        // Imprimir línea superior del cartel
        for (int i = 0; i < anchoCartel; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Imprimir texto de bienvenida centrado en el cartel
        int espacios = (anchoCartel - textoBienvenida.length()) + 5;
        int espacios2 = (anchoCartel - textoBienvenida2.length()) + 5;
        String textoCentrado = "";

        // Agregar espacios al principio del texto
        for (int i = 1; i <= espacios; i++) {
            textoCentrado += "  ";
        }

        textoCentrado += textoBienvenida;

        // Agregar espacios al final del texto
        for (int i = 1; i <= espacios; i++) {
            textoCentrado += "  ";
        }

        System.out.println("* " + textoCentrado + "  *");

        String textoCentrado2 = "";

        // Agregar espacios al principio del texto
        for (int i = 1; i <= espacios2; i++) {
            textoCentrado2 += "  ";
        }

        textoCentrado2 += textoBienvenida2;

        // Agregar espacios al final del texto
        for (int i = 1; i <= espacios2; i++) {
            textoCentrado2 += "  ";
        }

        System.out.println("* " + textoCentrado2 + "  *");

        // Imprimir línea inferior del cartel
        for (int i = 0; i < anchoCartel; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Imprimir margen inferior
        for (int i = 1; i <= margenInferior; i++) {
            System.out.print(" ");
        }
        System.out.println();
    }
    
}
