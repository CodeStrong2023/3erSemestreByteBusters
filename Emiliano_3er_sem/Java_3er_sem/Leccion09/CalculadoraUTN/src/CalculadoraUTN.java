import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner patron = new Scanner(System.in);
        while (true) {
            System.out.println("------ App Calculadora ------");
            System.out.println(" ");//Salto de linea
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(patron.nextLine());
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, patron);
                } else if (operacion == 5) {
                    System.out.println("Ha salido correctamente");
                    break;
                } else {
                    System.out.println("Opción incorrecta:" + operacion);
                }
                System.out.println(" ");//Salto de linea
            }/*Fin try*/ catch (Exception e){
                System.out.println("Error: " + e.getMessage());
                System.out.println(" ");//Salto de linea
            }
        }//Fin while
    }//Fin main

    private static void mostrarMenu(){
        System.out.println("""
                    1- Sumar
                    2- Restar
                    3- Multiplicar
                    4- Dividir
                    5- Salir
                    """);
        System.out.print("Que desea hacer: ");
    }

    private static void ejecutarOperacion(int operacion, Scanner patron){
        System.out.print("Coloque su primer número: ");
        var operando1 = Double.parseDouble(patron.nextLine());
        System.out.print("Coloque su segundo número: ");
        var operando2 = Double.parseDouble(patron.nextLine());
        double res;
        switch (operacion) {
            case 1 -> {
                res = operando1 + operando2;
                System.out.println("Resultado: " + res);
            }
            case 2 -> {
                res = operando1 - operando2;
                System.out.println("Resultado: " + res);
            }
            case 3 -> {
                res = operando1 * operando2;
                System.out.println("Resultado: " + res);
            }
            case 4 -> {
                res = operando1 / operando2;
                System.out.println("Resultado: " + res);
            }
            default -> System.out.println("Opción incorrecta: " + operacion);
        }
    }
}//Fin clase
