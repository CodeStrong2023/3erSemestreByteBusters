package Java_3er_sem.Leccion07.JavaBeans;

public class testJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Lopez =" + persona);

        System.out.println("Persona nombre: "+persona.getNombre());
        System.out.println("Persona apellido: "+persona.getApellido());

    }
}
