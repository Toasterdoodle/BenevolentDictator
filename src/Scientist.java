/**
 * Created by student on 5/17/18.
 */
public class Scientist extends Person{

    //==========instance fields==========



    //==========constructor==========

    public Scientist(String name, String fileName){

        super(3, name, fileName);

    }//end Scientist

    //==========methods==========

    public void addLines(int lineNumber){

        if(lineNumber == 0){
            //introduction line

            addLine("Hello, sir.");
            addLine("I am the scientist.");
            addLine("I will help you make decisions regarding weapons research and the development of new weapons.");
            addLine("Having stronger weapons will give us more strength, and allow us to fight better.");
            addLine("With the power of science, we will drive back these Nachurian savages.");
            addLine("Victory shall belong to us.");

        }//end if

    }//end setLine

}//end class
