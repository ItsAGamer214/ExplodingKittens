package controller;

import model.Deck;
import model.Player;
import view.GameView;
import view.PlayerView;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

    public static void main(String[] args) throws IOException {
        GameView gameView = new GameView();
        //gets number of players
        int numPlayers = Integer.parseInt(JOptionPane.showInputDialog(gameView,
                "How many players?", 2));

        //gets player names & inits them
        Deck deck = new Deck(numPlayers);
        List<Player> playerList = new ArrayList<>();
        List<PlayerView> playerViewList = new ArrayList<>();
        String playerNames = JOptionPane.showInputDialog(gameView,
                "Enter names:\n (Add space between each name)",null);
        Scanner scan = new Scanner(playerNames);
        for(int lcv = 0; lcv < numPlayers; lcv++){
            playerList.add(new Player(scan.next(), deck));
            playerViewList.add(new PlayerView(playerList.get(lcv)));
            gameView.add(new JPanel().add(new JLabel(playerList.get(lcv).getName())));
        }
        scan.close();

        BufferedImage myPic = ImageIO.read(new File("src/images/deck.jpg"));
        JLabel label = new JLabel(new ImageIcon(myPic));
        gameView.add(new JPanel().add(label));
    }
}
