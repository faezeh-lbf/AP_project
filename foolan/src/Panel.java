import javax.swing.*;
import java.awt.*;

/**
 * Created by Zahra_D on 1/30/2017.
 */
public class Panel extends JPanel {


    JPanel p = new JPanel();
    public Panel (){

        p.setBackground(Color.black);
       p.setBounds(200, 200, 200,200);
       this.add(p);


    }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame frame = new JFrame("test");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setPreferredSize(new Dimension(600 , 600));

                Panel panel = new Panel();

                panel.setBackground(Color.yellow);

                frame.add(panel);
                frame.pack();

            }
        });

    }

}
