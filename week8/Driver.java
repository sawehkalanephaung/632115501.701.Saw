package week8;
public class Driver extends Person{
    String typeDriver;

    public Driver( String name, String gender, int age){
        this.name = name;
        this. age = age;
        this.gender = gender;
    }
    public void carDriver(){
        System.out.println( name + " is a " + typeDriver + " deriver " );
    }

}
