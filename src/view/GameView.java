package view;

import javax.swing.*;

public class GameView extends JFrame {

    public GameView(){
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Exploding Kittens");
    }
}
