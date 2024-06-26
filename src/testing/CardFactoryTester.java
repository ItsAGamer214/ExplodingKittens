package testing;

import util.CardFactory;

public class CardFactoryTester {
    public static void main(String[] args){

        System.out.println("Testing CardFactory.java");
        System.out.println("Testing Card Generation -- Queue Sizes & Card Quantities");
        System.out.println();

        //Test 2-3 Players
        CardFactory c1 = new CardFactory(2);
        System.out.println("2 Players: " + c1.getList());
        //Test 4-7
        CardFactory c2 = new CardFactory(4);
        System.out.println("4 Players: " + c2.getList());
        //Test 8-10
        CardFactory c3 = new CardFactory(8);
        System.out.println("8 Players: " + c3.getList());
        System.out.println();


        System.out.println("Testing Card Generation -- Randomization");
        System.out.println();

        CardFactory r1 = new CardFactory(2);
        System.out.println("Game 1 with 2 Players: " + r1.getList());
        CardFactory r2 = new CardFactory(2);
        System.out.println("Game 2 with 2 Players: " + r2.getList());
        CardFactory r3 = new CardFactory(2);
        System.out.println("Game 3 with 2 Players: " + r3.getList());
    }
}
