package view;

import interfaces.Card;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class GameView extends JFrame {

    public int numPlayers;
    public JDesktopPane desktopPane;
    public JInternalFrame gameFrame;
    public JPanel gamePanel;
    public JButton deckButton;
    public JTabbedPane playerView;
    public GameView() throws IOException {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Exploding Kittens");
        desktopPane = new JDesktopPane();
        add(desktopPane, BorderLayout.CENTER);
        gameFrame = new JInternalFrame("Game", true, false, false, true);
        gameFrame.setBounds(0,0,this.getWidth(), this.getHeight()/2);
        desktopPane.add(gameFrame);
        Image deckImage = ImageIO.read(new File("src/images/deck.jpg"));
        deckImage = deckImage.getScaledInstance(-1, gameFrame.getHeight()/2, Image.SCALE_DEFAULT);
        deckButton = new JButton(new ImageIcon(deckImage));
        gamePanel = new JPanel();
        gamePanel.add(deckButton);
        playerView = new JTabbedPane();
    }

    public int getNumPlayers(){
        numPlayers = Integer.parseInt(JOptionPane.showInputDialog(this,
                "How many players?", 2));
        return numPlayers;
    }
    public String getPlayerNames(){
        return JOptionPane.showInputDialog(this,
                "Enter names:\n (Add comma between each name)",null);
    }

    public void addPlayer(){
        for(int lcv = 0; lcv < numPlayers; numPlayers++){
            playerView.addTab("Anish", new JPanel());
        }
    }
}
