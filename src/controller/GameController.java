package controller;

import interfaces.Card;
import model.Deck;
import model.Game;
import util.CardFactory;

import java.util.Scanner;

public class GameController {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int numPlayers = scan.nextInt();
        scan.close();
        Deck deck = new Deck(numPlayers);
    }
}
