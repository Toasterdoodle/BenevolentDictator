/**
 * Created by student on 5/17/18.
 */
public class Spy extends Person{

    //==========instance fields==========



    //==========constructor==========

    public Spy(String name, String fileName){

        super(5, name, fileName);

    }//end Spy

    //==========methods==========

    public void setLine(int lineNumber){

        if(lineNumber == 0){
            //introduction line

            addLine("Hello, comrade.");
            addLine("I am the Spy.");
            addLine("I will help you make decisions regarding sabotage and espionage.");
            addLine("Through our covert operations, we will be able to immensely affect the tide of the war.");
            addLine("Intelligence is power.");
            addLine("The Boolanian Union's might shall be unstoppable.");

        }//end if

    }//end setLine

}//end class
