package lab6;
import week4.Circle;
public class TestCircle2 {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);

    System.out.println(" The area of the circle of radious" 
    +myCircle.getRadious()+ " is " +myCircle.getArea());

    myCircle.setRadious(myCircle.getRadious()*1.1);
    System.out.println(" The area of the circle is" 
    +myCircle.getRadious()+ " is " +myCircle.getArea());

    // test 1
    System.out.println(myCircle.getRadious());

    // test 2
    System.out.println(myCircle.getNumberOfObjects());

    // test 3 
    System.out.println(" The number of object is " 
    +myCircle.getNumberOfObjects());

    // test 4
    myCircle.setNumberOfObjects(10);
   System.out.println(" The number of object is " 
    + myCircle.getNumberOfObjects());

    // test 5 color
    System.out.println(" The color of object is " 
    +myCircle.getColor());

    }
}
