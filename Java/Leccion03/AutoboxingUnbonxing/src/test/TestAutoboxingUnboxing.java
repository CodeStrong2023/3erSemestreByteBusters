package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        // clases envolventes o Wrapper
        /*
        Clases envolventes de tipo primitivo.
        int = la clase envolvente es Integer
        float = la clase envolvente es Float
        double = la clase envolvente es Double
        short = la clase envolvente es Short
        long = la clase envolvente es Long
        boolean = la clase envolvente es Boolean
        byte = la clase envolvente es Byte
        char = la clase envolvente es Character
        */
        int enteroPrim = 10; //Tipo primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        Integer entero = 10; //Tipo Object
        System.out.println("entero = " + entero.doubleValue()); //Autoboxing
        
        int entero2 = entero; //Unboxing
        System.out.println("entero2 = " + entero2);
    }
}
