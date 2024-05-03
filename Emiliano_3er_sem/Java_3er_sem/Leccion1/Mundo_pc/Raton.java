
package Emiliano_3er_sem.Java_3er_sem.Leccion1.Mundo_pc;

public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString(){
        return "Raton{" + "IdRaton=" + idRaton + ", " + super.toString()+"}";
    }
} 
