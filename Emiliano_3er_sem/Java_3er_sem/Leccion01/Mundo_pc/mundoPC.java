package Emiliano_3er_sem.Java_3er_sem.Leccion01.Mundo_pc;

public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("BS", "HP");
        Raton ratonHP = new Raton("BS", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("BS", "Gamer");
        Raton ratonGamer = new Raton("BS", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora gamer", monitorGamer, tecladoGamer, ratonGamer);
        Orden orden1 = new Orden();//inicializamos el constructor vacio
        Orden orden2 = new Orden();//una nueva lista para el objeto orden2
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraHP);
        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas", monitorGamer, tecladoHP, ratonGamer);
        orden2.agregarComputadora(computadorasVarias);
        orden1.mostrarOrden();
        orden2.mostrarOrden();
    }
}
