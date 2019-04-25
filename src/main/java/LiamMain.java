import java.util.ArrayList;
import java.util.Random;

public class LiamMain {

    public static void main(String args[]){

        CurveSketching fxPow1 = new CurveSketching(-1d,1d);
        CurveSketching fxPow2 = new CurveSketching(1d,0d,-1d);
        CurveSketching fxPow1Rnd = new CurveSketching(1,10);
        CurveSketching fxPow2Rnd = new CurveSketching(2,10);

        System.out.println(fxPow1.toString());
        System.out.println(fxPow2.toString());
        System.out.println(fxPow1Rnd.toString());
        System.out.println(fxPow2Rnd.toString());
    }

}
