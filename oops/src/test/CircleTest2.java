package test;

import Shapes.Circle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CircleTest2 {
    @Test
    public void TestCircle(){
        Circle cc=new Circle();
        cc.setRadius(3);
        int actualvalue=cc.getRadius();
        assertEquals(3,actualvalue);
        assertNotEquals(2,actualvalue);
    }
}
