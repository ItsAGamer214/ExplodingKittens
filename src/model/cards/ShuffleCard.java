package model.cards;

public class ShuffleCard extends Card {
    public ShuffleCard(String name, String description, boolean isNopeable) {
        super(name, description, true);
    }

    /**
     * Place a card and carry out it's action, removing the card
     * from the user's hand
     */
    @Override
    public void play() {

    }


}
