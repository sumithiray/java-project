package Controller;
import Shapes.Circle;
import interfaces.Shapes;

public class CircleController implements Shapes{

    //int radius;
    float ans=0.0f;
    public float areacircle(int r) {
        Circle c=new Circle();
        c.setRadius(r);
        ans= PI*c.getRadius()*c.getRadius();
        return ans;
    }


}