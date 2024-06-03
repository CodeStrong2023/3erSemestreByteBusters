public class testInterfaces {
    public static void main(String[] args) {
        interfaces datos = new implementacionMySQL();
        //datos.listar();
        //imprimir(datos);
        datos = new implementacionOreacle();
        //datos.listar();
        imprimir(datos);
    }

    public static void imprimir(interfaces datos){
        datos.listar();
    }
}
