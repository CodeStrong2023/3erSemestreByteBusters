package Emiliano_3er_sem.Java_3er_sem.Leccion1.Mundo_pc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;   
    }

    public Monitor(String marca, double tamanio){
        this(); //llamando al constructor vacio
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getTamanio(){
        return this.tamanio;
    }

    public void setTamanio(double tamanio){
        this.tamanio = tamanio;
    }

    public int getIdMonitor(){
        return this.idMonitor;
    }

    @Override
    public String toString(){
        return "Monitor{" + "idMonitor="+ idMonitor +", marca="+ marca + "tamaño="+ tamanio +"}";
    }
}
