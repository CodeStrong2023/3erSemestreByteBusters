/*
agreguen sus codigos en java y un resumen en readmi
 */
package proyecto.integrador;

import proyecto.integrador.entidades.CartelBienvenida;
import proyecto.integrador.entidades.MenuPrincipal;



public class ProyectoIntegrador {
    
    public static void main(String[] args) {
        
        CartelBienvenida cartel = new CartelBienvenida();
        MenuPrincipal menu = new MenuPrincipal();
        
        cartel.mostrarCartelBienvenida();
        menu.MostrarMenu();

    }
    
}