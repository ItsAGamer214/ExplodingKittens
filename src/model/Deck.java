package model;

import util.CardFactory;

public class Deck {
    CardFactory cardFactory;
    int size;

    public Deck(int size){
        cardFactory = new CardFactory(size);
    }
}
