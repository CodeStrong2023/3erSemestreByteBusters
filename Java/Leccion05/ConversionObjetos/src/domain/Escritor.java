package domain;

public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    //METODO PARA SOBREESCRIBIR
    @Override
    public String ObtenerDetalles(){
        return super.ObtenerDetalles()+ " Tipo de escritura = "+tipoEscritura.getDescripcion();
    }
    @Override
    public String toString(){
        return "Escritor {" + "Tipo de escritura = "+tipoEscritura+ "}"+" "+ super.toString();
    }
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
}
