import javafx.scene.image.*;

import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Zahra_D on 1/31/2017.
 */
public class StartPnel extends JPanel {
    private Menu menu;
    private Image backgroundImage ;

    public StartPnel(){
        this.init();
    }

    private void init(){
        backgroundImage = new ImageIcon(getClass().getResource("untitled.png")).getImage();

    }


    protected void paintComponent(Graphics g) {
        g.drawImage(backgroundImage,0,0,4000, 2500 ,null); // Draws the logo

    }

}
