package model.cards;

import interfaces.Card;

public class SkipCard implements Card {
    /**
     * Place a card and carry out it's action, removing the card
     * from the user's hand
     */
    @Override
    public void play() {

    }

    @Override
    public String toString(){
        return "Skip";
    }

}
