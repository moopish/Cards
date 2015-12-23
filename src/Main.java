import cards.Card;
import cards.Deck;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Moop on 2015-12-23.
 *
 */
public class Main {

    public static void main(String[] args) {
        Deck test = Deck.createDeck(-13);
        HashMap<Card,Integer> map = new HashMap<>();

        for (long i=0; i<10000000000L; ++i) {
            Card t = test.drawCard();
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 0);
            }
        }

        for (int i : map.values()) {
            System.out.println(i/100000000f);
        }
        System.out.println(map.values().size());

        for (int i=0; i<10; ++i) {
            //System.out.println(test.drawCard());
        }
    }

}
