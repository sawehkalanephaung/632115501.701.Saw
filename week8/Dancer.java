package week8;

public class Dancer extends Person {
    String dance;

    public Dancer( String name, String gender, int age){
        this.name =name;
        this.age = age;
        this.gender = gender;
    }

    // assign Dacne style

    public void danceSyle(){
        System.out.println( name + " is a " + dance + " dancer " );
    }
    
}
