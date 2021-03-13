package week13;
public class Rectangle extends Shape {
   int width;
   int length;

   // defalult contructor
   public Rectangle(int width, int length){
       this.width = width;
       this.length = length;
   }

   // width getting method
public int getWidth() {
    return width;
}
// width setting method
public void setWidth(int width) {
    this.width = width;
}
// length getting metod
public int getLength() {
    return length;
}
// length setting method
public void setLength(int length) {
    this.length = length;
}
// getArea method
public double getArea(){
    return width * length;
}
}
