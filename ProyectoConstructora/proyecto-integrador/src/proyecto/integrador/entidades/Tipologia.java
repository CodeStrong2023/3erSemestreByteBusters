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
public class Tipologia {

    public static void tipologia() {

        Scanner leer = new Scanner(System.in);
        int opcion;

        System.out.println("\n\n************************************    TIPOLOGÍA    ************************************");

        do {

            System.out.println("Contamos con una amplia variedad de tipologías de viviendas para satisfacer tus necesidades: \n"
                    + "1. Small Home \n"
                    + "2. Medium Home \n"
                    + "3. Big Home \n"
                    + "4. Volver al menú principal");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("\n=========================================================================================\n"
                            + "*** SMALL HOME *** \n"
                            + "Esta Tipología cuenta con cocina integrada al comedor y sala de estar, dormitorio y baño, generando un nucleo de zona nocturna \n"
                            + "'diferenciada de la zona diurna y de servicio.\n"
                            + "\n  PODEMOS OPTAR POR: \n"
                            + "* 45m2 1 dormitorio \n"
                            + "* 60m2 2 dormitorios \n"
                            + "* 74m2 3 dormitorios");
                    String[][] metro = new String[4][1];
                    metro[0][0] = "   45m2";
                    metro[1][0] = "   60m2";
                    metro[2][0] = "   74m2";

                    for (int i = 1; i <= 1; i++) {
                        System.out.println(" _______________________________");
                        System.out.println(" | BYTE BUSTER   |  Small Home |");
                        System.out.println(" |---------------|--------------|");
                        System.out.println(" | 1 Dormitorio :| " + metro[0][0] + "      |");
                        System.out.println(" | 2 Dormitorios:| " + metro[1][0] + "      |");
                        System.out.println(" | 3 Dormitorios:| " + metro[2][0] + "      |");
                        System.out.println(" |_______________|______________|");
                        System.out.println("===========================================================================================");
                    }
                    System.out.println("");

                    break;

                case 2:

                    System.out.println("\n=========================================================================================\n"
                            + "*** MEDIUM HOME *** \n"
                            + "Esta Tipología cuenta con cocina integrada al comedor y sala de estar \n"
                            + "\n  PODEMOS OPTAR POR: \n"
                            + "* 70m2 1 dormitorio \n"
                            + "* 88m2 2 dormitorios \n"
                            + "* 103m2 3 dormitorios");
                    String[][] metro2 = new String[4][1];
                    metro2[0][0] = "   70m2";
                    metro2[1][0] = "   88m2";
                    metro2[2][0] = "   103m2";
                    
                    for (int i = 1; i <= 1; i++) {
                        System.out.println(" _______________________________");
                        System.out.println(" | BYTE BUSTER   |  Medium Home |");
                        System.out.println(" |---------------|--------------|");
                        System.out.println(" | 1 Dormitorio :| " + metro2[0][0] + "      |");
                        System.out.println(" | 2 Dormitorios:| " + metro2[1][0] + "      |");
                        System.out.println(" | 3 Dormitorios:| " + metro2[2][0] + "      |");
                        System.out.println(" |_______________|______________|");
                        System.out.println("========================================================================================");
                    }
                    System.out.println("");

                    break;             
                case 3:

                    System.out.println("\n=========================================================================================\n"
                            + "*** BIG HOME *** \n"
                            + "Esta tipología , cuenta con una cocina integrada al comedor y sala de estar, con la opción de optar por 1, 2 o 3 dormitorios  \n"
                            + "amplios y baño. Baño principal con antebaño y posibilidad de lavandería + toilette.\n"
                            + "\n  PODEMOS OPTAR POR: \n"
                            + "* 73m2 1 dormitorio \n"
                            + "* 92m2 2 dormitorios \n"
                            + "* 120m2 3 dormitorios\n");
                    String[][] metro3 = new String[4][1];
                    metro3[0][0] = "   73m2";
                    metro3[1][0] = "   92m2";
                    metro3[2][0] = "   120m2";

                    for (int i = 1; i <= 1; i++) {
                        System.out.println(" _______________________________");
                        System.out.println(" | BYTE BUSTER   |  Big Home |");
                        System.out.println(" |---------------|--------------|");
                        System.out.println(" | 1 Dormitorio :| " + metro3[0][0] + "      |");
                        System.out.println(" | 2 Dormitorios:| " + metro3[1][0] + "      |");
                        System.out.println(" | 3 Dormitorios:| " + metro3[2][0] + "      |");
                        System.out.println(" |_______________|______________|");
                        System.out.println("==========================================================================================");
                    }
                    System.out.println("");

                    break;
                case 4:
                    System.out.println("Vuelves al menú principal");
                    System.out.println("");
                    break;
                default:
                System.out.println("No corresponde a una opción válida.");
                    System.out.println("");
            }
     } while (opcion != 4); 
}
}
