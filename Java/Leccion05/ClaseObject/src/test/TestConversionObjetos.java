package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        System.out.println(empleado.ObtenerDetalles()); // Si queremos acceder a métodos de escritor
        //empleado.getTipoEscritura //no se puede hacer
        //DOWNCASTING
        //((Escritor)empleado).getTipoEscritura(); //Tenemos 2 opciones, esta es la primera
        Escritor escritor = (Escritor) empleado; //Esta es la segunda opción
        escritor.getTipoEscritura();
        
        //UPCASTING
        Empleado empleado2 = escritor;
        System.out.println(empleado2.ObtenerDetalles());
        
        
    }
}
