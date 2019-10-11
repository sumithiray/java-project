package test;

import Controller.CircleController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CircleTest {

    @Test
    public void circleControllerTest(){
        CircleController c = new CircleController();
        float actualValue = c.areacircle(3);
        assertEquals(28.26,actualValue,0.1);
    }
}
