package util;

import model.cards.*;
import interfaces.Card;

import java.util.*;

public class CardFactory {

    public static final int[] minPlayers = {2, 3,  9, 4, 3, 2, 4};
    public static final int[] midPlayers = {3, 7,  9, 5, 3, 4, 6};
    public static final int[] maxPlayers = {5, 10, 9, 9, 6, 6, 10};
    //instance variables
    List<Card> values;
    int numPlayers;
    Queue<Card> queue;

    public CardFactory(int numPlayers){
        this.numPlayers = numPlayers;
        values = addAllCards(getCardNum());
        queue = new LinkedList<>(values);
    }

    public int[] getCardNum(){
        if(numPlayers > 8)
            return maxPlayers;
        if(numPlayers > 4)
            return midPlayers;
        else
            return minPlayers;
    }

    public List<Card> addAllCards(int[] cardNums){
        List<Card> values = new ArrayList<>();
        for(int lcv = 0; lcv < cardNums[0]; lcv++)
            values.add(new AttackCard());
        for(int lcv = 0; lcv < cardNums[1]; lcv++)
            values.add(new DefuseCard());
        for(int lcv = 0; lcv < cardNums[2]; lcv++)
            values.add(new ExplodingKittenCard());
        for(int lcv = 0; lcv < cardNums[3]; lcv++)
            values.add(new NopeCard());
        for(int lcv = 0; lcv < cardNums[4]; lcv++)
            values.add(new SeeTheFuture());
        for(int lcv = 0; lcv < cardNums[5]; lcv++)
            values.add(new ShuffleCard());
        for(int lcv = 0; lcv < cardNums[6]; lcv++)
            values.add(new SkipCard());
        shuffle();
        return values;
    }

    public void shuffle(){
        Collections.shuffle(values, new Random((int)(Math.random()*1000)));
    }

}
