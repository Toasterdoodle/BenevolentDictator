import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 * Created by Michael Chen on 5/8/18.
 */

public class Window extends JPanel {

    //=====instance fields=====

    private int width, height, size;

    private int voting = 0;
    //0 represents needing a vote
    //1 represents yes
    //2 represents no

    private ArrayList<Person> speakerList = new ArrayList<>();

    private boolean speaking = false;
    //determines whether someone is speaking to you or not

    private int fps = 60;//determines how many frames per second game will run at

    private Font defaultFont = new Font("Times New Roman", Font.ITALIC + Font.BOLD, 50);

    private int vp = 500;//stands for victory points
    //if victory points is 1000, the player wins
    //if victory points is 0, the player loses, and GAME OVER

    private int production = 200;
    //this will be the currency of the game
    //you can spend production on stuff

    private int strength = 50;
    //strength will either increase or decrease vp by strength/10

    private Person currentSpeaker;
    //designates who is currently speaking


    //----------timer----------
    Timer timer = new Timer(1000 / fps, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            //stuff in here will run 60 times every second

            repaint();

        }//end actionPerformed

    });//end timer

    //-----setting up buttons-----

    JButton no = new JButton("No");

    JButton yes = new JButton("Yes");

    //==========constructor==========

    public Window(int w, int h){

        setSize(w, h);

        this.width = w;
        this.height = h;

        setUpMouseListener();

        setUpButtons();

        timer.start();

        setBackground(new Color(241, 238, 144));

    }//end Window

    //==========methods==========

    public void paintComponent(Graphics g){
        //THE ALMIGHTY PAINTCOMPONENT

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        if(speaking){

            //draw speech box
            g2.setColor(new Color(99, 99, 99));
            g2.fillRect(20, 510, 760, 250);

            g2.setColor(new Color(212, 212, 212));
            g2.fillRect(30, 520, 740, 230);



        }//end if

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

                System.out.println(x + ", " + y);

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

    public void setUpButtons(){

        //-----setting up buttons-----

        yes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                voting = 1;

                System.out.println(voting);

            }//end actionPerformed

        });//end addActionListener

        no.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                voting = 2;

                System.out.println(voting);

            }//end actionPerformed

        });//end addActionListner

        //changes look and feel
        try{

            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );

        }//end try
        catch (Exception e) {

            e.printStackTrace();

        }//end catch

        setLayout(null);

        int buttonWidth = 200;
        int buttonHeight = 100;

        yes.setSize(new Dimension(buttonWidth, buttonHeight));
        no.setSize(new Dimension(buttonWidth, buttonHeight));

        yes.setVisible(true);
        no.setVisible(true);

        yes.setBorderPainted(true);
        no.setBorderPainted(true);

        yes.setOpaque(true);
        no.setOpaque(true);

        yes.setBackground(new Color(113, 214, 84));
        no.setBackground(new Color(255, 91, 93));

        yes.setLocation(200 - buttonWidth / 2, 20);
        no.setLocation(600 - buttonWidth / 2, 20);

        yes.setFont(defaultFont);
        no.setFont(defaultFont);

        add(yes);
        add(no);

    }//end setUpButtons

    //--------------------

    public void setUpPeople(){
        //sets up the people in the game

        General general = new General("The General", "placeholder");
        Diplomat diplomat = new Diplomat("The Diplomat", "placeholder");
        Scientist scientst = new Scientist("The Scientist", "placeholder");
        Politician politician = new Politician("The Politician", "placeholder");
        Spy spy = new Spy("The Spy", "placeholder");
        Engineer engineer = new Engineer("The Engineer", "placeholder");

    }//end setUpPeople

}//end class