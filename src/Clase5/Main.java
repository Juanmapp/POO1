package Clase5;

public class Main {
    public static void main(String[] args) {
        UsuarioJuego jugador01 = new UsuarioJuego( "Diego", "1234");
        jugador01.bonus(1);
        jugador01.aumentarPuntaje();
        jugador01.subirNivel();
        jugador01.imprimrDatos();
        


    }
}
