package util;

import interfaces.Card;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/** Use for Shuffle, pick card logic, etc **/
public class GameUtils {

    /**
     * Shuffles the given queue of cards
     * @param queue the given queue of cards
     * @return  the shuffled queue of cards
     */
    public static Queue<Card> shuffle(Queue<Card> queue){
        List<Card> list = new LinkedList<>(queue);
        Collections.shuffle(list);
        return new LinkedList<>(list);
    }
}
