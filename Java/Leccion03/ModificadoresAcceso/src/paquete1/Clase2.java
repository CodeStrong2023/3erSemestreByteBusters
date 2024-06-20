package paquete1;

class Clase2{
    String atributoDefault = "Valor atributo aefault";
    
//    Clase2(){
//        System.out.println("Constructor Default");
//    }
    public Clase2(){
        super();
        this.atributoDefault = "Valor atributo default";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }
    void metodoDefault(){
        System.out.println("MétodoDefault");
    }
}
