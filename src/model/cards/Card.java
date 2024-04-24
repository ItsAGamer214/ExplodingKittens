package model.cards;

import interfaces.Playable;

public abstract class Card implements Playable {

    //If the card can be Negated, then this should be set to true
    //Defuse cards must have this as false
    private final boolean isNopeable;
    private final String name;
    private final String description;

    public Card(String name, String description, boolean isNopeable) {
        this.name = name;
        this.description = description;
        this.isNopeable = isNopeable;
    }




}
