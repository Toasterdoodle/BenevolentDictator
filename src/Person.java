import com.sun.org.apache.xerces.internal.xs.StringList;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.stream.Stream;
import javax.imageio.ImageIO;

/**
 * Created by student on 5/16/18.
 */

public class Person {

    //=======instance fields=======

    private BufferedImage pic;

    private int partyMan;
    //determines what type of person he is
    //6 in total
    // (1) The general: military affairs
    // (2) The engineer: production for the military
    // (3) The scientist: research for new weapons and stuff
    // (4) The politician: represents the will of the people
    // (5) The spy: military intelligence
    // (6) The diplomat: represents foreign relations


    private ArrayList<String> line = new ArrayList<String>();
    //determines what the person is going to say
    //there is going to be an array of things for the person to say
    //when the person finishes saying that thing, that string will be removed, and the next string will be said.

    private String name, fileName;

    private ArrayList<Integer> interactions = new ArrayList<Integer>();
    //this will contain all past interactions
    //interactions will always be two numbers
    //first number represents the request
    //second number represents whether the player said yes or no

    private boolean meeting;
    //determines whether the current mans is meeting with the player

    //=======constructor=======

    public Person(int partyMan, String name, String fileName){

        try{

            pic = ImageIO.read(new File("res/" + fileName));

        }//end try
        catch(Exception e){

            e.printStackTrace();

        }//end catch

        this.partyMan = partyMan;
        this.name = name;
        this.fileName = fileName;

    }//end Person

    //==========methods==========


    public BufferedImage getPic() {

        return pic;

    }//end getPic

    //--------------------

    public void setPic(BufferedImage pic) {

        this.pic = pic;

    }//end setPic

    //--------------------

    public void addInteraction(int interaction){

        interactions.add(interaction);

    }//end addInteraction

    //--------------------

    public int getSpecificInteraction(int index){
        //gets the interaction at a specific index

        if(index >= 0 && index < interactions.size()){

            return interactions.get(index);

        }//end if
        else{

            return -1;

        }//end else

    }//end getSpecificInteractions

    //--------------------

    public boolean getContains(int number){
        //sees if interactions contains the wanted number

        if(interactions.contains(number)){

            return true;

        }//end if
        else{

            return false;

        }//end else

    }//end getContains

    //--------------------

    public boolean isMeeting() {

        return meeting;

    }//end isMeeting

    //--------------------

    public void setMeeting(boolean meeting) {

        this.meeting = meeting;

    }//end setMeeting

    //--------------------

    public String getLine(int index) {

        return line.get(index);

    }//end getLine

    //--------------------

    public void addLine(String something) {

        line.add(something);

    }//end setLine

    //--------------------

    public void removeLine(int index){

        line.remove(index);

    }//end removeLine

}//end class Person
