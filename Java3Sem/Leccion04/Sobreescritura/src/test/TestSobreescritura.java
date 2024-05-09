package test;

import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 10000);
        Imprimir(empleado1);
        
        Gerente gerente1 = new Gerente("Jose", 5000, "Sistemas");
        Imprimir(gerente1);
        //System.out.println("gerente1 = " + gerente1.ObtenerDetalles());
        
        }
    public static void Imprimir(Empleado empleado){
            System.out.println("empleado = " + empleado.ObtenerDetalles());
    }
}
