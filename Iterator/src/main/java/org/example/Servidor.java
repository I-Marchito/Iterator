package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Servidor implements Iterable<Jogador>{

    private List<Jogador> players = new ArrayList<Jogador>();

    public Servidor(Jogador... players) {
        this.players = Arrays.asList(players);
    }

    @Override
    public Iterator<Jogador> iterator() {
        return players.iterator();
    }

}
