package Base;

import Controller.CircleController;
import Controller.TriangleController;
public class Driver {
    public static void main(String args[]) {
        int radius=3;
        CircleController cs=new CircleController();
        float answer = cs.areacircle(radius);
        System.out.println(answer);

        float length=5.0f;
        float wid=8.0f;
        TriangleController tc=new TriangleController();
        float answer2=tc.isolate(length,wid);
        System.out.println(answer2);


    }

}