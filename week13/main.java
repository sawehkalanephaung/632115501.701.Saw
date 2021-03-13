package week13;
public class main {
    public static void main(String[] args) {
        Shape Circle = new Circle(2);
        Shape Rectangle = new Rectangle(22, 44);
        Shape Triangle = new Triangle(4, 10);

        
        System.out.println(" The circle area is " + Circle.getArea());
        System.out.println(" The rectangle area is " +Rectangle.getArea());
        System.out.println(" the triangle area is " + Triangle.getArea());


    }
}
