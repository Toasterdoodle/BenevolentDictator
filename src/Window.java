import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Michael Chen on 5/8/18.
 */

public class Window extends JPanel {

    //=====instance fields=====

    private int width, height, size;

    private int fps = 60;//determines how many frames per second game will run at

    //==========constructor==========

    public Window(int w, int h){

        setSize(w, h);

        this.width = w;
        this.height = h;

        setUpMouseListener();

        timer.start();

    }//end Window

    //----------timer----------
    Timer timer = new Timer(1000 / fps, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            //stuff in here will run 60 times every second

            repaint();

        }//end actionPerformed

    });//end timer

    //==========methods==========

    public void paintComponent(Graphics g){
        //THE ALMIGHTY PAINTCOMPONENT

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

    }//end paintComponent

    //--------------------

    public void setUpMouseListener(){

        addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }//end mouseClicked

            @Override
            public void mousePressed(MouseEvent e) {

                //finds the x and y position of the cursor
                int x = e.getX();
                int y = e.getY();

            }//end mousePressed

            @Override
            public void mouseReleased(MouseEvent e) {

            }//end mouseReleased

            @Override
            public void mouseEntered(MouseEvent e) {

            }//end mouseEntered

            @Override
            public void mouseExited(MouseEvent e) {

            }//end mouseExited

        });

    }//end setUpMouseListener

    //--------------------

}//end class