package week7;
public class Circle {
    // assign varibles
    private double originX;
    private double originY;
    private double radius;


    // assign constructor
    public Circle(){
        originX = 0;
        originY = 0;
        radius = 0;
    }
    // assign constructor with multiple parameter
    public void setCircle( double x, double y, double r ){
        originX = x;
        originY = y;
        radius =r;
    }
    // return the radius value
    public double getRadius(){
        return radius;
    }
    // return origin x value
    public double getX(){
        return originX;
    }
    // return origin y value
    public double getY(){
        return originY;
    }

} //end class