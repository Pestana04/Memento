package Memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JogoTest {

    @Test
    void deveArmazenarEstadosDoJogo() {
        Jogo jogo = new Jogo();

        jogo.setEstado(JogoEstadoInicio.getInstance());
        jogo.setEstado(JogoEstadoCheckpoint.getInstance());
        jogo.setEstado(JogoEstadoBoss.getInstance());

        assertEquals(3, jogo.getEstados().size());
    }

    @Test
    void deveRestaurarEstadoAnterior() {
        Jogo jogo = new Jogo();

        jogo.setEstado(JogoEstadoInicio.getInstance());
        jogo.setEstado(JogoEstadoCheckpoint.getInstance());
        jogo.setEstado(JogoEstadoBoss.getInstance());
        jogo.setEstado(JogoEstadoGameOver.getInstance());

        jogo.restauraEstado(1);

        assertEquals("Checkpoint", jogo.getEstado().getNomeEstado());
    }

    @Test
    void deveRestaurarEstadoInicial() {
        Jogo jogo = new Jogo();

        jogo.setEstado(JogoEstadoInicio.getInstance());
        jogo.setEstado(JogoEstadoCheckpoint.getInstance());
        jogo.setEstado(JogoEstadoBoss.getInstance());

        jogo.restauraEstado(0);

        assertEquals("Início", jogo.getEstado().getNomeEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Jogo jogo = new Jogo();

            jogo.setEstado(JogoEstadoInicio.getInstance());
            jogo.restauraEstado(5);

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}