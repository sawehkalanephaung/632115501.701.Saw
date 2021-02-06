package week9;
public class Student {
   private String firstName = " Hello ";
   private String lastName = " World ";
   //overiding toString()
   public String toString(){
    return " my first name " + firstName+ " last name " + lastName;
}
public Student(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
}
public void introduce(){
    System.out.println(" My first name is " + firstName+ " last name is " + lastName);
}
   public static void main(String[] args) {
       Student p = new Student(" Merry ", " Dhon");
       System.out.println(p.toString());
       
   }
}
