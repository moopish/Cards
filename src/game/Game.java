package game;

import cards.Deck;

/**
 * Created by Moop on 2015-12-23.
 *
 */
public abstract class Game {

    protected final Deck deck;

    public Game(Deck deck) {
        this.deck = deck;
    }

    public abstract void run();
}
