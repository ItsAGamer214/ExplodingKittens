package controller;

import interfaces.Card;
import model.Deck;
import model.Game;
import model.Player;
import view.GameView;
import view.PlayerView;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

    public static void main(String[] args) throws IOException {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameView();
            }
        });
        JFrame frame = new JFrame("Exploding Kittens");
        ImageIcon image = new ImageIcon("images/Defuse-Via-Laser-Pointer.jpg");
        frame.setSize(50, 50);
        frame.add(new JLabel(image));
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
