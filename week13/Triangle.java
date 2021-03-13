package week13;
public class Triangle extends Shape{
    int base;
    int hieght;
    // default constructor
    public Triangle( int base, int hieght){
        this.base = base;
        this.hieght = hieght;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getHieght() {
        return hieght;
    }
    public void setHieght(int hieght) {
        this.hieght = hieght;
    }
    public double getArea(){
        return base * hieght / 2;
    }
}
