package util;

import model.cards.*;
import interfaces.Card;

import java.util.*;

public class CardFactory {

    private static final int[] minPlayers = {2, 3,  4, 3, 2, 4};
    private static final int[] midPlayers = {3, 7,  5, 3, 4, 6};
    private static final int[] maxPlayers = {5, 10, 9, 6, 6, 10};
    //instance variables
    private final int numPlayers;
    private final Queue<Card> queue;

    public CardFactory(int numPlayers){
        this.numPlayers = numPlayers;
        List<Card> list = shuffle(addAllCards(getCardNum()));
        queue = new LinkedList<>(list);
    }

    private int[] getCardNum(){
        if(numPlayers >= 8)
            return maxPlayers;
        if(numPlayers >= 4)
            return midPlayers;
        else
            return minPlayers;
    }

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

    private List<Card> shuffle(List<Card> list){
        if(!list.isEmpty())
            Collections.shuffle(list);
        return list;
    }

    public Queue<Card> getCards() {
        return queue;
    }
}
