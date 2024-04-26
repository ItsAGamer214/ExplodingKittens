package testing;

import util.CardFactory;

public class CardFactoryTester {

    public static void main(String[] args){

        System.out.println("Testing CardFactory.java");
        System.out.println();
        //Test 2-3 Players
        CardFactory c1 = new CardFactory(2);
        System.out.println("2 Players: " + c1.getCards());

        //Test 4-7
        CardFactory c2 = new CardFactory(4);
        System.out.println("4 Players: " + c2.getCards());

        //Test 8-10
        CardFactory c3 = new CardFactory(8);
        System.out.println("8 Players: " + c3.getCards());
    }
}
