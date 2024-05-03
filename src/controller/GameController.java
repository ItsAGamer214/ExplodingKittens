package controller;

import interfaces.Card;
import model.Deck;
import model.Player;
import view.GameView;
import view.PlayerView;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

    public static void main(String[] args) throws IOException {
        GameView gameView = new GameView();
        int numPlayers = gameView.getNumPlayers();
        Deck deck = new Deck(numPlayers);
        List<Player> playerList = new ArrayList<>();
        List<PlayerView> playerViewList = new ArrayList<>();
        String[] names = gameView.getPlayerNames();
        for(int lcv = 0; lcv < names.length; lcv++){
            playerList.add(new Player(names[lcv].trim(), deck));
            playerViewList.add(new PlayerView(playerList.get(lcv)));
        }

        Image lastCardImage = ImageIO.read(new File("src/images/defuse/Laser-Pointer.jpg"));
        lastCardImage = lastCardImage.getScaledInstance(-1, gameView.gameFrame.getHeight()/2, Image.SCALE_DEFAULT);
        JLabel lastCardLabel = new JLabel(new ImageIcon(lastCardImage), SwingConstants.CENTER);
        gameView.gamePanel.add(lastCardLabel, BorderLayout.CENTER);
        gameView.gameFrame.setLayout(new BorderLayout());
        gameView.gameFrame.add(gameView.gamePanel, BorderLayout.CENTER);
        gameView.gameFrame.setVisible(true);
        gameView.playerFrame.setLayout(new BorderLayout());
        gameView.addPlayers();
        gameView.playerFrame.add(gameView.playerView, BorderLayout.CENTER);
        gameView.playerFrame.setVisible(true);
    }
}
