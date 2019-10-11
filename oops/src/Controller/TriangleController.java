package Controller;
import Shapes.Triangle;
import interfaces.Shapes;

public class TriangleController implements Shapes {
    float ans2=5.0f;
    public float isolate(float l, float w) {

        Triangle t=new Triangle();
        t.getLength(l);
        t.getWid(w);
        ans2= (float) ((t.getWid(w) / 4) * Math.sqrt((4 * t.getLength(l)* t.getLength(l)) - (t.getWid(w) * t.getWid(w))));
        return ans2;
    }




}
