package cards;

import cards.Card.Suit;
import cards.Card.FaceValue;

/**
 * Created by Moop on 2015-12-22.
 *
 */
public abstract class Deck {

    protected static final Card[] def_deck = _make_def_deck();

    public static Deck createDeck() {
        return (createDeck(0));
    }

    public static Deck createDeck(int decks) {
        return (decks <= 0 ? new InfiniteDeck() : new FiniteDeck(decks));
    }

    public abstract Card drawCard();

    public final Card[] drawHand(int num) {
        if (num <= 0)
            throw new RuntimeException();

        Card[] hand = new Card[num];

        for (int i=0; i<num; ++i)
            hand[i] = drawCard();

        return (hand);
    }

    private static Card[] _make_def_deck() {
        Card[] def_deck = new Card[52];

        for (Suit s : Suit.values())
            for (FaceValue f : FaceValue.values())
                def_deck[s.value * f.COUNT + f.value] = new Card(s, f);

        return (def_deck);
    }

}
