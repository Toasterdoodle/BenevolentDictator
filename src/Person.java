import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * Created by student on 5/16/18.
 */

public class Person {

    //=======instance fields=======

    private BufferedImage pic;

    private int minister;
    //determines the ministers

    //=======constructor=======

    public Person(int minister){

        try{

            pic = ImageIO.read(new File("res/" + "placeholders"));

        }//end try
        catch (Exception e) {

            e.printStackTrace();

        }//end catch

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


}//end class Person
