package model.cards;

public class AttackCard extends Card{
    public AttackCard(String name, String description, boolean isNopeable) {
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
