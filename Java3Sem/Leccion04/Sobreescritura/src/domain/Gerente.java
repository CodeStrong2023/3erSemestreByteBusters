package domain;

public class Gerente extends Empleado{
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    // Sobreescribimos el método
    @Override
    public String mostrarDetalles(){
        return super.mostrarDetalles()+", Departamento: "+ this.departamento;
    }
}
