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
                "Enter names:\n (Add comma between each name)",null);
        String[] names = playerNames.split(",");
        for(int lcv = 0; lcv < names.length; lcv++){
            playerList.add(new Player(names[lcv].trim(), deck));
            playerViewList.add(new PlayerView(playerList.get(lcv)));
        }

        //add deck image
        BufferedImage deckImage = ImageIO.read(new File("src/images/deck.jpg"));
        //deckImage = deckImage.getScaledInstance(-1, gameFrame.getHeight()/2, Image.SCALE_FAST);
        int newWidth = resize(deckImage.getHeight(), gameFrame.getHeight()/2, deckImage.getWidth());
        BufferedImage newImage = new BufferedImage(newWidth,gameFrame.getHeight()/2 , BufferedImage.TYPE_INT_RGB);

        Graphics g = newImage.createGraphics();
        g.drawImage(deckImage, 0, 0,newWidth , gameFrame.getHeight()/2, null);
        g.dispose();


        JLabel deckLabel = new JLabel(new ImageIcon(newImage));
        JPanel panel = new JPanel();
        panel.add(deckLabel);
        Image lastCardImage = ImageIO.read(new File("src/images/defuse/Laser-Pointer.jpg"));
        lastCardImage = lastCardImage.getScaledInstance(-1, gameFrame.getHeight()*2/3, Image.SCALE_FAST);
        JLabel lastCardLabel = new JLabel(new ImageIcon(lastCardImage));
        panel.add(lastCardLabel);
        gameFrame.setLayout(new BorderLayout());
        gameFrame.add(panel, BorderLayout.CENTER);
    }

    public static int resize(int old1, int new1, int old2){
        double proportion = new1*1.0/old1;
        return (int) (old2*proportion);
    }
}
