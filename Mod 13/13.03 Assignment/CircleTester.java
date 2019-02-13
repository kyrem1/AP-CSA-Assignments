
/**
 * Client Class to test the circle classes.
 * 
 * @author James Harbour
 * @version 2/4/19
 */
import java.util.ArrayList;
public class CircleTester
{
    public static void main(String[] args) {
        //Initialize Circle Classes
        Circle2 circle = new Circle2(2, 3, 5);
        Cylinder2 cyl = new Cylinder2(1, 2, 3, 5);
        Oval2 oval = new Oval2(1, 1, 6, 5);
        OvalCylinder2 ovalcyl = new OvalCylinder2(2, 2, 7, 5, 3);
        
        //Add Circles to new Arraylist
        ArrayList<Circle2> circles = new ArrayList<Circle2>();
        circles.add(circle);
        circles.add(cyl);
        circles.add(oval);
        circles.add(ovalcyl);
        
        //Iterate over ArrayList and showCenter
        for(Circle2 c : circles) {
            showCenter((Circle2)c);
        }
        
    }
    
    public static void showCenter(Circle2 c) {
        System.out.println("For this " + c.getName() + " the " + c.getCenter());
    }
}
