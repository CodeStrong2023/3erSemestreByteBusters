package test;

import domain.*;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);
        
        if(empleado1 == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }else{
            System.out.println("No tienen la misma referencia en memoria");
        }
        if(empleado1.equals(empleado2)){
            System.out.println("Los objetos tienen el mismo contenido");
        }else{
            System.out.println("Los objetos NO tienen el mismo contenido");
        }
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("Tienen el mismo hash");
        }else{
            System.out.println("No tienen el mismo hash");
        }
    }
    
}
