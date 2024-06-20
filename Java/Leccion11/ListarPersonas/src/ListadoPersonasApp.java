import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        //Empezamos con el menú
        var salir = false;
        while(!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(entrada, personas);
            } catch (Exception e){
                System.out.println("Ocurrió un error: "+e.getMessage());
            }
            System.out.println();
        }//fin ciclo while
    }//fin método main

    private static void mostrarMenu(){
        //mostramos las opciones
        System.out.println("""
                ******** Listado de Personas *******
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Digite una de las opciones: ");
    }//fin de metodo mostrarMenu
    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
        //Revisamos la opción digitada a través de un switch
        switch (opcion){
            case 1 -> {//Agregar una persona a la lista
                System.out.print("Digite el nombre: ");
                var nombre = entrada.nextLine();
                System.out.print("Digite el telefono: ");
                var telefono = entrada.nextLine();
                System.out.print("Digite el correo: ");
                var email = entrada.nextLine();
                //creamos el objeto persona
                var persona = new Persona(nombre, telefono, email);
                //Agregamos la persona a la lista
                personas.add(persona);
                System.out.println("La lista tiene: "+personas.size()+" elementos");
            }//fin del caso 1
            case 2 -> {//Listar a las personas
                System.out.println("Listado de personas");
                //Mejoras con labda y el método de referencia
                //personas.forEach((persona) -> System.out.println(persona));
                personas.forEach(System.out::println);
            }//fin del caso 2
            case 3 -> {//Salir del ciclo
                System.out.println("Hasta Pronto...");
                salir = true;
            }//fin del caso 3
            default -> System.out.println("Opción incorrecta: "+opcion);
        }//fin del switch
        return salir;
    }//fin del método ejecutarOperacion

}//fin clase ListadoPersonasApp