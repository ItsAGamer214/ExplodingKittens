package view;

import javax.swing.*;

public class GameView extends JFrame {

    public GameView(){
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Exploding Kittens");
    }
}
