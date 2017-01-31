import com.sun.scenario.effect.Effect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

/**
 * Created by Zahra_D on 1/30/2017.
 */
public class Menu extends JComponent{


    private JLabel start ;
    private JButton setting;
    private JButton exite;
    private JButton store;
    private JButton garage;


    public Menu(){
       initMenu();
    }

    private void initMenu(){
        URL iconURL = getClass().getResource("image_2017-01-31_22-53-59.png");
        System.out.println(iconURL);
        ImageIcon icon = new ImageIcon(iconURL);
        Image img = icon.getImage() ;
        Image newimg = img.getScaledInstance( 500, 150,  java.awt.Image.SCALE_SMOOTH ) ;
        ImageIcon im = new ImageIcon( newimg );


        start = new JLabel(im);


       // start.setBorderPainted( false );
      start.setIcon(im);
        //start.setIcon(imageIcon);
        start.setLocation(10, 10);
        start.setSize(600, 200);
        // start.setBounds(0 , 0 , 600, 200);
        start.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

                start.setLocation(30 , 0);
                start.setBackground(new Color(250,188 , 115));
            }

            @Override
            public void mouseExited(MouseEvent e) {

                start.setLocation(0 , 0);
                start.setBackground(null);
            }
        });
        store = new JButton("store");
        store.setBorder(null);
        store.setBounds(0 , 150 , 500, 100);
        garage = new JButton("garage");
        garage.setBounds(0 , 300 , 500, 100);
        setting = new JButton("setting");
        setting.setIcon(im);
        setting.setBounds(0 ,450  , 500, 100);
        exite = new JButton("exit");
        exite.setBounds(0 , 600 , 500, 100);
        this.add(start);
        this.add(store);
        this.add(garage);
        this.add(setting);
        this.add(exite);






    }


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame frame = new JFrame("test");
                Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setPreferredSize(DimMax);

                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);





                JPanel panel = new StartPnel();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                panel.setLayout(null);
                Menu menu = new Menu();
                menu.setLocation(300 , 200);
                menu.setSize(700 , 700);
                panel.add(menu);



                frame.add(panel);
               // frame.setResizable(false);
                frame.pack();
            }
        });


    }

}
