package testing;

import interfaces.Card;
import model.cards.*;
import util.GameUtils;

import java.util.LinkedList;
import java.util.Queue;

public class GameUtilsTester {
    public static void main(String[] args){

        System.out.println("Testing GameUtils.java");
        System.out.println("Testing Shuffle");
        System.out.println();

        Queue<Card> queue = addCards();
        System.out.println("Unshuffled Queue: " + queue);
        for(int lcv = 0; lcv < 3; lcv++){
            queue = GameUtils.shuffle(queue);
            System.out.println("Shuffled Queue #" + (lcv+1) + ": " + queue);
        }
        System.out.println();
    }

    private static Queue<Card> addCards(){
        Queue<Card> cards = new LinkedList<>();
        for(int lcv = 0; lcv < 2; lcv++)
            cards.add(new AttackCard());
        for(int lcv = 0; lcv < 1; lcv++)
            cards.add(new DefuseCard());
        for(int lcv = 0; lcv < 2; lcv++)
            cards.add(new ExplodingKittenCard());
        for(int lcv = 0; lcv < 3; lcv++)
            cards.add(new NopeCard());
        return cards;
    }
}
