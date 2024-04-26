package model;

import interfaces.Card;
import util.CardFactory;

import java.util.ArrayDeque;

public class Deck {
    CardFactory cardFactory;
    int numPlayers;
    public ArrayDeque<Card> a;

    public Deck(int numPlayers){
        cardFactory = new CardFactory(numPlayers);
        a = (ArrayDeque<Card>) cardFactory.getCards();
    }

    public void discard(Card card){
        a.remove(card);
    }
    public Card draw(){
        return a.pop();
    }
}
