package model;

import model.cards.Card;
import util.CardFactory;


import java.util.ArrayDeque;


public class Deck {
    CardFactory cardFactory;
    int size;
    public ArrayDeque<Card> a;

    public Deck(int size){
        cardFactory = new CardFactory(size);
        a = new ArrayDeque<>();
    }

    public void discard(Card card){
        a.remove(card);
    }
    public Card draw(){
        return a.pop();
    }
}
