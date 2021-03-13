package week13;
public class Circle extends Shape{
    int radious;

    // constructor 
    public Circle ( int radious){
        this.radious = radious;
     
    }
    // getting method
    public int getRadious() {
        return radious;
    }
    // setting method
    public void setRadious(int radious) {
        this.radious = radious;
    }
    public double getArea(){
        return radious * radious * Math.PI;
    }

    
}
