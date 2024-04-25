package util;

import model.cards.Card;

import java.util.Queue;

public class CardFactory {
    int size;
    Queue<Card> queue;
    public CardFactory(int size){
        this.size = size;
        add();
    }

    public void add(){
        for(int lcv = 0; lcv < size; lcv++){

        }
    }

    public Card random(){

    }

    enum CardEnum{
        ATTACK,
        DEFUSE,
        EXPLODING_KITTEN,
        NOPE,
        SEE_THE_FUTURE,
        SHUFFLE,
        SKIP
    }
}
