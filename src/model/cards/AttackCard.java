package model.cards;

import interfaces.Card;

import javax.swing.*;

public class AttackCard implements Card {

    /**
     * Place a card and carry out it's action, removing the card
     * from the user's hand
     */
    @Override
    public void play() {

    }

    /**
     * Retrieves whether card type is nope-able
     * @return true b/c it is always nope-able
     */
    @Override
    public boolean isNopeable() {
        return true;
    }

    /**
     * Retrieves the card's images
     * @return array of card's images
     */
    @Override
    public ImageIcon[] getImages(){

        return new ImageIcon[0];
    }

    /**
     * Retrieves the name of the card
     * @return  the card's name
     */
    @Override
    public String toString(){
        return "Attack";
    }

}
