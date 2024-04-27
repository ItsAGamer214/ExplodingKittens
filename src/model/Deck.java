package model;

import interfaces.Card;
import util.CardFactory;
import java.util.ArrayDeque;

public class Deck {

    //instance variables
    CardFactory cardFactory;
    public ArrayDeque<Card> deck;

    /**
     * Allocates a new Deck that creates and stores a CardFactory, number of players and a queue of cards
     * @param numPlayers the number of players in the game
     */
    public Deck(int numPlayers){
        cardFactory = new CardFactory(numPlayers);
        deck = (ArrayDeque<Card>) cardFactory.getCards();
    }

    /**
     * Discards a certain card from the deck
     * @param card the card to be removed
     */
    public void discard(Card card){
        deck.remove(card);
    }

    /**
     * Adds a certain card in a certain location within the deck
     * NOTE: needs to be fixed
     * @param card the card to be added
     */
    public void place(Card card){
        deck.add(card);
    }

    /**
     * Draws a new card from the top of the deck
     * @return the drawn card
     */
    public Card draw(){
        return deck.pop();
    }

    /**
     * Retrieves the deck
     * @return the deck
     */
    public ArrayDeque<Card> getDeck(){
        return deck;
    }
}



//i think we should change this from an ArrayDeque to List b/c we need to have functionality to add to any place in the deck (for the next player to add the Exploding Kitten where they want)