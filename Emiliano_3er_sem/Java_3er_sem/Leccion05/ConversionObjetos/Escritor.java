package ConversionObjetos;

public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    //Metodo de sobreescribir
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", Tipo Escrituta: "+tipoEscritura.getDescripcion();
    }

    @Override
    public String toString(){
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + "}"+" "+super.toString();
    }

    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
}
