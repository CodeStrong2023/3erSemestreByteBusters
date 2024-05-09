package paquete2;

import paquete1.Clase1;

public class Clase3 extends Clase1 {
    public Clase3(){
        super("Protected");
        this.atributoProtected = "Accedemos desde la clase hija";
        System.out.println("Atributo Protected = " + this.atributoProtected);
        this.atributoPublico = "Es totalmente público";
    }
}
