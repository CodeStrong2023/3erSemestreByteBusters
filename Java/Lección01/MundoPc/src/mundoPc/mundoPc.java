package mundoPc;

import ar.com.system2023.mundopc.*;

public class mundoPc {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP",13); // Importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP,tecladoHP,ratonHP);
        
        Monitor monitorGamer = new Monitor("Gamer",32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        
        Computadora computadoraGamer = new Computadora("Computadora HP", monitorGamer,tecladoGamer,ratonGamer);
        
        Orden orden1 = new Orden(); // Inicializamos el arreglo vacío
        Orden orden2 = new Orden(); // Nueva lista para el objeto orden2
        
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
        
        Computadora computadorasVarias = new Computadora("Computadoras de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        orden2.agregarComputadora(computadorasVarias);
        orden2.mostrarOrden();
        
        
        // Crear más objetos de tipo computadora con todos sus elementos
        //Completar una lista en objeto orden1
        //1
        Monitor monitorSamsung = new Monitor("Samsung",13); // Importar la clase
        Teclado tecladoSamsung = new Teclado("Bluetooth", "Samsung");
        Raton ratonSamsung = new Raton("Bluetooth", "Samsung");
        Computadora computadoraSamsung = new Computadora("Computadora Samsung",monitorSamsung,tecladoSamsung, ratonSamsung);
        //2
        Monitor monitorAcer = new Monitor("Acer",13); // Importar la clase
        Teclado tecladoAcer = new Teclado("Bluetooth", "Acer");
        Raton ratonAcer = new Raton("Bluetooth", "Acer");
        Computadora computadoraAcer = new Computadora("Computadora Acer",monitorAcer,tecladoAcer, ratonAcer);
        //3
        Monitor monitorLenovo = new Monitor("Lenovo",13); // Importar la clase
        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo",monitorLenovo,tecladoLenovo, ratonLenovo);
        //4
        Monitor monitorDell = new Monitor("Dell",13); // Importar la clase
        Teclado tecladoDell = new Teclado("Bluetooth", "Dell");
        Raton ratonDell = new Raton("Bluetooth", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell",monitorDell,tecladoDell, ratonDell);
        //5
        Monitor monitorApple = new Monitor("Apple",13); // Importar la clase
        Teclado tecladoApple = new Teclado("Bluetooth", "Apple");
        Raton ratonApple = new Raton("Bluetooth", "Apple");
        Computadora computadoraApple = new Computadora("Computadora Apple",monitorApple,tecladoApple, ratonApple);
        //6
        Monitor monitorToshiba = new Monitor("Toshiba",13); // Importar la clase
        Teclado tecladoToshiba = new Teclado("Bluetooth", "Toshiba");
        Raton ratonToshiba = new Raton("Bluetooth", "Toshiba");
        Computadora computadoraToshiba = new Computadora("Computadora Toshiba",monitorToshiba,tecladoToshiba, ratonToshiba);
        //7
        Monitor monitorASUS = new Monitor("ASUS",13); // Importar la clase
        Teclado tecladoASUS = new Teclado("Bluetooth", "ASUS");
        Raton ratonASUS = new Raton("Bluetooth", "ASUS");
        Computadora computadoraASUS = new Computadora("Computadora ASUS",monitorASUS,tecladoASUS, ratonASUS);
        //8
        Monitor monitorVaio = new Monitor("Vaio",13); // Importar la clase
        Teclado tecladoVaio = new Teclado("Bluetooth", "Vaio");
        Raton ratonVaio = new Raton("Bluetooth", "Vaio");
        Computadora computadoraVaio = new Computadora("Computadora Vaio",monitorVaio,tecladoVaio, ratonVaio);
        //9
        Monitor monitorLG = new Monitor("LG",13); // Importar la clase
        Teclado tecladoLG = new Teclado("Bluetooth", "LG");
        Raton ratonLG = new Raton("Bluetooth", "LG");
        Computadora computadoraLG = new Computadora("Computadora LG",monitorLG,tecladoLG, ratonLG);
        //10
        Monitor monitorAlienware = new Monitor("Alienware",13); // Importar la clase
        Teclado tecladoAlienware = new Teclado("Bluetooth", "Alienware");
        Raton ratonAlienware = new Raton("Bluetooth", "Alienware");
        Computadora computadoraAlienware = new Computadora("Computadora Alienware",monitorAlienware,tecladoAlienware, ratonAlienware);
        
        orden1.agregarComputadora(computadoraLG);
        orden1.agregarComputadora(computadoraASUS);
        orden1.agregarComputadora(computadoraAcer);
        orden1.agregarComputadora(computadoraAlienware);
        orden1.agregarComputadora(computadoraApple);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraSamsung);
        orden1.agregarComputadora(computadoraToshiba);
        orden1.agregarComputadora(computadoraVaio);
        orden1.agregarComputadora(computadorasVarias);
        
        orden1.mostrarOrden();
    }
}
