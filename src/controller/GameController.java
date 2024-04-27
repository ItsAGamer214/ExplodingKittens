package controller;

import interfaces.Card;
import model.Deck;
import model.Game;
import model.Player;
import view.GameView;
import view.PlayerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

    public static void main(String[] args)
    {
        GameView gameView = new GameView();
        List<Player> playerList = new ArrayList<>();
        List<PlayerView> playerViewList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int numPlayers = scan.nextInt();
        Deck deck = new Deck(numPlayers);
        for(int lcv = 0; lcv < numPlayers; lcv++){
            System.out.println("Player " + lcv+1 + " Name: ");
            playerList.add(new Player(scan.next(), deck));
            playerViewList.add(new PlayerView(playerList.get(lcv)));
        }
        scan.close();
    }
}
