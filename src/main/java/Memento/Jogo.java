package Memento;

import java.util.ArrayList;
import java.util.List;

public class Jogo {

    private JogoEstado estado;
    private List<JogoEstado> memento = new ArrayList<JogoEstado>();

    public JogoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(JogoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<JogoEstado> getEstados() {
        return this.memento;
    }
}