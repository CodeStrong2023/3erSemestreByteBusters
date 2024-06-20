package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        //System.out.println("Dia 1: "+Dias.LUNES);
        
        //indicarDiaSemana(Dias.MARTES); //Ls enumeraciones se tratan como cadenas
        //Ahora, nose deben utilizar comillas, se accede a trvés del operador de punto
        System.out.println("Continentes No. 4: "+Continentes.AMERICA);
        System.out.println("No. de habitantes en el 4to. continente: "+Continentes.AMERICA.getHabitantes());
        System.out.println("Continente No.1: "+Continentes.AFRICA+" - No. de paises: "+Continentes.AFRICA.getPaises()+" - No. de habitantes: "+Continentes.AFRICA.getHabitantes());
        System.out.println("Continente No.2: "+Continentes.EUROPA+" - No. de paises: "+Continentes.EUROPA.getPaises()+" - No. de habitantes: "+Continentes.EUROPA.getHabitantes());
        System.out.println("Continente No.3: "+Continentes.ASIA+" - No. de paises: "+Continentes.ASIA.getPaises()+" - No. de habitantes: "+Continentes.ASIA.getHabitantes());
        System.out.println("Continente No.5: "+Continentes.OCEANIA+" - No. de paises: "+Continentes.OCEANIA.getPaises()+" - No. de habitantes: "+Continentes.OCEANIA.getHabitantes());
    }
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer día de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto día de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto día de la semana");
                break;
            case SABADO:
                System.out.println("Sexto día de la semana");
                break;
            case DOMINGO:
                System.out.println("Último día de la semana");
                break;
            default:
                System.out.println("No ha ingresado un día válido de la semana");
        }
    }
}
