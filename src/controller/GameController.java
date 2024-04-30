package controller;

import model.Deck;
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
        GameView gameView = new GameView();
        JDesktopPane desktopPane = new JDesktopPane();
        gameView.add(desktopPane, BorderLayout.CENTER);
        JInternalFrame gameFrame = new JInternalFrame("Game", true, false, false, true);
        gameFrame.setBounds(0,0,gameView.getWidth(), gameView.getHeight()/2);
        gameFrame.setVisible(true);
        desktopPane.add(gameFrame);
        //gets number of players
        int numPlayers = Integer.parseInt(JOptionPane.showInputDialog(gameView,
                "How many players?", 2));

        //gets player names & inits them
        Deck deck = new Deck(numPlayers);
        List<Player> playerList = new ArrayList<>();
        List<PlayerView> playerViewList = new ArrayList<>();
        String playerNames = JOptionPane.showInputDialog(gameView,
                "Enter names:\n (Add space between each name)",null);
        String[] names = playerNames.split(",");
        for(int lcv = 0; lcv < names.length; lcv++){
            playerList.add(new Player(names[lcv].trim(), deck));
            playerViewList.add(new PlayerView(playerList.get(lcv)));
        }

        //add deck image
        BufferedImage myPic1 = ImageIO.read(new File("src/images/deck.jpg"));
        //myPic = myPic.getScaledInstance(myPic)
        JLabel image1 = new JLabel(new ImageIcon(myPic1));
        JPanel panel1 = new JPanel();
        panel1.add(image1);
        BufferedImage myPic2 = ImageIO.read(new File("src/images/defuse/Laser-Pointer.jpg"));
        JLabel image2 = new JLabel(new ImageIcon(myPic2));
        panel1.add(image2);
        gameFrame.setLayout(new BorderLayout());
        gameFrame.add(panel1, BorderLayout.CENTER);
    }
}
