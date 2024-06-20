package paquete1;

public class Clase1 {
    public String atributoPublico = "Valor atributo público";
    protected String atributoProtected = "Valor atributo protected";
    
    public Clase1(){
        System.out.println("Constructor Público");
    }
    protected Clase1(String atributoPublico){
        System.out.println("Constructor Protected");
    }
    
    public void MetodoPublico(){
        System.out.println("Método Público");
    }
    protected void MetodoProtected(){
        System.out.println("Método Protected");
    }
}
