package model;

import interfaces.Card;
import util.CardFactory;

import java.util.List;

public class Deck {

    //instance variables
    CardFactory cardFactory;
    public List<Card> deck;

    /**
     * Allocates a new Deck that creates and stores a CardFactory, number of players and a queue of cards
     * @param numPlayers the number of players in the game
     */
    public Deck(int numPlayers){
        cardFactory = new CardFactory(numPlayers);
        deck = cardFactory.getList();
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
        return deck.remove(0);
    }

    /**
     * Retrieves the deck
     * @return the deck
     */
    public List<Card> getDeck(){
        return deck;
    }
}