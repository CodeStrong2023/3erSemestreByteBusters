package Emiliano_3er_sem.Java_3er_sem.Leccion1.Mundo_pc;

public class DispositivoEntrada {

    private String tipoEntrada;
    private String marca;

    public DispositivoEntrada(String tipoEntrada, String marcaa){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public String getTipoEntrada(){
        return this.tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada){
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    @Override
    public String toString(){
        return "DispositivoEntrada{" + "TipoEntrada=" + tipoEntrada + ",marca=" + marca + "}";
    }
}