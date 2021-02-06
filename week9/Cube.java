package week9;
public class Cube extends Rectangle {
    private int surfaeArea;
    private int a;

    public Cube( int width, int length, int a) {
        super(width, length);
        this.a = a;
    }
    public String toString() {
        surfaeArea = 6 * a * a;
        return " This is a cube a side of [length] and the area of cube is " + surfaeArea; // area = 6 * a * a
    }

    
}
