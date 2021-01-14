package week6;

import jdk.javadoc.internal.tool.DocEnvImpl;

public class Actor extends Person{
    String genre;
    // constructor
    public Actor( String name , String gender, int age){
        this.name = name;
        this.age = age;
        this.gender= gender;
    }
    // print actor
    public void actTpye(){
        System.out.println( name + " is a " + genre + " actor ");
    }
   
}
