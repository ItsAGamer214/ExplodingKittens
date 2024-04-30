package interfaces;


import javax.swing.*;
import java.io.IOException;

public  interface Card {
    void play();
    boolean isNopeable();
    ImageIcon[] getImages() throws IOException;
}
