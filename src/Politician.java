/**
 * Created by student on 5/17/18.
 */
public class Politician extends Person{

    //==========instance fields==========



    //==========constructor==========

    public Politician(String name, String fileName){

        super(4, name, fileName);

    }//end Politician

    //==========methods==========

    public void addLines(int lineNumber){

        if(lineNumber == 0){
            //introduction line

            addLine("Why hello there, sir.");
            addLine("I am the politician.");
            addLine("I will help you make decisions regarding the people.");
            addLine("We must try our best to keep war support high, and make sure that the people are productive.");
            addLine("As all good leaders know, a war is always lost on the homefront before the war front.");
            addLine("The people of the Boolanian Union stand behind you.");

        }//end if

    }//end setLine

}//end class
