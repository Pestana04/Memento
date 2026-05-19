package Memento;

public class JogoEstadoGameOver implements JogoEstado {

    private JogoEstadoGameOver() {}
    private static JogoEstadoGameOver instance = new JogoEstadoGameOver();

    public static JogoEstadoGameOver getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Game Over";
    }
}