/**
 * Used In: Question 1
 * <p>The class Rectangle includes the void methods: calcArea and calcPerimeter.
 *      The calcArea method takes two integer parameters for length and width,
 *      calculates the area of a rectangle, and assigns the value to a private instance variable.
 *      The calcPerimeter method takes two integer parameters for length and width, calculates the
 *      perimeter of a rectangle, and assigns the value to a private instance variable. The Rectangle
 *      class also includes two getter methods, which return the calculated values. The Rectangle class
 *      implements the Calculatable interface, which also contains calcArea and calcPerimeter.
 *      Write the Rectangle class and the Calculatable interface. (12 points)</p>
 * @author James Harbour
 */

public class Rectangle implements Calculatable1 {
    private int area;
    private int perimeter;

    public Rectangle() {

    }

    @Override
    public void calcArea(int length, int width) {
        this.area = length * width;
    }

    @Override
    public void calcPerimeter(int length, int width) {
        this.perimeter = 2 * (length + width);
    }

    public int getArea() {
        return this.area;
    }

    public int getPerimeter() {
        return this.perimeter;
    }
}
