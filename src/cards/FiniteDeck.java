package cards;

/**
 * Created by Moop on 2015-12-23.
 *
 */
final class FiniteDeck extends Deck {

    private Card[] deck;
    private final int count;
    private int remain;

    protected FiniteDeck(int num) {
        if (num <= 0)
            throw new RuntimeException();

        count = num;
        remain = 0;
    }

    @Override
    public Card drawCard() {
        if (remain == 0)
            _shuffle(count);

        return (deck[--remain]);
    }

    @Override
    public void reshuffle() {
        _shuffle(count);
    }

    private void _shuffle(int count) {
        deck = new Card[count * def_deck.length];
        remain = deck.length;

        for (int i=0; i<deck.length; ++i) {
            int j = (int)(Math.random() * (i + 1));
            deck[i] = deck[j];
            deck[j] = def_deck[i % def_deck.length];
        }
    }
}
