public class Main {
    public static void main(String[] args) {

        Juego jugador = new Juego("asd","Serafin");

        System.out.println(jugador.getNombre() + " " + jugador.getNivel() + " " + jugador.getPuntaje());
        jugador.usuarioPuntaje();
        jugador.usuarioNivel();
        System.out.println(jugador.getNombre() + " " + jugador.getNivel() + " " + jugador.getPuntaje());
        jugador.Bonus(100);
        System.out.println(jugador.getNombre() + " " + jugador.getNivel() + " " + jugador.getPuntaje());


    }
}