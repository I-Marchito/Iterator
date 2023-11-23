package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveContarPlayersOnlineServer() {
        Servidor server = new Servidor(
                new Jogador("Marchito", true),
                new Jogador("PoRoRoK4", true),
                new Jogador("Darkfeak", false),
                new Jogador("L13M10", true)
        );
        assertEquals(3, Censo.contarJogadoresOnline(server));
    }

    @Test
    void deveContarTotalPlayersServer() {
        Servidor server = new Servidor(
                new Jogador("Marchito", true),
                new Jogador("PoRoRoK4", true),
                new Jogador("Darkfeak", false),
                new Jogador("L13M10", true)
        );
        assertEquals(4, Censo.contarTotalJogadoresNoServidor(server));
    }
}