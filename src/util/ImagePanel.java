package util;

import view.GameView;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel {
    ImageIcon image;
    Image pic;
    public ImagePanel(){
        pic = new BufferedImage(1,1,1);
        image = new ImageIcon(pic);
    }

    public void setImage(String path, GameView gameView) throws IOException {
        pic = ImageIO.read(new File(path));
        pic = pic.getScaledInstance(-1, gameView.gameFrame.getHeight()/2, Image.SCALE_DEFAULT);
        image = new ImageIcon(pic);
    }
}
