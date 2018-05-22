/**
 * Created by student on 5/17/18.
 */
public class General extends Person{

    //==========instance fields==========



    //==========constructor==========

    public General(String name, String fileName){

        super(1, name, fileName);

    }//end General

    //==========methods==========

    public void addLines(int lineNumber){

        if(lineNumber == 0){
            //introduction line

            addLine("Reporting for duty, sir.");
            addLine("I am the general.");
            addLine("I will help you make decisions regarding tactics and fighting.");
            addLine("Our troops require leadership, sir, and if we play our cards right, we can deal the enemy a heavy blow.");
            addLine("The situation may seem dire as of right now, but I can feel the tides of the war beginning to turn.");
            addLine("Long live the Boolanian Union.");

        }//end if

    }//end setLine

}//end class
