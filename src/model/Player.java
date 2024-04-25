package model;

import model.cards.Card;
import model.cards.DefuseCard;

import java.util.ArrayList;

public class Player {
    private String name;
    private Deck deck;
    private static final int initNumCards = 7;
    private ArrayList<Card> hand;

    public Player(String name, Deck deck){
        this.name = name;
        this.deck = deck;

    }

    /** If an ExplodingKittenCard is drawn, then this function will return
     *  true if they live, false if they die.
     *
     * @return whether they live (true) or die (false)
     */
    public boolean onExplode(){
         for(int i = 0; i < hand.size(); i++){
             if(hand.get(i) instanceof DefuseCard){
                 return true;
             }
         }
        return false;
    }

    /** Draw a card from the deck;
     *
     */
    public void draw(){
        hand.add(deck.draw());
    }


}
