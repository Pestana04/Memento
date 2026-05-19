package Memento;

public class JogoEstadoBoss implements JogoEstado {

    private JogoEstadoBoss() {}
    private static JogoEstadoBoss instance = new JogoEstadoBoss();

    public static JogoEstadoBoss getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Boss";
    }
}