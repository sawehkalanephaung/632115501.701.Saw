package week9;
public class Rectangle extends Shape{
    private int width;
    private int length;
    private int area;
    private int perimeter;
    
    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public String toString() {
        area = width * length;
        perimeter = 2 * width + length;
        return "This is a rectangle with width as [width] and height as [height] area is "
        + area + " perimeter is  " + perimeter;
    }
}
