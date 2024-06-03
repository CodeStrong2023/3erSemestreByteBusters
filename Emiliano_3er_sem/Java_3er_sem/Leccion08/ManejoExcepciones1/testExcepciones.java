package Java_3er_sem.Leccion08.ManejoExcepciones1;

import javax.management.openmbean.OpenDataException;

public class testExcepciones {
    public static void main(String[] args) {
        int resultadoo = 0;
        try{
            resultadoo = Aritmetica.division(10,0);
        }catch(OpenDataException e){
            System.out.println("Error de tipo OperadorExcepcion");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Error");
            e.printStackTrace(System.out);//se conoce como la pila de excepciones
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se reviso la division entre 0");
        }
        System.out.println("Resultado: "+resultadoo);
    }
}
