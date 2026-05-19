package Memento;

public class JogoEstadoCheckpoint implements JogoEstado {

    private JogoEstadoCheckpoint() {}
    private static JogoEstadoCheckpoint instance = new JogoEstadoCheckpoint();

    public static JogoEstadoCheckpoint getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Checkpoint";
    }
}