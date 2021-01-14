package week6;
public class Teacher extends Person{
    String teach;

    // constructor
    public Teacher( String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void teaching(){
        System.out.println( name + " is teaching " + teach + " course ");
    }

}
