package org.example;

import java.util.Iterator;

public class Censo {

    public static Integer contarJogadoresOnline(Servidor server) {
        int quantidade = 0;
        for (Jogador jogador : server) {
            if (jogador.isOnline()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalJogadoresNoServidor(Servidor server) {
        int quantidade = 0;
        for (Iterator a = server.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
