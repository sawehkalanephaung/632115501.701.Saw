package lab6;
public class Circle{
    private double radious = 1;
    private static int numberOfObjects = 0;
    private String color = " Red ";

    public Circle(){
        numberOfObjects++;
    }
    public Circle(double newRadious){
        radious = newRadious;
        numberOfObjects++;
    }
    public  double getRadious(){
        return radious;
    }
    public void setRadious(double newRadious){
        radious = ( newRadious >= 0) ? newRadious : 0;
    }
    public int getNumberOfObjects(){
        return numberOfObjects;

    }
    public void setNumberOfObjects( int number){
        numberOfObjects = number;
    }
    public double getArea(){
        return radious * radious * Math.PI;
    }
    //return color
    public String getColor(){
        return color;
    }
    // assign color or set color
    public void setColor(String newColor){
        color = newColor;
    }

}