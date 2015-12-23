package cards;

/**
 * Created by Moop on 2015-12-22.
 *
 */
public final class Card {

    public final Suit suit;
    public final FaceValue value;

    protected Card(Suit suit, FaceValue value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return (suit.name() + ", " + value.name());
    }

    public enum Suit {
        SPADES(0),
        HEARTS(1),
        DIAMONDS(2),
        CLUBS(3);

        public final static int COUNT = values().length;

        public final int value;

        Suit(int value) {
            this.value = value;
        }
    }

    public enum FaceValue {
        ACE(0),
        TWO(1),
        THREE(2),
        FOUR(3),
        FIVE(4),
        SIX(5),
        SEVEN(6),
        EIGHT(7),
        NINE(8),
        TEN(9),
        JACK(10),
        QUEEN(11),
        KING(12);

        public final static int COUNT = values().length;

        public final int value;

        FaceValue(int value) {
            this.value = value;
        }
    }
}
