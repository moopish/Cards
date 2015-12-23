package blackjack;

import cards.Card;
import cards.Deck;
import game.Game;

import java.util.ArrayList;

/**
 * Created by Moop on 2015-12-23.
 *
 * Stay noided
 */

// hit, stand, double down, split, surrender
    // insurance
public class BlackJack extends Game {

    private Hand dealer;
    private Hand[] player;

    public BlackJack() {
        super(Deck.createDeck(6));
    }

    @Override
    public void run() {
        //TODO
        //init
        dealer = new Hand();
        player = new Hand[4];
        player[0] = new Hand();

        //place bets

        //deal cards
        player[0].hit();
        dealer.hit();
        player[0].hit();
        dealer.hit();

        //decide to hit, split (if can), double, etc.

        //continue
        //let dealer go
        //determine winner
        //repeat
    }

    private class Hand {

        protected final ArrayList<Card> cards;

        public Hand() {
            cards = new ArrayList<>(5);
        }

        public int hit() {
            cards.add(deck.drawCard());
            return (value());
        }

        public int value() {
            int val = 0;
            int aces = 0;

            for (Card c : cards) {
                val += c.value.bjvalue;

                if (c.value == Card.FaceValue.ACE)
                    ++aces;

                if (val > 21 && aces > 0) {
                    --aces;
                    val -= 10;
                }
            }

            return (val);
        }
    }
}
