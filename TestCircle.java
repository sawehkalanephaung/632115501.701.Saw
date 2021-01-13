package lab71;
public class TestCircle {
    // main method
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setCircle(0.0, 0.0, 2.0); // input value that given
        System.out.println(" The area of cirle 1 is = " + getArea(c1.getRadius() ) );
        System.out.println(" The circumferrene of circle 1 is = " + getCircumference(c1.getRadius() ) );

        Circle c2 = new Circle();
        c2.setCircle(1.0, 2.0, 3.0); // input value that given
        // display circle 2 output
        System.out.println(" \n The area of circle 2 = " + getArea(c2.getRadius() ) );
        System.out.println(" \n The circumferrence of circle 2 = " + getCircumference(c2.getRadius() ) );

        Circle c3 = new Circle();
        c3.setCircle(3.0, 5.0, 1.0); // input the value that give
        // Display circle 3
        System.out.println(" \n The area of circle 3 = " + getArea(c3.getRadius() ) );
        System.out.println(" \n The circumferrence of circle 3 = " + getCircumference(c3.getRadius() ) );

        Circle c4 = new Circle( );
        c3.setCircle(-1.0, -10.0, -1.0); // input value that given
        // Display circle 4 
        System.out.println(" \n The area of circle 4 = " + getArea(c4.getRadius() ) );
        System.out.println(" \n The circumferrence of circle 4 = " + getCircumference(c4.getRadius() ) );


        // do compare circles
        System.out.println(" \n Is circle 1 intersect to  circle 2 : "
        + isIntersectTouch(c1.getX(), c2.getX(), c1.getY(),c2.getY(), c1.getRadius(), c2.getRadius()));
        System.out.println(" \n Is circle 1 intersect to circle 3 : "
        + isIntersectTouch(c1.getX(), c3.getX(), c1.getY(), c3.getY(), c1.getRadius(), c3.getRadius()));
    }

    // do calculation to get area of circle
    public static double getArea ( double r ){
        double area = Math.PI * ( Math.pow ( r,2 ) );
         return area;
     }
     // do calucation to get circumference of circle
     public static double getCircumference ( double r ){
        double  circumference = 2 * ( Math.PI ) * r;
         return circumference;
     }
     // do if statement boolean 
     public static boolean isIntersectTouch(double x1,double x2,double y1, double y2,double r1,double r2){
         double Circles  = Math.sqrt ( ( Math.pow ( (x2-x1), 2) ) + ( Math.pow (y2-y1, 2) ) );
         // do boolean to test which circle is true or false
         boolean result;
         if ( Circles < (r1+r2) )
         result = true;
         else
         result = false;
         return result;
     }

}