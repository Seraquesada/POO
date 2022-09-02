import java.util.Scanner;

// Piedra papel o tijera con Spock incluido

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer puntajeJugador1 = 0;
        Integer puntajeJugador2 = 0;

        // pedir nombre 1

        System.out.println("ingrese el nombre del jugador 1");
        String nombre1 = scanner.nextLine();

        // pedir nombre 2

        System.out.println("ingrese el nombre del jugador 2");
        String nombre2 = scanner.nextLine();

        // pedir eleccion 1

        System.out.println("Jugador 1: ingrese 0 para piedra, 1 para  papel, 2 para tijera o 3 para Spock ");
        Integer jugada1 = scanner.nextInt();

        // pedir eleccion 2

        System.out.println("Jugador 2: ingrese 0 para piedra  , 1 para papel, 2 para tijera o 3 para Spock  ");
        Integer jugada2 = scanner.nextInt();

        if (quienGana(jugada1, jugada2) == 1){
            puntajeJugador1 ++;
            System.out.println("Gana " + nombre1);
        }
        else if (quienGana(jugada1, jugada2) == 2){
            puntajeJugador2 ++;
            System.out.println("Gana " + nombre2);
        } else {
            System.out.println("Empate!");
        }
    }

    public static Integer quienGana(Integer jugada1, Integer jugada2){

        if (jugada1 == jugada2) {return 0; }

        if (
                (jugada2 == 1 && jugada1 == 0) ||
                        (jugada2 == 2 && jugada1 == 1) ||
                        (jugada2 == 0 && jugada1 == 2) ||
                        (jugada2 == 3 && jugada1 == 2) ||
                        (jugada2 == 3 && jugada1 == 0)
        ){ return 2; } else { return 1; }
    }
}