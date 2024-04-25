package model;

public class Player {
    private String name;
    private Deck deck;
    private static final int initNumCards = 7;


    public Player(String name){
        this.name = name;
        deck = new Deck(initNumCards);

    }

    /** If an ExplodingKittenCard is drawn, then this function will return
     *  true if they live, false if they die.
     *
     * @return
     */
    public boolean onExplode(){

    }
}
