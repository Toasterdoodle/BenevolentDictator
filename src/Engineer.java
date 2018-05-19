/**
 * Created by student on 5/17/18.
 */
public class Engineer extends Person{

    //==========instance fields==========



    //==========constructor==========

    public Engineer(String name, String fileName){

        super(1, name, fileName);

    }//end Engineer

    //==========methods==========

    public void setLine(int lineNumber){

        if(lineNumber == 0){
            //introduction line

            addLine("Hey there, mate.");
            addLine("I am the engineer.");
            addLine("I will help you make decisions regarding our country's production capacity.");
            addLine("You will be able to spend our country's production on special projects.");
            addLine("As I always say, the best army is a well-equipped army.");
            addLine("Glory to the union.");

        }//end if

    }//end setLine

}//end class
