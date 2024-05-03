package Emiliano_3er_sem.Java_3er_sem.Leccion1.Mundo_pc;

public class Computadora {
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;

    private Computadora(){//Constructor vacio
        this.idComputadora = ++Computadora.contadorComputadoras;  
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado,Raton raton){
        this();
        this.nombre = nombre;
        this.teclado = teclado;
        this.monitor = monitor;
        this.raton = raton;
    }

    public int getidComputadora(){
        return idComputadora;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Raton geRaton(){
        return raton;
    }

    public void setRaton(Raton raton){
        this.raton = raton;
    }

    public Monitor geMonitor(){
        return monitor;
    }

    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }

    public Teclado geTeclado(){
        return teclado;
    }

    public void setTeclado(Teclado teclado){
        this.teclado = teclado;
    }

    @Override
    public String toString(){
        return "Computadora{"+"idComputadora="+ idComputadora +" nombre="+ nombre +" monitor="+ monitor +" teclado="+ teclado +"raton="+ raton +"}";
    }
}
