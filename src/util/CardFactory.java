package util;

import model.cards.*;
import interfaces.Card;

import java.util.*;

public class CardFactory {

    //lists of card number allocations
    private static final int[] minPlayers = {2, 3,  4, 3, 2, 4};
    private static final int[] midPlayers = {3, 7,  5, 3, 4, 6};
    private static final int[] maxPlayers = {5, 10, 9, 6, 6, 10};

    //instance variables
    int numPlayers;
    Queue<Card> queue;

    /**
     * Allocates a new CardFactory that creates and stores the number of players and a queue of cards
     * @param numPlayers the number of players in the game
     */
    public CardFactory(int numPlayers){
        this.numPlayers = numPlayers;
        List<Card> list = shuffle(addAllCards(getCardNum()));
        queue = new LinkedList<>(list);
    }

    /**
     * Retrieves the card number allocations based on the number of players
     * @return  the integer array of card number allocations
     */
    private int[] getCardNum(){
        if(numPlayers >= 8)
            return maxPlayers;
        if(numPlayers >= 4)
            return midPlayers;
        else
            return minPlayers;
    }

    /**
     * Adds all the necessary cards to a list based on the card allocations
     * @param cardNums the integer array of card number allocations
     * @return the sorted list of cards
     */
    private List<Card> addAllCards(int[] cardNums){
        List<Card> cards = new ArrayList<>();
        for(int lcv = 0; lcv < cardNums[0]; lcv++)
            cards.add(new AttackCard());
        for(int lcv = 0; lcv < cardNums[1] - numPlayers; lcv++) //take out 1 defuse card for every player
            cards.add(new DefuseCard());
        for(int lcv = 0; lcv < numPlayers-1; lcv++) //include 1 less than the number of players
            cards.add(new ExplodingKittenCard());
        for(int lcv = 0; lcv < cardNums[2]; lcv++)
            cards.add(new NopeCard());
        for(int lcv = 0; lcv < cardNums[3]; lcv++)
            cards.add(new SeeTheFuture());
        for(int lcv = 0; lcv < cardNums[4]; lcv++)
            cards.add(new ShuffleCard());
        for(int lcv = 0; lcv < cardNums[5]; lcv++)
            cards.add(new SkipCard());
        return cards;
    }

    /**
     * Shuffles the given list of cards
     * @param list the given list of cards
     * @return  the shuffled list of cards
     */
    private List<Card> shuffle(List<Card> list){
        if(!list.isEmpty())
            Collections.shuffle(list);
        return list;
    }

    /**
     * Retrieves the queue of cards
     * @return the queue of cards
     */
    public Queue<Card> getCards() {
        return queue;
    }
}
