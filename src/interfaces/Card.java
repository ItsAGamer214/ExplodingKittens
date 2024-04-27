package interfaces;


import javax.swing.*;

public  interface Card {
    void play();
    boolean isNopeable();
    ImageIcon[] getImages();
}
