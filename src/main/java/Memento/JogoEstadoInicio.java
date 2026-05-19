package Memento;

public class JogoEstadoInicio implements JogoEstado {

    private JogoEstadoInicio() {}
    private static JogoEstadoInicio instance = new JogoEstadoInicio();

    public static JogoEstadoInicio getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Início";
    }
}