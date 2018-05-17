import javax.swing.*;
import java.awt.*;

/**
 * Created by Michael Chen on 5/8/18.
 */

public class Main extends JPanel {

    public static void main(String[] args) {

        //===========Jframe==========
        JFrame frame = new JFrame("War of Resistance");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        int width = 800;
        int height = 800;
        frame.setPreferredSize(new Dimension(width, height + 22));

        //============JPanel===========
        JPanel panel = new Window(width, height);
        panel.setFocusable(true);
        panel.grabFocus();

        //============JFrame============
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }//end psvm

}//end class