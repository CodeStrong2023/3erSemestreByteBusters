package paquete2;

public class Clase4 {
    private String atributoPrivate = "Atributo private";
    private Clase4(){
        System.out.println("Constructor private");
    }
    //Creamos un constructor público para poder crear objetos
    public Clase4(String argumento){ //Aquí se puede llamar al constructor vacio
        this();
        System.out.println("Constructor público");
    }
    //Método Private
    private void metodoPrivate(){
        System.out.println("Método Private");
    }

    
    public String getAtributoPrivate() {
        return this.atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
}
