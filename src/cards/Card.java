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

        public final int index;

        Suit(int index) {
            this.index = index;
        }
    }

    public enum FaceValue {
        ACE(0, 11),
        TWO(1, 2),
        THREE(2, 3),
        FOUR(3, 4),
        FIVE(4, 5),
        SIX(5, 6),
        SEVEN(6, 7),
        EIGHT(7, 8),
        NINE(8, 9),
        TEN(9, 10),
        JACK(10, 10),
        QUEEN(11, 10),
        KING(12, 10);

        public final static int COUNT = values().length;

        public final int index;
        public final int bjvalue;

        FaceValue(int index, int bjvalue) {
            this.index = index;
            this.bjvalue = bjvalue;
        }
    }
}
