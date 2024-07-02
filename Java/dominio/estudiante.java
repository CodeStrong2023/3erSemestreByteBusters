package UTN.dominio; 

public class estudiante {
    private int IdEstudiante;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;


    public estudiante(){} //Constructor vacío

    public estudiante(int IdEstudiante){//Contructor para la llave primaria
        this.IdEstudiante = IdEstudiante;
    }

    //Contructor para insertar un nuevo estudiante
    public estudiante(String nombre, String apellido, String telefono, String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }
    
    //Contructor para modificar
    public estudiante(int IdEstudiante, String nombre, String apellido, String telefono, String email){
        this.IdEstudiante = IdEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public int getIdEstudiante(){
        return IdEstudiante;
    }

    public void setIdEstudiante(int IdEstudiante){
         this.IdEstudiante = IdEstudiante;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre; 
    }

    public String getApellido(){
        return apellido;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString(){
        return "Estudiante{" +
        "idEstudiante=" + IdEstudiante +
        ", nombre=" + nombre + '\'' +
        ", apellido=" + apellido + '\'' +
        ", telefono=" + telefono + '\'' +
        ", email=" + email + '\'' +
        '}';
    }
}
