package model.cards;

import interfaces.Card;

import javax.swing.*;

public class ExplodingKittenCard implements Card {

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
     * Retrieves the card's images
     * @return array of card's images
     */
    @Override
    public ImageIcon[] getImages(){

        return new ImageIcon[0];
    }

    public void onDraw() {

    }
    /**
     * Retrieves the name of the card
     * @return  the card's name
     */
    @Override
    public String toString(){
        return "Exploding Kitten";
    }

}
