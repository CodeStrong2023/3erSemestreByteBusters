package datos;
import UTN.dominio.estudiante;

import static UTN.conexion.conexion.getConnection;
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.util.ArrayList;
import java.util.List;

import dominio.estudiante;

public class estudianteDAO {
    //Método listar
    public List<estudiante> listarEstudiantes(){
        List<estudiante> estudiantes = new ArrayList<>();
        //Creamos algunos objetos que son necesarios para poder comunicarnos con la base de datos
        PreparedStatement ps; //Envía la sentencia a la base de datos
        //ResultSet rs; //Obtenemos el resultado de la base de datos
        //Creamos un objeto de tipo conexion
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes ORDER BY estudiantes2022";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiante2022")); 
                estudiante.setNombre(rs.getString("nombre")); 
                estudiante.setApellido(rs.getString("apellido")); 
                estudiante.setTelefono(rs.getString("telefono")); 
                estudiante.setEmail(rs.getString("email")); 
                //Falta agregarlo a la lista
                estudiantes.add(estudiante);

            }
        } catch (Exception e){
            System.out.println("Ocurrió un error al seleccionar datos: "+e.getMessage());
        }
        
        finally {
            try{
                con.close();
            } catch (Exception e){
                System.out.println("Ocurrió un error al seleccionar datos: "+e.getMessage());
            }
        }//fin finally
        return estudiantes;
    }//fin metodo listar

    //Metodo por id -> fin by id
    public boolean buscarEstudiantePorId(estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 WHERE idestudiantes2022=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if(rs.next()){
                estudiante.setNombre(rs.getString("nombre")); 
                estudiante.setApellido(rs.getString("apellido")); 
                estudiante.setTelefono(rs.getString("telefono")); 
                estudiante.setEmail(rs.getString("email")); 
                return true;//se encontro un registro
            }//fin if
        } catch (Exception e){
            System.out.println("Ocurrio un error al buscar estudiante: "+e.getMessage());
        }
        finally{
            try{
                con.close();
            } catch (Exception e){
                System.out.println("Ocurrio un error al cerrar la conexion: "+e.getMessage());
            }
        }
        return false;
    }

    //Metodo agregar nuevo estudiante
    public boolean agregarEstudiante(estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES (?, ?, ?, ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute();
            return true;

        } catch(Exception e){
            System.out.println("Ocurrio un error al agregar estudiante: "+e.getMessage());
        }
        finally{
            try{
                con.close();
            } catch(Exception e){
                System.out.println("Error al cerrar la conexion: "+e.getMessage());
            }
        }
        return false;
    }

    //Metodo para modificar estudiante
    public boolean modificarEstudiante(estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "UPDATE estudiantes2022 SET nombre=?, apellido=?, telefono=?, mail=? WHERE idestudiantes2022=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.setString(5, estudiante.getIdEstudiante());
            ps.execute();
            return true;

        }catch (Exception e){
            System.out.println("Error al modificar estudiante: "+e.getMessage());
        } 

        finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar la conexion: "+e.getMessage());
            }
        }
        return false;
    }

    public static void main(String[] args) {
        var estudianteDao = new EstudianteDAO();
        //Modificar estudiante
        var estudianteModificado = new estudiante(1, "Juan Carlos", "Juarez", "8854684852", "JCarlos@gmail.com");
        var modificado = estudianteDao.modificarEstudiante(estudianteModificado);
        if(modificado){
            System.out.println("Estudiante modificado: "+estudianteModificado);
        }else{
            System.out.println("No se modifico el estudiante: "+estudianteModificado);
        }

        //Agregar estudiante
        var nuevoEstudiante = new estudiante("Carlos", "Lopez", "45685265", "carlosL@hmial.com");
        var afrefado = estudianteDao.agregarEstudiante(nuevoEstudiante);
        if(agregado){
            System.out.println("Estudiante agregado: "+nuevoEstudiante);
        }else{
            System.out.println("No se ha agregado el estudiante: "+nuevoEstudiante);
            
        }
        //Listar los estudiantes
        System.out.println("Listado de estudiante: ");
        List<estudiante> estudiantes = estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println);//Funcion lambda para imprimir


        //Buscar por id
        
        var estudiante1 = new Estudiante(1);
        System.out.println("Estudiantes antes de la busqueda: "+estudiante1);
        var encontrado = estudianteDao.buscarEstudiantePorId(estudiante1);
        if(encontrado){
            System.out.println("Estudiante encontrado: "+estudiante1);
        }else{
            System.out.println("No se encontro el estudiante "+estudiante1.getIdEstudiante());
        }
    }
}
