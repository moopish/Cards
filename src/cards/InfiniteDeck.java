package cards;

/**
 * Created by Moop on 2015-12-23.
 */
final class InfiniteDeck extends Deck {

    protected InfiniteDeck() {}

    @Override
    public Card drawCard() {
        return (def_deck[(int)(Math.random() * def_deck.length)]);
    }

    @Override
    public void reshuffle() { /* DO NOTHING */ }
}
