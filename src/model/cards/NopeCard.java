package model.cards;

public class NopeCard extends Card{
    public NopeCard(String name, String description, boolean isNopeable) {
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
