import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true){ // Ciclo infinito
            System.out.println("******** Aplicación Calculadora ********");
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(entrada.nextLine());
                if (operacion >= 1 && operacion <= 4) {
                ejecutarOperacion(operacion, entrada);
                } // Fin If
                else if (operacion == 5) {
                    System.out.println("Hasta Pronto");
                    break; // Rompe el ciclo y sale
                } else {
                    System.out.println("Opción errónea: " + operacion);
                }
                //Imprimimos un salto de línea antes de repetir el menú
                System.out.println();
            } catch (Exception e){ // Fin del try comienza del catch
                System.out.println("Ocurrió un error: "+e.getMessage());
                System.out.println();
            }
        } // Fin while
    } // Fin Main

    private static void mostrarMenu(){
        //Mostramos el Menú
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    """);
        System.out.print("¿Operación a realizar? ");
    } //Fin método mostrarMenu()

    private static void ejecutarOperacion(int operacion, Scanner entrada){
        System.out.print("Digite el valor para el operando1: ");
        var operando1 = Double.parseDouble(entrada.nextLine());
        System.out.print("Digite el valor para el operando2: ");
        var operando2 = Double.parseDouble(entrada.nextLine());

        Double resultado;
        switch (operacion) {

            case 1 -> {  //SUMA
                resultado = operando1 + operando2;
                System.out.println("Resultado de la suma: " + resultado);
            }
            case 2 -> { //RESTA
                resultado = operando1 - operando2;
                System.out.println("Resultado de la resta: " + resultado);
            }
            case 3 -> {//MULTIPLICACIÓN
                resultado = operando1 * operando2;
                System.out.println("Resultado de la multiplicación: " + resultado);
            }
            case 4 -> {//DIVISIÓN
                resultado = operando1 / operando2;
                System.out.println("Resultado de la división: " + resultado);
            }
            case 5 -> {
                break;
            }
            default -> System.out.println("Opción errónea: " + operacion);
        } //Fin switch
    } //Fin método ejecutarOperacion()

} //Fin clase
