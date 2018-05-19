/**
 * Created by student on 5/17/18.
 */
public class Diplomat extends Person{

    //==========instance fields==========



    //==========constructor==========

    public Diplomat(String name, String fileName){

        super(6, name, fileName);

    }//end Diplomat

    //==========methods==========

    public void setLine(int lineNumber){

        if(lineNumber == 0){
            //introduction line

            addLine("Hello there, comrade.");
            addLine("I am your diplomat.");
            addLine("I will help you make decisions regarding our allies as well as neutral countries.");
            addLine("I will also try my best to help you stay informed on global politics.");
            addLine("Together, with our allies, we shall win this war.");
            //testing commit function

        }//end if

    }//end setLine

}//end class
