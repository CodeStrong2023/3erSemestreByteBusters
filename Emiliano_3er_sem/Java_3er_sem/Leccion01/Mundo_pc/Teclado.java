package Emiliano_3er_sem.Java_3er_sem.Leccion01.Mundo_pc;

public class Teclado  extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString(){
        return "Teclado{" + "IdTeclado=" + idTeclado + ", " + super.toString()+"}";
    }
}
