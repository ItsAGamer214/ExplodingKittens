package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class GameView extends JFrame {

    public JDesktopPane desktopPane;
    public JInternalFrame gameFrame;
    public JPanel gamePanel;
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
        JLabel deckLabel = new JLabel(new ImageIcon(deckImage));
        gamePanel = new JPanel();
        gamePanel.add(deckLabel);
    }

    public int getNumPlayers(){
        return Integer.parseInt(JOptionPane.showInputDialog(this,
                "How many players?", 2));
    }
    public String getPlayerNames(){
        return JOptionPane.showInputDialog(this,
                "Enter names:\n (Add comma between each name)",null);
    }
}
