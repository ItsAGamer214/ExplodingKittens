package model.cards;

public class DefuseCard extends Card {

    public DefuseCard(String name, String description, boolean isNopeable) {
        super(name, description, isNopeable);
    }

    /**
     * Place a card and carry out it's action, removing the card
     * from the user's hand
     */
    @Override
    public void play() {

    }

    @Override
    public void draw() {

    }
}
