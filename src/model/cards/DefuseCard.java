package model.cards;

import interfaces.Card;

public class DefuseCard implements Card {

    /**
     * Place a card and carry out it's action, removing the card
     * from the user's hand
     */
    @Override
    public void play() {

    }

    /**
     * Retrieves whether card type is nope-able
     * @return false b/c it is never nope-able
     */
    @Override
    public boolean isNopeable() {
        return false;
    }

    /**
     * Retrieves the name of the card
     * @return  the card's name
     */
    @Override
    public String toString(){
        return "Defuse";
    }

}
